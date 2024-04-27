#Convertidor_de_Monedas

<h1>Hola, mi nombre es Matias</h1>

Este proyecto es una aplicación de consola que permite convertir valores entre diferentes monedas utilizando la API de tasas de cambio de Exchange Rate API.
Funcionalidades
Conversión de moneda entre las siguientes parejas:
USD a ARS
ARS a USD
USD a BRL
BRL a USD
USD a COP
COP a USD
Manejo de errores en caso de problemas con la API o la conversión.
Interfaz de usuario sencilla y amigable.
Tecnologías utilizadas
Java 11
Biblioteca Gson para el mapeo de objetos JSON
Clase HttpClient de Java para realizar solicitudes HTTP a la API
Estructura del proyecto
El proyecto está organizado en las siguientes clases:
Principal: Clase principal que maneja la interacción con el usuario, muestra el menú y llama a los métodos de conversión.
ConversorMoneda: Clase que se encarga de realizar las solicitudes HTTP a la API de tasas de cambio, procesar la respuesta y calcular la conversión de moneda.
RespuestaTipoDeCambio: Clase que representa la estructura de la respuesta JSON de la API de tasas de cambio.
Menu: Clase que contiene la definición del menú de opciones.
