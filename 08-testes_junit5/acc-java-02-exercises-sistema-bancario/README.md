# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio: Sistema Bancário

Suponha que chegou até você uma demanda para fazer algumas classes de um sistema bancário, utilizando, obrigatoriamente, a prática de Test Driven Development. Nessa demanda, você será responsável por fazer 3 classes (`ContaBancaria`, `Cliente`, `ValidaCPF`), com as seguintes características:

- `ValidaCPF`: será uma classe com apenas um método estático. O método é o `validarCPF()`, que é responsável por receber uma String de números (ex: 17892255710), que representa o CPF da pessoa cliente, e verificar se é um CPF válido (no final desta seção há uma explicação sobre o cálculo que valida CPF).

Resumindo, esse método: 1. recebe uma String que representa o CPF da pessoa cliente, ex: 17892255710; 2. faz o cálculo para verificar se o CPF é válido ou inválido; 3. retorna um valor booleano, ou seja, retorna true se o CPF for válido, e false se for inválido.

    ⚠️🔴**Dica: a declaração dessa classe deve ser** `public static boolean validarCPF(String cpf)`**.** 🔴⚠️

- `Cliente`: será uma classe com dois atributos privados e seus respectivos getters e setters. Os atributos são o nome e o cpf da pessoa cliente. A descrição dos atributos e dos métodos getters e setters são:

  - `nome`: esse atributo é uma String para representar o nome da pessoa cliente da conta bancária. Seus getters e setters são: - `setNome`: recebe uma String que representa o nome da pessoa cliente e adiciona ao atributo `nome`; - `getNome`: retorna uma String que representa o nome da pessoa cliente;
  - `cpf`: esse atributo é uma String para representar o CPF da pessoa cliente da conta bancária. Seus getters e setters são:
    - `setCPF`: recebe uma String que representa o CPF da pessoa cliente, e então realiza os seguintes passos:
      1. chama o método estático `validarCPF()` da classe `ValidaCPF`, passando a String recebida.
      2. se o método `validarCPF` retornar `true`, então a String é adicionada ao atributo `cpf`, caso contrário o `null` deve ser adicionado ao atributo `cpf`.
    - `getCPF`: retorna uma String que representa o CPF da pessoa cliente;

  ⚠️🔴**IMPORTANTE: o método** `setCPF` **verifica se a String recebida representa um número de CPF válido através do método estático** `validaCPF()`**.** 🔴⚠️

- `ContaBancaria`: será uma classe com dois atributos e sete métodos estáticos. Os atributos são: `saldo` do tipo inteiro e `cliente` do tipo `Cliente`. Você deverá também implementar o construtor dessa classe para instanciar o objeto da classe Cliente e iniciar o saldo da conta como 0. Os métodos e os atributos estão descritos a seguir:

  - **Atributos**
    - `saldo`: tipo inteiro;
    - `cliente`: é uma instância da classe `Cliente`.
  - **Métodos**
    - `setNomeCliente`: esse método é responsável por receber uma String que representa o nome da pessoa cliente, e chama o método `setNome` do objeto `cliente`, passando a String recebida;
    - `getNomeCliente`: esse método é responsável por chamar o método `getNome` do objeto `cliente` e retornar como String;
    - `setCPFCliente`: esse método é responsável por receber uma String que representa o cpf da pessoa cliente, e chama o método `setCPF` do objeto `cliente`, passando a String recebida;
    - `getCPFCliente`: esse método é responsável por chamar o método `getCPF` do objeto `cliente` e retornar como String;
    - `depositar`: esse método recebe um valor inteiro, adiciona-o ao atributo `saldo` e depois retorna o novo valor do atributo `saldo`;
    - `sacar`: esse método recebe um valor inteiro, subtrai esse valor do atributo `saldo` e depois retorna o novo valor do atributo `saldo`;
    - `verSaldo`: retorna um valor inteiro, que representa o valor armazenado no atributo `saldo`;

  ⚠️🔴**IMPORTANTE: implemente o construtor da classe** `ContaBancaria` **para instanciar o objeto** `cliente` **e iniciar o atributo** `saldo` **como zero.** 🔴⚠️

Pronto, essa é a descrição da nossa demanda! Lembre-se de que você deve iniciar a codificação pelos testes, porque a exigência é que esse projeto seja feito utilizando Test Driven Development. Então, no teste você terá que implementar 3 classes, cada uma referente ao teste das classes da demanda, além de seus respectivos métodos para testar os métodos da demanda.

