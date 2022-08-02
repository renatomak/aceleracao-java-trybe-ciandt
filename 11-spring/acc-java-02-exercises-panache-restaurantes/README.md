# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio


# Desafio: API de Restaurantes

Você está participando da construção de um app de entrega de comida. 🍕🍔 Como pessoa integrante do time de backend, terá a responsabilidade de construir a API que vai gerenciar os restaurantes. Essa API será um CRUD e deverá se conectar em um banco de dados H2.

Abaixo você confere os passos passados pela sua liderança (alinhados às solicitações da empresa cliente):

1. Execute o seguinte comando no terminal para criar seu projeto Quarkus:

```java
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create \
    -DprojectGroupId=com.betrybe \
    -DprojectArtifactId=restaurante-app \
    -DclassName="com.betrybe.RestauranteController" \
    -Dpath="/restaurante" \
    -Dextensions="resteasy-jackson, quarkus-resteasy-jsonb, quarkus-hibernate-orm-panache, quarkus-jdbc-h2"
```

2. Abra o projeto na IDE de sua preferência. No arquivo pom.xml, adicione a seguinte dependência:

```
<dependency>
    <groupId>io.quarkus</groupId>
    <artifactId>quarkus-hibernate-validator</artifactId>
</dependency>
```

3. Com o projeto aberto, crie a entidade `RestauranteEntity` dentro do pacote `com.betrybe.entity`. Ela deverá conter a anotação `@Entity` e terá os seguintes atributos:

   - id, com a anotação `@Id` e `@GeneratedValue`, com a estratégia `Identity`
   - nome, um campo do tipo `String` que deve conter a anotação `@Column`
   - descricao, um campo do tipo `String`, que deve conter a anotação `@Column`

4. Crie uma classe dto `RestauranteDTO` dentro do pacote `com.betrybe.dto`. Ela deverá conter dois atributos:

   - nome, um campo do tipo `String`. Ela deverá usar a notação `@NotBlank`
   - descrição, um campo do tipo `String`. Ela deverá usar as anotações `@NotBlank` e `@Size(3)`

5. Hora de fazer a camada de repositório. Crie a classe `RestauranteRepository` dentro do pacote `com.betrybe.repository`. Ela deverá apenas implementar a interface `PanacheRepositoryBase`. Certifique-se de passar para a interface os parâmetros corretos e de usar a anotação `@ApplicationScoped`.

6. Agora é hora de criar a classe `RestauranteService` dentro do package `com.betrybe.service`. Ela deverá estar anotada com `@ApplicationScoped` e deverá usar a classe `RestauranteRepository` via injeção de dependência. Essa classe deverá ter os seguintes métodos:

   - salvar(): deverá receber um `RestauranteDTO` como argumento e terá a anotação `@Transactional`
   - listar(): deverá retornar uma lista de `RestauranteEntity`
   - buscarPorId(): deverá receber um `Long` como argumento e fazer uma busca no banco com esse valor
   - atualizar(): deverá receber um `Long` e um `RestauranteDTO` como argumento. Ele deverá fazer uma busca no banco usando o id e atualizar os valores vindos no DTO. Terá a anotação `@Transactional`
   - deletar(): receberá um valor `Long` e deverá usá-lo para deletar um registro do banco. Terá a anotação `@Transactional` 

7. O comando que executamos no terminal criou o controller `RestauranteController`. Ele deverá usar a classe `RestauranteService` via injeção de dependências. Apague o método que foi criado pelo comando e crie cinco novos métodos:

    - listar(): método anotado com `@GET` e deverá retornar uma lista de restaurantes criados.
    - buscarPorId(): método anotado com `@GET` que obterá o id pela url e retornará o restaurante com esse id.
    - salvar(): método anotado com `@POST`. Deverá receceber como argumento um `RestauranteDTO` que deverá ser validado com `@Valid`.
    - atualizar(): método anotado com `@PATCH` que deverá obter o id da url e um `RestauranteDTO` como argumento, que deve ser validado com `@Valid`.
    - deletar(): método anotado com `@DELETE` que deverá obter o id da url e apagar o registro.

8. Hora de criar um filtro! Você deverá criar um filtro que interceptará o response para retornar o header:

```
X-Powered-By: Trybe
```

Após realizar o desafio, você saberá como criar APIs Rest completas utilizando Quarkus! Esse vai dar fome! 😋 #VQV

