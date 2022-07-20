### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

# Requisitos do desafio


# Desafio: Acelera

Uma amiga é proprietária da Acelera, uma revendedora carros com vendas cada vez mais aquecidas. Esse sucesso começou a ser percebido por grandes empresas da cidade.
Uma dessas empresas entra em contato com sua amiga oferecendo uma parceria. A ideia da empresa é expor seus carros junto ao catálogo online da Acelera. Assim, quando uma venda for realizada pela Acelera, haverá uma comissão. Mas, para isso, essa empresa solicita o acesso aos cadastros de carros da Acelera. 

Sabendo que você é uma pessoa programadora, sua amiga procura pela sua ajuda.

Então você oferece duas opções:

1 - Entregar uma planilha excel por email, e em qualquer nova alteração de veículo será necessário enviar um novo email.
2 - Desenvolver uma API no sistema de vendas, fazendo com que a empresa parceira acesse em tempo real tanto cadastros quanto atualizações.

A segunda opção faz mais sentido, certo? Assim, você poderá fornecer sua API para vários parceiros em diferentes lugares no país. 

Vamos ao desafio!! 🚗

- Crie um projeto chamado `SellCars`

- Tudo começa com o nome do seu principal pacote br.com.trybe, que deve seguir a estrutura:
   - com.trybe.cars.controller 
   - com.trybe.cars.service
   - com.trybe.cars.model
   - com.trybe.cars.repository

- Adicione uma entidade chamada `Car`, a qual terá um atributo `nome` do tipo `String` que representa o nome do carro, e um atributo `id` do tipo `Long` que representa seu identificador (PK da Tabela), adicione no pacote (br.com.trybe.model).

- Crie uma Controller chamada `CarsController` do tipo @Controller com um método do tipo GET getAllCars() e que tenha seu Path principal /cars que irá buscar todos os Carros, adicione no pacote (br.com.trybe.controller).

- Crie um Service chamado `CarsService` do tipo @Service com um método do getAllCars() que faz chamada para sua classe Repository, adicione no pacote (br.com.trybe.service).

- Crie uma interface Repository chamada `CarsRepository` do tipo @Repository que extende JpaRepository, adicione no pacote (br.com.trybe.repository).

- Configure seu application.properties para conectar ao banco MySQL e sua base de carros. 

- Acesse o endpoint http://localhost:8080/cars para buscar todos carros.

## Exemplo

1 - Configuração de banco de dados

`spring.datasource.url=jdbc:mysql://localhost:3306/carros`
`spring.datasource.username=dbuser`
`spring.datasource.password=dbpass`
`spring.datasource.driver-class-name=com.mysql.jdbc.Driver`
`spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect`


1 - Entidade 

```java
@Entity
@Table(name = "car", schema = "public")
public class Car {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;

	//Gets and Setts
}
```

2 - Controller 

```java
@RestController
@RequestMapping("/cars")
public class CarsController {

	@Autowired
	private CarsService service;

	@GetMapping
	public ResponseEntity<List<Car>> getAllCars(){

		List<Car> p = service.getAllCars();
	
		return ResponseEntity.ok().body(p);
	}
}
```

2 - Service 

```java

@Service
public class CarsService {

	@Autowired
	private CarsRepository repository;

	public List<Car> getAllCars() {
		return repository.findAll();
	}
}
```

2 - Repository 

```java
@Repository
public interface CarsRepository extends JpaRepository<Car, Long>{

}
```

# Rodando projeto Exemplo

1 - Baixe o projeto e importe para sua IDE de preferência
2 - Rode o comando mvn install 
3 - Rode o comando mvn spring-boot:run
