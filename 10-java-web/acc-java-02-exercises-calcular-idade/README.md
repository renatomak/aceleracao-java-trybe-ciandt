# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio


# Desafio: Calcular Idade

Agora que você já aprendeu a realizar testes em aplicações REST e a tratar fluxos de exceções com o uso de ExceptionHandler e ControllerAdvice, chegou a hora de somar o seu conhecimento à prática, e nada melhor que um desafio para fixar o conteúdo. Com isso, você estará cada vez mais perto de ser uma pessoa desenvolvedora de excelência.

  
### Descrição

Você já deve ter passado pela situação de perguntar a data de nascimento de alguém e levar aqueeeeeele tempão para calcular a idade da pessoa ⌛. Para evitar possíveis problemas, te convidamos a criar uma aplicação responsável por fazer esse calculo de forma automatizada.

O desafio consiste na criação de uma aplicação REST que receba uma data composta por dia-mês-ano e, baseada nesta informação, retorne a idade correspondente. Idades retornadas devem ser maiores ou iguais a `0`.


### Setup do projeto

Para começar, crie o projeto no [*Spring initialzr*](https://start.spring.io/)

- Dependência: Spring Web
- grupo: com.trybe
- artefato: calcular-idade


### Os seguintes cenários devem ser levados em consideração:

Cenário 1:
Entrada: `http://localhost:8080/?data=23-11-1981`
Saida:
- payload: {"idade": 40}
- statuscode: 200

Cenário 2:
Entrada: `http://localhost:8080/?data=23-11-3000`
Saida:
- payload: {"error": "Data Futura"}
- statuscode: 400

Cenário 3:
Entrada: `http://localhost:8080/?data=11-1981`
Saida:
- payload: {"error": "Data Inválida"}
- statuscode: 400

Cenário 4:
Entrada: `http://localhost:8080/?data=DD-mm-AAAA`
Saida:
- payload: {"error": "Data não é número"}
- statuscode: 500

Cenário 5:
Entrada: `http://localhost:8080/?data=2-3-11-1981`
Saida:
- payload: {"error": "Data Inválida"}
- statuscode: 400


Deve ser criada uma classe chamada `GerenciadorAdvice`, anotada com `@ControllerAdvice`, que possuirá 2 métodos: `handlerBadRequest` e `handlerInternalServerError`, que serão responsáveis por realizar a alteração do status code da requisição, como também classes de exceções para cada cenário apresentado acima, sendo elas:
```
Cenário 2 - DataFuturaException
Cenário 3 - DataInvalidaException
Cenário 4 - ArgumentoIlegalException
Cenário 5 - DataInvalidaException
```

Adicione um novo campo na request com o nome `fallback` que, caso receba `true`, habilite um comportamento que, em caso de erro, a aplicação retorne:

```text
Entrada: `http://localhost:8080/?data=23-11-198-1&fallback=true` 
Saida:
 - payload: {"idade": 0} 
 - statuscode: 200
```

**⚠️Atenção:**  Algumas versões do spring precisam da dependência `spring-boot-starter-aop` para executar corretamente o resilience-4j

Após resolver esse desafio, você saberá exatamente como criar um projeto capaz de adaptar-se a mudanças e superar situações adversas ou inesperadas. #VQV
