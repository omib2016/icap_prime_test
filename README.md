# Project requirements
a. JDK 1.8.0_40 or higher
b. Maven (v3.2.1 or higher) 

# Implementation notes
a. For quick development , I have leveraged spring-boot-starter-web libraries which enables developement of RESTful services with minimal effort.A production ready application however might want to leverage regular spring-mvc librabries and custom configuration along with appropriate property files - which I have avoided since this a sample test app.
b. The service once initialized supports querying of prime numbers using RESTful URI's as shown below:
  1. http://localhost:8080/getPrimeNumbers?limit=20
  2. http://localhost:8080/getPrimeNumbersUpto?max=100
  3. http://localhost:8080/getPrimeNumbersFrom?min=20&limit=20
  4. http://localhost:8080/getPrimeNumbersWithLimitAndRange?max=100&limit=20
  5. http://localhost:8080/getPrimeNumbersInRange?min=10&max=100
  6. http://localhost:8080/getPrimeNumbersInRangeAndLimit?min=11&max=97&limit=100&inclusive=true
c. I have leveraged Streams API from JDK 8 to generate the prime numbers.

# Build & deployment notes.
a. Clone the project using a Git client of your choice and then import the project (using an IDE of your choice) as a Maven project.This is required to ensure that all required project dependencies(external libabries) are downloaded using Maven.
b. Run "mvn clean install" from command line or directly from your IDE.
c. Post a successful build - run "mvn spring-boot:run" from command line or run PrimeNumberApp.main() method from an IDE. Spring boot will build the application and deploy to the war to the packaged web container(tomcat) and initialize the service.
d. One can invoke the service using the URI's as shown above from a browser.

 

