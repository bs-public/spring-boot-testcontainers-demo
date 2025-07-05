package com;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

  @LocalServerPort
  private Integer port;

  @Autowired
  private UserRepository userRepository;

  @BeforeEach
  void setUp() {
    RestAssured.baseURI = "http://localhost:" + port;
    userRepository.deleteAll();
  }

  @Test
  void shouldGetAllCustomers() {
    List<User> users =
        List.of(
                new User(null, "User1", "user1@mail.com"),
                new User(null, "User2", "user2@mail.com"));
    userRepository.saveAll(users);

    given()
        .contentType(ContentType.JSON)
        .when()
        .get("/api/users")
        .then()
        .statusCode(200)
        .body(".", hasSize(2));
  }
}
