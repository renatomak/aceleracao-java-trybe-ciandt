# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio

## Sistema de Recursos Humanos

Neste desafio, você implementará a parte de um sistema de recursos humanos para a Trybe! Sua função é implementar a classe `PessoaFuncionaria` com os atributos privados:

- `nomeCompleto`: esse atributo é do tipo `String`;
- `cpf`: esse atributo é do tipo `String`;
- `endereco`: esse atributo é do tipo `String`;
- `salario`: esse atributo é do tipo `double`;

Implemente seu construtor para que, quando uma nova pessoa funcionária seja contratada na Trybe (o objeto seja instanciado), seus atributos já sejam incializados. Você deverá também implementar os métodos `Getter`s e `Setter`s, exceto para o atributo `cpf`, imutável, que deve ter somente o método `Getter`.

## Exemplo
Se a nova pessoa contratada for:

- Nome: Maria da Silva;
- CPF: 158.699.457-31;
- Endereço: Rua da Aurora, 118;
- Salário: 15000.

Então o método `Getter` do atributo `cpf` deve retornar 158.699.457-31. Se executarmos o método `Setter` do atributo `salario` passando o valor 20000, o método `Getter` do atributo `salario` deve retornar 20000.0 (já que é do tipo `double`).


---
