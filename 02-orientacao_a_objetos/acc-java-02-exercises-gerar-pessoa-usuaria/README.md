# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio: Gerar pessoa usuária

Na ACME Companhia Limitada os nomes das contas de pessoas usuárias são gerados com o nome e o sobrenome da pessoa separados por um ponto. Crie um sistema que gere o nome de usuário seguindo os seguintes critérios:

1. uma classe `Pessoa` que possui dois atributos **protegidos**, _nome_ e _sobrenome_.
2. uma classe `Usuario` que deve ter um construtor passando _nome_ e _sobrenome_.
3. na classe `Usuario` deve-se adicionar uma função `getUsuario()`, que não recebe nenhum parâmetro, e retorna o nome.sobrenome.

## Exemplo

Iniciei a classe `new Usuario("bruce", "wayne")`, então a saída da função `getUsuario()` deve ser `bruce.wayne`.

Iniciei a classe `new Usuario(null, "wayne")`, então a saída da função `getUsuario()` deve ser `Usuário inválido`. O mesmo deve ocorrer se o sobrenome for nulo.

Iniciei a classe `new Usuario("", "wayne")`, então a saída da função `getUsuario()` deve ser `Usuário inválido`. O mesmo deve ocorrer se o sobrenome for vazio.


---