- `TesteValidaCPF`: essa classe teste será responsável por conter os métodos testes para avaliar a classe `ValidaCPF`. Essa classe deve ter no mínimo dois métodos testes.

  - `testeValidarCPFValido`: responsável por testar se o retorno de um CPF válido é `true`;
  - `testeValidarCPFInvalido`: responsável por testar se o retorno de um CPF inválido é `false`.

  ⚠️🔴**Dica: lembre-se de usar** `assertTrue` **e** `assertFalse` **para avaliar condições.** 🔴⚠️

- `TesteCliente`: essa classe teste será responsável por conter os métodos testes para avaliar a classe `Cliente`. Essa classe deve ter no mínimo três métodos testes.

  - `testeNome`: responsável por testar se a String recebida é adicionada ao atributo `nome`;
  - `testeSetCPFValido`: responsável por testar se a String recebida de um CPF válido é adicionada ao atributo `cpf`;
  - `testeSetCPFInvalido`: responsável por testar se a String recebida de um CPF inválido não é adicionada ao atributo `cpf`, e nesse caso o atributo `cpf` deve ser `null`;

- `TesteContaBancaria`: essa classe teste será responsável por conter os métodos testes para avaliar a classe `ContaBancaria`. Essa classe deve ter no mínimo seis métodos testes.
  - `testeNomeCliente`: responsável por testar se a String recebida é adicionada ao atributo `nome` do objeto `cliente`;
  - `testeCPFClienteValido`: responsável por testar se a String recebida representando um CPF válido é adicionada ao atributo `cpf` do objeto `cliente`;
  - `testeCPFClienteInvalido`: responsável por testar se a String recebida representando um CPF inválido não é adicionada ao atributo `cpf` do objeto `cliente`, e se o atributo `cpf` é null;
  - `testeDepositar`: responsável por testar se o valor recebido é adicionado ao atributo `saldo`;
  - `testeSacar`: responsável por testar se o valor recebido é subtraído do atributo `saldo`;
  - `testeVerSaldo`: responsável por testar se o valor retornado é o mesmo do atributo `saldo`.

⚠️🔴**Fórmula de calcular o CPF** 🔴⚠️

O CPF (Cadastro de Pessoa Física) é um número com 11 dígitos, cujos dois últimos são calculados com base nos dígitos anteriores. Os dois últimos números são chamados de dígitos verificadores, ou DV. Vamos utilizar o 988.841.550-61 como exemplo para o cálculo.

No CPF temos dois dígitos verificadores, e para calcular cada um deles há duas etapas: a primeira é a soma da multiplicação de cada dígito por pesos; a segunda faz uma subtração utilizando a soma módulo 11 ("módulo" aqui pode ser entendido como o resto da divisão). Vamos a um exemplo:

- Primeiro DV:

  1. Primeiro Passo: os nove primeiros dígitos do CPF são multiplicados por pesos, que começam de 10 e vão diminuindo de 1 em 1, e depois se soma tudo:
     ```
     soma = (9*10)+(8*9)+(8*8)+(8*7)+(4*6)+(1*5)+(5*4)+(5*3)+(0*2)
     soma = 346
     ```
  2. Segundo passo: usamos o resultado dessa soma para calcular o primeiro DV:
     `11 - (soma % 11) 11 - (346 % 11) 11 - 5 = 6`
     ⚠️🔴**IMPORTANTE** 🔴⚠️ se a subtração 11 - (soma % 11) for 10 ou 11, o dígito verificador será 0; nos outros casos, o dígito verificador é o próprio resultado da subtração.

  Exemplo:

  ```
  11 - (soma % 11)
  11 - 1 = 10
  então o DV tem que ser zero
  ```

  ou

  ```
  11 - (soma % 11)
  11 - 0 = 11
  então o DV tem que ser zero
  ```

- Segundo DV:
  1. Primeiro Passo: os nove primeiros dígitos do CPF são multiplicados por pesos que começam de 11 e vão sendo diminuídos de 1, depois se soma tudo:
     ```
     soma = (9*11)+(8*10)+(8*9)+(8*8)+(4*7)+(1*6)+(5*5)+(5*4)+(0*3)+(6*2)
     soma = 406
     ```
  2. Segundo passo: usamos o resultado dessa soma para calcular o segundo DV:
     `11 - (soma % 11) 11 - (406 % 11) 11 - 10 = 1`
     ⚠️🔴**IMPORTANTE** 🔴⚠️ se a subtração 11 - (soma % 11) for 10 ou 11, o dígito verificador será 0; nos outros casos, o dígito verificador é o próprio resultado da subtração.
     Exemplo:
  ```
  11 - (soma % 11)
  11 - 1 = 10
  então o DV tem que ser zero
  ```
  ou
  ```
  11 - (soma % 11)
  11 - 0 = 11
  então o DV tem que ser zero
  ```
