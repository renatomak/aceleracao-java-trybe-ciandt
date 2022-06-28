package com.trybe.acc.java.testcontainers;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import com.trybe.acc.java.testcontainers.persistence.Produto;
import com.trybe.acc.java.testcontainers.persistence.ProdutoRepository;


@Testcontainers
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
public class ProdutoRepositoryTest {

  /**
   * Modifica a URI do adapter MongoDB do spring data para utilizar a URL do container MongoDB.
   * 
   * Por padrão, a URI utilizada é o `localhost:27017`.
   *
   */
  @Container
  private static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo");
  
  @Autowired
  private ProdutoRepository produtoRepository;
  
  private Produto produtoMock;
  private String produtoMockId;
  
    
  @DynamicPropertySource
  static void mongoDbProperties(DynamicPropertyRegistry registry) {
    registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
  }
  
  @BeforeEach
  void setUp() {
    produtoMock = mockProduto();
    produtoMockId = produtoMock.getId();
  }
  
  @AfterEach
  void cleanUp() {
    this.produtoRepository.deleteAll();
  }

  @DisplayName("1 - Deve cadastrar um novo produto com sucesso.")
  @Test
  void DeveCadastrarNovoproduto() {
    Produto result = this.produtoRepository.insert(produtoMock);
    
    Assertions.assertNotNull(result);
    
  }


  @DisplayName("2 - Deve listar todos os produtos com sucesso.")
  @Test
  void DeveListarTodosOsprodutos() {
    
    this.produtoRepository.insert(produtoMock);
    
    List<Produto> result = this.produtoRepository.findAll();
    
    Assertions.assertNotNull(result);
  }



  @DisplayName("3 - Deve buscar um produto pelo id com sucesso.")
  @Test
  void DeveBuscarprodutoPeloId() {
    this.produtoRepository.insert(produtoMock);
    
    Produto result = this.produtoRepository.findById(produtoMockId).get();
    
    Assertions.assertNotNull(result);
  }


  @DisplayName("4 - Deve atualizar um produto pelo id com sucesso.")
  @Test
  void DeveAtualizarprodutoPeloId() {
    this.produtoRepository.insert(produtoMock);
    
    Produto result = this.produtoRepository.findById(produtoMockId).get();
    result.setNome("Produto Update");
    result.setPreco(20L);
    
    Produto updateMock = this.produtoRepository.save(result);
    
    Assertions.assertNotNull(updateMock);
    
  }



  @DisplayName("5 - Deve excluir um produto pelo id com sucesso.")
  @Test
  void DeveExcluirprodutoPeloId() {
    this.produtoRepository.insert(produtoMock);
    
    this.produtoRepository.deleteById(produtoMockId);
    
    Optional<Produto> result = this.produtoRepository.findById(produtoMockId);
    
    Assertions.assertEquals(result, Optional.empty()); 
  }
  
  private static Produto mockProduto() {
    return new Produto("123", "Teste01", 10L);
  }

}
