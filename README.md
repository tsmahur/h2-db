# score H2 database
  This ms is to store Score in a virtual DB.

### pre-config H2 (oprional - can be used add pre-configured data before start of application) 
	put the script under /src/main/resources/
	schema.sql -> create table - schemas script
	data.sql -> add data to tables script
##
### Dependency
    h2,jpa,web,lombok

### application.yml
    spring.h2.console.enabled=true
	spring.h2.console.path=/h2-console
	spring.datasource.url = jdbc:h2:mem:scoreDB

### main application class
    NA

### EndPoints - H2 Database Consloe
	Open in Browser http://localhost:8080/h2-console/
	Connection String to DB : jdbc:h2:mem:scoreDB (find temporary url from console if not defined in properties)
	

### EndPoints - API
    POST http://localhost:8080/score
    {
    "status":"active",
    "score":95,
    "type":"test2"
	}

    GET http://localhost:8080/score/1
	
	PUT http://localhost:8080/score/1
	{
    "score": 20
	}
	
	
