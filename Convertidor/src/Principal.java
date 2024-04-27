import com.google.gson.Gson;

import java.net.http.HttpClient;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HttpClient clienteHttp = HttpClient.newHttpClient();
        Gson gson = new Gson();
        ConversorMoneda conversorMoneda = new ConversorMoneda(clienteHttp, gson);

        while (true) {
            Menu menu = new Menu();
            System.out.println(menu.menuOpciones);

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 7) {
                System.out.println("Saliendo del programa. ¡Hasta la próxima!");
                break;
            }

            System.out.print("Ingrese el valor que desea convertir: ");
            double valorInicial = scanner.nextDouble();
            scanner.nextLine();

            String monedaInicial = obtenerMonedaInicial(opcion);
            String monedaDestino = obtenerMonedaDestino(opcion);

            double valorFinal = conversorMoneda.convertirMoneda(valorInicial, monedaInicial, monedaDestino);

            System.out.printf("El valor %.2f %s corresponde al valor final de %.2f %s%n", valorInicial, monedaInicial, valorFinal, monedaDestino);
        }
    }

    private static String obtenerMonedaInicial(int opcion) {
        return switch (opcion) {
            case 1 -> "USD";
            case 2 -> "ARS";
            case 3 -> "USD";
            case 4 -> "BRL";
            case 5 -> "USD";
            case 6 -> "COP";
            default -> throw new IllegalArgumentException("Opción de menú inválida.");
        };
    }

    private static String obtenerMonedaDestino(int opcion) {
        return switch (opcion) {
            case 1 -> "ARS";
            case 2 -> "USD";
            case 3 -> "BRL";
            case 4 -> "USD";
            case 5 -> "COP";
            case 6 -> "USD";
            default -> throw new IllegalArgumentException("Opción de menú inválida.");
        };
    }
}
