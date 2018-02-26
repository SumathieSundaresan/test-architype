 Spring Boot Maven Archetype
=========================================

Summary
-------
The project is a Maven archetype for Spring Boot web application 
which has all common standards on place ready for development

- Java 1.8+
- Maven 3.3+
- Spring boot 1.5.6
- Swagger 2 API documentation



Installation
------------

To install the archetype in your local repository execute following commands:

```sh
$ git clone https://github.com/NBCUOTS/ot-service-template.git
$ cd spring-boot-quickstart-archtype
$ mvn clean install
```

Create a project
----------------

```sh
$ mvn archetype:generate \
     -DarchetypeGroupId=com.nbcuni.spring-boot-archetypes \
     -DarchetypeArtifactId=spring-boot-quickstart \
     -DarchetypeVersion=1.0.0 \
     -DgroupId=com.nbcuni \
     -DartifactId=ingest \
     -Dversion=1.0.0-SNAPSHOT \
     -DinteractiveMode=false
```



Test on the browser via SWAGGER and Version endpoint
-------------------

```sh
http://localhost:8080/swagger-ui.html
http://localhost:8080/version
```


