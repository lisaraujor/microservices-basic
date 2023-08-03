# Basic Microservice (for study and testing purposes)

This repository contains a Java/SpringBoot microservices application consisting of three services:

1. **Eureka Service (Netflix Eureka)**: The Eureka service serves as a discovery server that allows microservices to register themselves and discover other services in the architecture dynamically.

2. **Gateway Service (Spring Cloud Gateway)**: The Gateway service acts as an API gateway, serving as the entry point for all incoming requests. It routes and filters the requests, forwarding them to the appropriate microservices based on defined rules.

3. **Initial Service (Test Service)**: The Initial Service is a sample microservice used for testing purposes. It is a simple service that provides one endpoint for basic functionality testing.

## Prerequisites

- Java JDK 11 or higher installed.
- Apache Maven build tool.
- Internet access (for downloading dependencies).

## Getting Started

Follow the steps below to get the microservices application up and running:

1. **Eureka Service (Port: 8010)**:

   - Navigate to the `eureka-service` directory.
   - Run the Eureka Service

2. **Initial Service (Port: 9000)**:

   - Navigate to the `initial-service` directory.
   - Run the Initial Service

3. **Gateway Service (Port: 8080)**:

   - Navigate to the `gateway-service` directory.
   - Run the Gateway Service

## Usage

Once all three services are running, you can access the Initial Service through the Gateway using the following URL: http://localhost:8080/initial-service/api/initial , where:
1. **http://localhost:8080** is the Gateway path
2. **/initial-service** is the name of the service you want to perform the request
3. **/api/initial** is the endpoint

The return should be something like:
**[{"id":1,"name":"Anne Mary","email":"anne.mary@email.com"},{"id":2,"name":"Luy Johnson","email":"luy.johnson@email.com"}]**
