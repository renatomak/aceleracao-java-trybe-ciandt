# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio

## Fazer uma conta poupança

Suponha que você está trabalhando em uma equipe responsável pela construção de um sistema bancário e deve desenvolver a classe que representa a conta poupança. Como missão dada é missão cumprida, crie um novo projeto Java no Eclipse nomeado Banco. Dentro desse projeto, crie uma classe `ContaPoupanca`, que deve contemplar os seguintes aspectos:

- Atributos:
    - `saldo`: atributo do tipo `double` para armazenar o valor em dinheiro que a conta possui;
    - `titularConta`: atributo do tipo `String` para armazenar o nome da pessoa portadora da conta.

- Métodos:
    - `depositar`: esse método é responsável por receber um valor do tipo `double` e somá-lo ao saldo da conta;
    - `sacar`: esse método é responsável por receber um valor do tipo `double` e subtraí-lo do saldo da conta;
    - `mostrarSaldo`: esse método deve retornar um valor do tipo `double` representando o saldo da conta.
    - `mostrarTitularConta`: esse método deve retornar o nome da pessoa titular da conta.

Essa conta poupança tem duas restrições a serem levadas em conta no seu projeto:

- ela só pode ser aberta se um depósito for feito no momento da sua abertura;
- ela deve ter o nome da pessoa titular da conta.


**Dica: use o construtor para adicionar o valor do depósito inicial ao saldo na abertura da conta e o nome da pessoa titular da conta.**


## Exemplo
Considerando que uma pessoa abra a conta poupança com o valor inicial de R$ 50, cada método deve se comportar da seguinte maneira:

- `depositar`: supondo que o saldo da conta seja R$ 50 e na chamada do método `depositar` seja passado o valor de R$ 100 como argumento, o método deve somar o valor 100 ao saldo, fazendo o valor do saldo ser atualizado para 150;
- `sacar`: supondo que o saldo da conta seja R$ 50 e na chamada do método `sacar` seja passado o valor de R$ 30 como argumento, o método deve subtrair o valor 30 do saldo, fazendo o valor do saldo ser atualizado para 20;
- `mostrarSaldo`: supondo que o saldo da conta seja R$ 50, então o retorno desse método deve ser 50.
- `mostrarTitularConta`: supondo que o nome da pessoa dona da conta seja Carla Pereira, esse método deve retornar um valor do tipo `String` contendo `Carla Pereira`.


---
