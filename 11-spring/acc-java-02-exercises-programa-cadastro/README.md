# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

## Landing page de cadastro

Boas-vindas ao desafio da lição! É hora de pegar um café e prestar atenção nos requisitos!

Você está trabalhando numa *startup* que está com planos de lançar um produto e criou uma página na Internet para divulgação. A página permite que potenciais clientes se cadastrem com nome e e-mail para receber novidades sobre o produto.

O backend desse cadastro foi construído e a sua função é escrever testes para a camada REST da aplicação. São duas classes: `GreetingResource`, que é a classe criada por padrão em projetos Quarkus, e `CadastroResource`, que contém as funcionalidades do negócio.

A classe `CadastroResource` tem dois endpoints para cadastrar e obter os dados de um cadastro por id. O id é gerado no momento do cadastro. É importante destacar que um cadastro pode ser feito no modo "protegido", e dessa forma a tentativa de obtenção desse cadastro resultará em erro HTTP 403. As regras são as seguintes:

1. POST /cadastro

- Se o atributo `nome` está nulo, retorna HTTP 400
- Se o atributo `nome` existe e está vazio, retorna HTTP 500
- Se não cair nas condições anteriores, efetiva o cadastro

2. GET /cadastro/{idCadastro}

- Se o atributo idCadastro não é um número válido, retorna HTTP 400
- Se o atributo idCadastro é um número válido, mas não existe um cadastro com esse id, retorna HTTP 400
- Se o atributo é um número válido de cadastro existente, mas protegido, retorna HTTP 403
- Se não cair nas condições anteriores, retorna o cadastro

 O comportamento dos endpoints e a implementação dessas regras você pode verificar diretamente na classe `CadastroResource`.

Seus testes devem atingir a cobertura de **100%** para as duas classes de *Resource*, tanto para linhas quanto para *branchs*! Isso significa que, além de os seus testes precisarem passar por todas as linhas, em fluxos em que há dois ou mais caminhos, eles precisam abranger todos. Por exemplo: se a classe tem uma linha de código com `if (i == 0)`, é necessário fazer um caso de teste com `i == 0` e um caso de teste com `i != 0`. 

Não se esqueça de testar também a classe `GreetingResource.java`.

VQV!
