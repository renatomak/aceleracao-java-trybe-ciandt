# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

# Desafio Agregador: Sistema de Cadastro de Especialidades 👨‍🚒👩‍🚒

Imagine que você está trabalhando para uma empresa especializada em RH (recursos humanos) e vai colaborar com o time de desenvolvimento. Sua atribuição é implementar um sistema web responsável por consultar, cadastrar, editar e deletar profissionais e suas especialidades no banco de dados da empresa.

A pessoa responsável pela arquitetura do software montou uma especificação técnica, a qual foi designada como demanda para você. Veja os detalhes a seguir:

> ##### ESPECIFICAÇÃO TÉCNICA
>
> ---
>
> **Projeto**: Cadastro de Especialidades
>
> **Objetivo**: A empresa conta com um conjunto de sistemas integrados para o gerenciamento de qualificações dos profissionais, todos construídos com framework Quarkus. Entretanto, devido a mudanças recentes na infraestrutura e nos contratos, todo esse core está sendo portado para o Spring Boot. Portanto, este projeto tem como objetivo migrar o módulo de cadastro de especialidades para a nova arquitetura escolhida pela empresa.
>
> **Requisitos**:
>
> - Desenvolver um novo projeto utilizando o framework Spring Boot na versão `2.5.9`;
> - Definir `maven` como gerenciador de dependências e ferramenta de build do projeto;
> - Implementar as 4 operações básicas de um CRUD (GET, POST, PUT e DELETE) utilizando as especificações do `JAX-RS`, em que cada uma dessas operações deverá corresponder a um caminho na API Rest:
>   - **GET path = "/api/professional/all"**: deverá trazer todos os registros cadastrados dos profissionais e suas especialidades. Caso não encontre nenhum registro, deverá retornar um `404 Not Found`, com uma mensagem de erro: "_Nenhum registro foi encontrado!_";
>   - **POST path = "/api/professional/add"**: deverá cadastrar um novo registro no banco de dados com retorno `201 Created` e a string "_Inserido_". O id é autogerado e portanto não pode ser informado manualmente. Caso seja um `400 Bad Request`, uma mensagem "_Não é permitido inserir novos registros com ID explícito_" será exibida.
>   - **PUT path = "/api/professional/edit/{id}"**: deverá editar um registro já existente na base de dados, retornar um `200 Ok` e a string "_ID [%d] atualizado_", onde o `%d` representa o ID editado. O ID do cadastro é informado manualmente na URL e, caso ele não exista, um `404 Not Found` com a mensagem "_Não é possível editar, o ID informado não existe_" deve ser retornado;
>   - **DELETE path = "/api/professional/delete/{id}"**: deverá deletar um registro já existente da base de dados, retornar um `200 Ok` e a string "_ID [%d] removido_", onde o `%d` representa o ID editado. O ID do cadastro é informado manualmente na URL e, caso ele não exista, um `404 Not Found` com a mensagem "_Não é possível deletar, o ID informado não existe_" deve ser retornado;
> - Construir a camada de acesso a dados, utilizando os conceitos de abstração da base de dados disponíveis nas especificações do `JPA`;
> - Implemente os campos presentes na entidade representacional do profissional e sua especialidade com os atributos: `id`, `name` e `speciality`;
> - Configurar devidamente as propriedades do sistema em um arquivo `.yml` conforme a lista abaixo:
>
>   - Porta de execução da aplicação deve ser a `8080`;
>   - Datasource apontado para acessar o `H2 Database` com as seguintes credenciais: `username = speciality-app` / `password = speciality-app!`;
>   - Definir as propriedades do logger para gerar um arquivo de logs em uma pasta especificada `./logs/speciality-app.log`, assim como o level de logging das informações.
>   - O projeto deverá ser empacotado no formato `.war` para o deploy no server container do wildfly da empresa
>
>   Dica 💡: Veja os [exemplos](#Exemplos "Ir para exemplos") no final do enunciado para conferir os modelos de retornos das operações.

# Visão geral da Demanda 📄

- **Etapa 1 ☕**: O primeiro passo para desenvolver seu sistema é criar o projeto. Para agilizar o processo, você pode usar uma IDE como o [Eclipse IDE for Enterprise Java and Web Developers](https://www.eclipse.org/downloads/packages/ "Página de downloads do eclipse") com o [plugin](https://marketplace.eclipse.org/content/spring-tools-4-aka-spring-tool-suite-4 "Plug-in do spring para eclipse IDE") do Spring Boot instalado;
- **Etapa 2 ☕**: O sistema deverá usar o `maven` como ferramenta para gerenciamento das dependências do projeto. Se você estiver utilizando o eclipse, o maven já estará embarcado no programa, mas caso seja necessário você também pode baixar o pacote manualmente e apontar o eclipse para o caminho através do menu `Window → Preferences → Maven`;
- **Etapa 3 ☕**: Ao criar o projeto, adote as seguintes especificações:
  - **Type**: _Maven Project_
  - **Packaging**: _War_
  - **Java Version**: _11_
  - **Group**: _app.trybe_
  - **Artifact**: _speciality-app_
  - **Name**: _speciality-app_
  - **Package**: _app.trybe.specialityapp_
- **Etapa 4 ☕**: Copie os arquivos gerados pela IDE dentro do projeto do desafio, mantendo a mesma estrutura de diretórios.
- **Etapa 5 ☕**: Modifique o `pom.xml` do desafio, de forma que se tenha as especificações adotadas na Etapa 3.
  - **IMPORTANTE**: deixe as dependências e os plugins agrupadas na mesma tag `<dependencies>` e `<plugins>`, respectivamente. **NÃO MODIFIQUE** os plugins já fornecidos pelo desafio.
- **Etapa 6 ☕**: Para trabalhar com as exigências que a especificação técnica pede será necessário adicionar algumas dependências ao sistema, o que pode ser feito ainda durante a criação do projeto. Dependências necessárias: `spring jpa`, `spring jersey`, `h2 database`;
  - **IMPORTANTE**: ao adicionar as dependências, não modifique o que já foi fornecido pelo desafio.
- **Etapa 7 ☕**: A partir dessa etapa, você deve criar os seguintes pacotes dentro do pacote principal (_app.trybe.specialityapp_): `commons`, `config`, `controller`, `model`, `repository` e `service`. Eles servirão para manter a organização do projeto;
- **Etapa 8 ☕**: De acordo com a especificação técnica, o objeto que representa o profissional e sua especialidade é formado por três campos: `Integer id`, `String name` e `String speciality`. Você pode criar uma classe chamada `Professional.java` para isso.
  **Anota ai📣**: Utilize as especificações do Spring JPA para atender aos requisitos de abstração (_@Entity, @Id, @GeneratedValue, @Column e etc._);
- **Etapa 9 ☕**: O repositório com as operações no banco de dados não precisa conter a implementação explícita das consultas, mas nada impede de fazê-las, especialmente um método que realize a busca por ID do Professional.
- **Etapa 10 ☕**: Será preciso uma classe para conter a lógica das nossas regras da aplicação. Conforme mencionado na especificação técnica, as operações de GET, POST, PUT e DELETE possuem comportamentos que serão acionados na medida em que certas ações são requisitadas na nossa API Rest. Sendo assim, quem será responsável por tratar esses dados será o SERVICE;

  > Dica 💡: Para obter um melhor entendimento sobre as regras da aplicação, revise o tópico 3 da especificação técnica.

- **Etapa 11 ☕**: O pacote `commons` é destinado a armazenar a classe com a mensagem de erro personalizada;
- **Etapa 12 ☕**: O seu controlador será a classe responsável por receber as requisições para as operações e devolvê-las ao usuário no formato `json`. Utilize as especificações do JAX-RS para construir a API REST do sistema seguindo os requisitos abaixo:
  - Cria um método `findAll` associado à operação `GET` que irá consultar e retornar todos os registros;
  - Cria um método `insert` associado à operação `POST` que irá inserir um novo registro;
  - Cria um método `edit` associado à operação `PUT` que irá editar um registro existente;
  - Cria um método `delete` associado à operação `DELETE` que irá remover um registro existente;
- **Etapa 13 ☕**: Caso você tenha seguido todas as etapas até aqui, já deve ter obtido um sistema estruturalmente construído, embora não configurado. Para que o servidor web consiga interpretar corretamente nossas requisições, será necessário que uma classe registre nossos beans na inicialização como um configuração do app. Use o modelo abaixo como referência:

  ```java
  @Configuration
  @ApplicationPath("/api")
  public class JerseyConfig extends ResourceConfig {

    private Logger logger = LoggerFactory.getLogger(JerseyConfig.class);

    /**
    * Construtor para o JerseyConfig.
    *
    */
    public JerseyConfig() {
      packages(SpecialityAppApplication.class.getPackageName());
      register(new AbstractBinder() {

        @Override
        protected void configure() {
          logger.info("Configurando binder");
        }
      });
    }
  }
  ```

- **Etapa 14 ☕**: Quando criamos o projeto, por padrão, ele também cria um arquivo `application.properties`, responsável por guardar as propriedades de configuração da aplicação no formato "chave"x"valor". Para este cenário, vamos remover esse arquivo e criar outro de mesmo nome, porém com a extensão .yml. Desta forma, obtemos um novo arquivo nomeado com `application.yml`, o qual armazena as propriedades do nosso sistema por indentação. Dentro deste arquivo você vai precisar declarar três blocos:
  1.  Bloco de configuração contendo o apontamento do sistema para porta `8080` e o context path para `/api`
  2.  Bloco de configuração do datasource contendo o apontamento para o banco de dados da aplicação no endereço `dbc:h2:mem:speciality_database` e credenciais de acesso `username = speciality-app` / `password = speciality-app!`;
  3.  Bloco de configuração do logging level como `INFO` registro de log salvo no arquivo `./logs/speciality-app.log`.

---
