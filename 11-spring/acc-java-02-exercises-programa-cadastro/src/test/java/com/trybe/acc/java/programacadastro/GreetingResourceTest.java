package com.trybe.acc.java.programacadastro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

  @Test
  @DisplayName("8 - Obtém o retorno do endpoint de echo.")
  public void testHelloEndpoint() {
    given()
            .when().get("/hello")
            .then().statusCode(200)
            .body(is("Hello RESTEasy"));
  }

}
