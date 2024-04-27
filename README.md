#Convertidor_de_Monedas

<h1>**Hola, mi nombre es *Matias* **</h1>

Este proyecto es una aplicación de consola que permite convertir valores entre diferentes monedas utilizando la API de tasas de cambio de Exchange Rate API.

<h2>Funcionalidades</h2>

Conversión de moneda entre las siguientes parejas:
<li>USD a ARS</li>
<li>ARS a USD</li>
<li>USD a BRL</li>
<li>BRL a USD</li>
<li>USD a COP</li>
<li>COP a USD</li>
<li>Manejo de errores en caso de problemas con la API o la conversión.</li>
<li>Interfaz de usuario sencilla y amigable.</li>


<h2>Tecnologías utilizadas</h2>
<li>Java 11</li>
<li>Biblioteca Gson para el mapeo de objetos JSON</li>
<li>Clase HttpClient de Java para realizar solicitudes HTTP a la API</li>


<h2>Estructura del proyecto</h2>
El proyecto está organizado en las siguientes clases:

<li>**Principal:** Clase principal que maneja la interacción con el usuario, muestra el menú y llama a los métodos de conversión.</li>
<li>**ConversorMoneda:** Clase que se encarga de realizar las solicitudes HTTP a la API de tasas de cambio, procesar la respuesta y calcular la conversión de moneda.</li>
<li>**RespuestaTipoDeCambio:** Clase que representa la estructura de la respuesta JSON de la API de tasas de cambio.</li>
<li>**Menu:** Clase que contiene la definición del menú de opciones.</li>
