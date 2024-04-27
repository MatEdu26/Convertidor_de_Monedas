import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorMoneda {

    private static final String URL_API = "https://v6.exchangerate-api.com/v6/e1643d60f196860ce7c54e0f/latest/";

    private HttpClient clienteHttp;
    private Gson gson;

    public ConversorMoneda(HttpClient clienteHttp, Gson gson) {
        this.clienteHttp = clienteHttp;
        this.gson = gson;
    }

    public double convertirMoneda(double valorInicial, String monedaInicial, String monedaDestino) {
        try {
            URI uri = URI.create(URL_API + monedaInicial);
            HttpRequest solicitud = HttpRequest.newBuilder()
                    .uri(uri)
                    .build();

            HttpResponse<String> respuesta = clienteHttp.send(solicitud, HttpResponse.BodyHandlers.ofString());

            if (respuesta.statusCode() == 200) {
                RespuestaTipoDeCambio respuestaTipoDeCambio = gson.fromJson(respuesta.body(), RespuestaTipoDeCambio.class);

                if (respuestaTipoDeCambio.getConversionRates() != null) {
                    Double ratioConversion = respuestaTipoDeCambio.getConversionRates().get(monedaDestino);
                    if (ratioConversion != null) {
                        return valorInicial * ratioConversion;
                    } else {
                        System.out.println("No se encontró el ratio de conversión para la moneda destino: " + monedaDestino);
                        return 0.0;
                    }
                } else {
                    System.out.println("La respuesta de la API no contiene los ratios de cambio.");
                    return 0.0;
                }
            } else {
                throw new RuntimeException("Error al obtener el ratio de cambio: " + respuesta.statusCode());
            }
        } catch (Exception e) {
            System.out.println("Error al convertir la moneda: " + e.getMessage());
            return 0.0;
        }
    }

}
