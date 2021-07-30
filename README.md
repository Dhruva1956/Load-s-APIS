## REST API with Spring Boot and PostgreSQL.

#### To run this application use:

```bash
mvn spring-boot:run
```

#### To run this application in postman(BASIC:GET/POST):
In case of post please set BODY>raw>JSON
```bash
http://localhost:8080/api/v1/load
```
```bash
{
    "loadingPoint": "delhi",
	"unloadingPoint": "jaipur",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
    "comment": "hi"
}
```
#### To run this application in postman(GET “load/{loadId}”):
Query params - (shipperId)
Response:list of loads with this shipperId
#### To run this application in postman(PUT “load/{loadId}”):
```bash
{
	"loadingPoint": "alwar",
	"unloadingPoint": "jaipur",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
}
```

#### To run this application in postman(DELETE “load/{loadId}”):