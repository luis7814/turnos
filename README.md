# turnos
Generación de turnos 

Microservicio en springboot, que genera los turnos de un servicio

#### Controller: Maneja la solicitud de entrada como servicio REST

#### Facade: Se encarga de registrar la información en las entidades de Comercio y Servicio

#### Service: Lógica de negocio de cada entidad.

#### Repository: Interfaz que interactua con la base de datos.

Al ejecutar la aplicación desde el IDE o ejecutando el jar, se deberá ingresar desde la siguiente url:

POST - http://localhost:8099/api/trade -> Registro de información en las tablas de Comercios y Servicios

{
    "idService": 1,
    "idTrade": null,
    "serviceName": "Prueba",
    "startTime": "2023-01-21T08:00:30",
    "endTime": "2023-01-21T16:45:30",
    "duration": 60,
    "nameTrade": "Comercio"
}


POST - http://localhost:8099/api/shift -> Generación de turnos.

{
    "startDate" : "2023-02-02",
    "endDate" : "2023-02-03",
    "idService" : 1
}

GET - http://localhost:8099/api/shift?id=1 -> Consulta de turnos por servicio


Al ser un servicio POST, se recomienda ejecutarlo desde POSTMAN.

Para visualizarlo desde swagger http://localhost:8099/swagger-ui/index.html

# Base de datos
- Se creo un procedimiento almacenado para la generación de los turnos
- Se crearon las tablas Turnos, Comercios y Servicios.
- En la ruta resources/sql, se encuentran los scripts.
 
