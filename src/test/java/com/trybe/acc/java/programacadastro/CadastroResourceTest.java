package com.trybe.acc.java.programacadastro;

import com.trybe.acc.java.programacadastro.bean.DadosCadastro;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CadastroResourceTest {

  @Test
  @DisplayName("1 - Cadastra um cliente com sucesso.")
  public void testCadastroSucesso() {
    DadosCadastro dados = new DadosCadastro();
    dados.setNome("Teste Cadastro");
    dados.setEmail("teste.cadastro@trybe.com");
    dados.setProtegido(true);

    given().body(dados).contentType(ContentType.JSON).post("/cadastro").then().statusCode(200);

  }

  @Test
  @DisplayName("2 - Tenta cadastrar um cliente sem nome e recebe dados inválidos.")
  public void testCadastroSemNome() {
    DadosCadastro dados = new DadosCadastro();
    dados.setNome(null);
    dados.setEmail("teste.cadastro@trybe.com");
    dados.setProtegido(true);

    given().body(dados).contentType(ContentType.JSON).post("/cadastro").then().statusCode(400);
  }

  @Test
  @DisplayName("3 - Tenta cadastrar um cliente com nome vazio e recebe internal server error.")
  public void testCadastroNomeVazio() {
    DadosCadastro dados = new DadosCadastro();
    dados.setNome("");
    dados.setEmail("teste.cadastro@trybe.com");
    dados.setProtegido(true);

    given().body(dados).contentType(ContentType.JSON).post("/cadastro").then().statusCode(500);
  }

  @Test
  @DisplayName("4 - Tenta obter um cadastro com id inválido e recebe bad request.")
  public void testObterSemId() {
    given().when().get("/cadastro/null").then().statusCode(400);
  }

  @Test
  @DisplayName("5 - Tenta obter um cadastro com id que não está cadastrado e recebe bad request.")
  public void testObterIdInexistente() {
    given().when().get("/cadastro/99999").then().statusCode(400);
  }

  @Test
  @DisplayName("6 - Tenta obter um cadastro protegido e recebe status 403.")
  public void testObterIdProtegido() {
    DadosCadastro dados = new DadosCadastro();
    dados.setNome("Teste Cadastro Protegido");
    dados.setEmail("teste.cadastro@trybe.com");
    dados.setProtegido(true);

    given().body(dados).contentType(ContentType.JSON).post("/cadastro");

    given().when().get("/cadastro/1").then().statusCode(401);
  }

  @Test
  @DisplayName("7 - Obtém um cadastro com sucesso.")
  public void testObterSucesso() {
    DadosCadastro dados = new DadosCadastro();
    dados.setNome("Teste Cadastro");
    dados.setEmail("teste.cadastro@trybe.com");
    dados.setProtegido(false);

    given().body(dados).contentType(ContentType.JSON).post("/cadastro");

    given().when()
            .get("/cadastro/2").then()
            .statusCode(200)
            .body("nome", is("Teste Cadastro"));
  }

}
