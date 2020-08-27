# Aplicacion para Android CityWeather desde Android Studio - JAVA
Ofrece la funcionalidad de pequeños efectos TextView y redireccionamiento a otras vistas, generando así tambien un cuadro de vista a cualquier Sitio Web :,)

Para acceder penweathermap.org y su respectivo API key, se debe de registrar en sitio obteniendo https://home.openweathermap.org/api_keys en ésta dirección la API Key.
Ingresando en https://openweathermap.org/current en mi caso elegí api.openweathermap.org/data/2.5/weather?q={city name}&appid={your api key} --> remplazando {city name} por el nombre de la ciudad y {your api key} por el API key. Generando así un resultado del API en JSON, para luego ser codificado el JAVA utilizando la libreria Retrofit.

Lista de Funciones de prueba satisfactoria:
* Compila sin errores
* genera los efectos necesarios en la vista por xml
* redirige a otra vista a ser generada
* Se visualiza un Widgets de otra Página del clima. Para no dejar en blanco, a travez de un WebView identificado en MainActivity para ser redireccionado a travez de un enlace.

Lista de problemas
* No me llega a consumir la API en android studio java :(
* Bonus no realizado
