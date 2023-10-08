# Spring Boot Application with MongoDb and Swagger

**Die Springboot Anwendung bemaechtig Personen anzulegen und nach diversen Attributen zu suchen. DazParagraph  
u bietet Sie an, Photos hoch- und runter zu laden.  
Die Daten werden in einer Mongo Datenbank gespeichert!**


## Docker

### Install Mongo Db per Docker:

**Erst die Container runterladen und installieren:**


     docker pull mongo  

- containerd.io_1.6.9-1_amd64.deb
- docker-buildx-plugin_0.11.2-1~ubuntu.22.04~jammy_amd64.deb
- docker-ce-cli_24.0.6-1~ubuntu.22.04~jammy_amd64.deb
- docker-ce_24.0.6-1~ubuntu.22.04~jammy_amd64.deb
- docker-compose-plugin_2.6.0~ubuntu-jammy_amd64.deb

anschliessend um die Db zu starten :

    sudo docker run -d --name mongodb -e MONGO_INIT_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=password -p 27017:27017 mongo

## Anschliessend Studio3t installieren : [Link](https://studio3t.com/knowledge-base/articles/how-to-install-studio-3t-on-linux/)

...als Database Client


## Implementierung

Maven Configuration

**pom.xml:**

   <?xml version="1.0" encoding="UTF-8"?>  
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"  
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">  
    <modelVersion>4.0.0</modelVersion>  
    <parent>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-parent</artifactId>  
    <version>2.7.2</version>  
    <relativePath/> <!-- lookup parent from repository -->  
    </parent>  
    <groupId>com.devguy.testshop</groupId>  
    <artifactId>springboot-mongodb-rest-java</artifactId>  
    <version>0.0.1-SNAPSHOT</version>  
    <name>springboot-mongodb-rest-java</name>  
    <description>springboot-mongodb-rest-java</description>  
    <properties>  
    <java.version>11</java.version>  
    </properties>  
    <dependencies>  
    <dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-data-mongodb</artifactId>  
    </dependency>  
    <dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-starter-web</artifactId>  
    </dependency>  
      
     <dependency> <groupId>org.projectlombok</groupId> <artifactId>lombok</artifactId> <optional>true</optional> </dependency> <dependency> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-test</artifactId> <scope>test</scope> </dependency>  
      
     <!--<dependency> <groupId>io.springfox</groupId> <artifactId>springfox-boot-starter</artifactId> <version>3.0.0</version> </dependency>--> <dependency> <groupId>io.springfox</groupId> <artifactId>springfox-swagger2</artifactId> <version>2.9.2</version> </dependency> <dependency> <groupId>io.springfox</groupId> <artifactId>springfox-swagger-ui</artifactId> <version>2.9.2</version> </dependency>  
      
      
     <!--<dependency> <groupId>org.springframework.security.oauth</groupId> <artifactId>spring-security-oauth2</artifactId> <version>2.3.4.RELEASE</version> </dependency>-->  
     <!--   <dependency> <groupId>org.springframework.security</groupId> <artifactId>spring-security-jwt</artifactId> <version>1.0.10.RELEASE</version> </dependency>-->  
      
     <dependency> <groupId>org.springframework</groupId> <artifactId>spring-web</artifactId> <version>5.3.30</version> </dependency><!--  
     <dependency> <groupId>org.springframework.security</groupId> <artifactId>spring-security-config</artifactId> <version>5.5.2</version> </dependency>-->  
      
     </dependencies>  
      
     <build> <plugins> <plugin> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-maven-plugin</artifactId> <configuration> <excludes> <exclude> <groupId>org.projectlombok</groupId> <artifactId>lombok</artifactId> </exclude> </excludes> </configuration> </plugin> </plugins> </build>  
    </project>


**Repository** : https://github.com/ottipc/springboot-mongodb-rest-java-color-digital/tree/main/src/main/java/com/devguy/testshop

Start from terminal :  `mvn spring-boot:run`

Swagger zum testen:

http://localhost:8080/swagger-ui.html



  
  
