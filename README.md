# comment-system
A simple ajax comment-system built using spring boot, spring data jpa, hibernate, jquery

## How to run
1. Download zip or clone into your local machine
2. Import project into eclipse as a maven project
3. Change runtime environment as jdk 1.8
4. Setup database with schema name **content**. URL will be jdbc:mysql://localhost:3306/content
5. Modify **application.properties** file with your datasource information
6. run **mvn clean install** 
7. run **spring-boot:run**
8. Access the comment system client at **http://localhost:8080/client.html**

## Please provide feedback
Please email me at kishore5242@gmail.com if you have any feedback or suggestions
