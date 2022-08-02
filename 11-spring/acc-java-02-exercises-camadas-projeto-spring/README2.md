# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

# Desafio: Simulando um CRUD de estudantes

_Obs: Aqui vamos usar o conceito de simular, pois ainda não cobrimos a parte prática do Spring Data, então o que vamos validar neste desafio é a separação dos métodos em camadas diferentes e não a implementação em si dos métodos CRUD e conexão com algum banco de dados._

Você acabou de receber a demanda de gerenciar as pessoas estudantes Trybe! Para isso, vai precisar fazer um CRUD simples. Com os conhecimentos adquiridos nessa lição, siga os seguintes passos:

1. Crie o projeto no Spring Initialzr com as informações abaixo: 👇

- Grupo: com.trybe.aceleracao-java

- Artefato: desafio-camadas-spring

- Packaging: jar

- Java 11

- Projeto Maven

2. Na aba de dependências, adicione o Spring Web, gere o projeto e abra na sua IDE.

3. Crie pacotes na aplicação e separe a parte de tratamento dos dados da parte onde temos implementação de regras de negócio (igual ao que vimos na aula).

4. Após isso, crie uma classe na camada de dados que represente a entidade Estudante com os seguintes atributos:

- id do estudante, que será do tipo String;
- nomeEstudante, que será do tipo String;
- stackFavorita, que será do tipo String;
- cidade, que será do tipo String;

5. Agora implemente os métodos que compõem esse CRUD.

⚠**Dica:** a responsabilidade do método da camada de lógica de negócio e seu retorno será chamar a classe do pacote (responsável por implementar as "buscas" no banco de dados).

6. Crie, em ambas as camadas, os métodos com os seguintes requisitos:

- Método _criarEstudante_, que recebe como parâmetro _Estudante_ e retorna _Estudante_;

- Método _buscaEstudantepeloId_, que recebe como parâmetro _id_ e retorna _Estudante_;

- Método _atualizaEstudantepeloId_, que recebe como parâmetro _id e estudante_ e retorna _Estudante_;

- Método _excluiEstudantepeloId_, que recebe como parâmetro _id e estudante_ e retorna _void_.

Após resolver esse desafio, você saberá exatamente como criar um projeto pelo Spring Initialzr e como separar as responsabilidades em um projeto Spring Boot, separando a camada de persistência da camada de serviço.
