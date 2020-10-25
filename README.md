# MasGlobalEmployees

Once you have cloned the repository: 

1.- `cd employees`

2.- `mvn spring-boot:run` (or you can also run the project from IntelliJ)

At this point the spring application should be up and running on port 8080

3.- `cd ../employees-client`

4.- `npm install`

5.- `npm run serve`


At this point the Employees UI should be served in your localhost and should be ready to use.



IMPORTANT: 

Port 8080 should be available for Tomcat before running `mvn spring-boot:run`, the BE application and FE application each run in their own domain, and the FE webapp is configured to consume the services at http://localhost:8080. 
