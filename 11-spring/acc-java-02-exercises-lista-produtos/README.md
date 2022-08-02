# Boas vindas ao repositório do desafio da Aceleração Java!



# Requisitos do desafio


# Desafio: Simular lista de Produtos

Neste desafio iremos simular uma API Rest que irá listar produtos e retornar um produto baseado em seu Id. 

**Atenção:** Aqui estamos "simulando", pois ainda não cobrimos o assunto de persistência de dados com Quarkus, vamos apenas validar o uso correto das anotações para Injeção de dependências, divisão em camadas e criar rotas HTTP do tipo GET._

Você terá que desenvolver uma aplicação que retorne uma lista de produtos para um estoque de um minimercado. Para isso você terá que expor duas rotas: uma para retornar todos os produtos, outra para obter o produto pelo seu id. Vamos ao passo a passo:

1. Execute o seguinte comando no terminal para a criação do seu projeto quarkus:

```
mvn io.quarkus.platform:quarkus-maven-plugin:2.6.3.Final:create \
    -DprojectGroupId=com.betrybe \
    -DprojectArtifactId=compras \
    -DprojectVersion=1.0.0 \
    -DclassName=com.betrybe.EstoqueController

```

2. Abra o projeto na IDE de sua preferência.

3. No arquivo `pom.xml` na seção `dependencies`, adicione a seguinte dependência para te auxiliar:

```
    <dependency>
      <groupId>io.quarkus</groupId>
      <artifactId>quarkus-resteasy-jsonb</artifactId>
    </dependency>
```

4. Agora crie três camadas dentro de "com.betrybe": Model, Service e Repository.

5. Dentro de Model, crie uma entidade chamada Produto, que deverá ter os seguintes requisitos:

    - Um atributo `id` do tipo `int`
    - Um atributo `nome` do tipo `String`
    - Um construtor vazio
    - Um construtor que recebe os dois parâmetros
    - Dois métodos `get()` para cada atributo criado

6. Dentro de Repository, use a classe abaixo, que está sem o uso de injeção de dependência, **que terá que ser feito por você.**

```java
package com.betrybe.repository;

import com.betrybe.model.Produto;

import javax.enterprise.context.ApplicationScoped;
import java.util.*;
import java.util.stream.Collectors;


public class EstoqueRepository {

    public Map<Integer,Produto> produtos;

    public EstoqueRepository(){
        produtos = new HashMap<Integer,Produto>();
        produtos.put(1, new Produto(1, "Leite"));
        produtos.put(2, new Produto(2, "Ovo"));
        produtos.put(3, new Produto(3, "Suco"));
        produtos.put(4, new Produto(4, "Pão"));
    }

    public List<Produto> findAll(){
        return produtos.values().stream().collect(Collectors.toList());
    }

    public Produto findById(Integer id){
        return produtos.get(id);
    }
}

```

7. Dentro de Service, use a classe abaixo, que está sem o uso de injeção de dependência, **que terá que ser feito por você**:

```java
package com.betrybe.service;

import com.betrybe.model.Produto;
import com.betrybe.repository.EstoqueRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

public class EstoqueService {


    private EstoqueRepository repository;

    public List<Produto> listar(){
        return repository.findAll();
    }

    public Produto buscarPorId(Integer id){
        return repository.findById(id);
    }
}


```

8. Após isso, modifique a classe EstoqueController de tal modo que:

    - Ela possua o endpoint "/estoque" que liste todos os produtos;
    - Ela possua o endpoint "/estoque/id" que receba um id e retorne o produto relacionado a esse id;
    - Deve ser utilizada a classe EstoqueService através do uso de injeção de dependência.

Parabéns! Você construiu seu primeiro projeto com Quarkus e ainda criou uma API Rest. Continue assim que você continuará crescendo cada vez mais! #VQV

---