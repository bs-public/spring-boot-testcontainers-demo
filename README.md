# Spring Boot TestContainers Demo

### Prerequisites
 - Java 17+
 - Spring Boot 3.1+
 - A Docker environment supported by [Testcontainers](https://www.testcontainers.org/supported_docker_environment/)

### Reference Documentation

* [Spring Boot Testcontainers support](https://docs.spring.io/spring-boot/3.5.3/reference/testing/testcontainers.html#testing.testcontainers)
* [Testcontainers MySQL Module Reference Guide](https://java.testcontainers.org/modules/databases/mysql/)
* [Testcontainers](https://java.testcontainers.org/)

### Testcontainers support

This project uses [Testcontainers at development time](https://docs.spring.io/spring-boot/3.5.3/reference/features/dev-services.html#features.dev-services.testcontainers).

Testcontainers has been configured to use the following Docker image:

* [`mysql:8.4.5`](https://hub.docker.com/layers/library/mysql/8.4.5/images/sha256-a9885f5505512e670b35dca63672c93e84de5b38499ee0caa59565a05edc4e86)

