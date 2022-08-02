# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio

## Testando a camada de persistence utilizando testcontainers

A empresa em que você está trabalhando como pessoa desenvolvedora começou a adotar regras de cobertura de testes para seus projetos e você acabou de receber um projeto já desenvolvido que ainda não tem testes da camada de persistência. Foi indicado que seja utilizado o TestContâiner para escrever os testes de todas as operações CRUD.

Acesse [aqui](testes-com-testcontainers/testecontainer) o projeto que já está desenvolvido e observe o seu conteúdo.

⚠ **Atenção:** Já existe uma classe chamada ProdutoRepositoryTest para criar os testes.

Para cumprir com a demanda, lembre-se de seguir as seguintes etapas (semelhantes às que vimos nas aulas):

1. Adicione as anotações necessárias para que o testContainer possa usar o MongoDB
2. Crie um MongoDBContainer
3. Crie um mock do produto e do repositório
4. Escreva um caso de testes para cada uma das operações CRUD
5. Ao final da escrita dos testes, execute todos eles e faça a validação para verificar se todos passaram

É fundamental garantir que todos os testes passaram, combinado?

Cumprindo este desafio, você colocará em prática um cenário que muito provavelmente você vai precisar aplicar no seu dia a dia nas empresas: ter que escrever testes de um sistema já desenvolvido utilizando o testcontainer — que nos ajuda muito a testar se a persistência e conexão com outros serviços está funcionando corretamente.

Bora ser uma pessoa cada vez mais preparada para as demandas do mercado de trabalho? 😎
---

