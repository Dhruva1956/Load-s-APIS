## REST API with Spring Boot and PostgreSQL.

1. post "/load"
payload:
{
	"loadingPoint": "delhi",
	"unloadingPoint": "jaipur",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
        "comment": ""	
}
Response:loads details added successfully 

      2. GET “/load”

Query params - (shipperId)

Response:list of loads with this shipperId

GET “load/{loadId}”
PUT “load/{loadId}”
{
	"loadingPoint": "alwar",
	"unloadingPoint": "jaipur",
	"productType": "chemicals",
	"truckType": "canter",
	"noOfTrucks": "1",
	"weight": "100",
}
DELETE “load/{loadId}”


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
