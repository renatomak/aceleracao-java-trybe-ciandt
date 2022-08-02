# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

Crie um projeto chamado `SistemaRH` e adicione uma classe chamada `PessoaColaboradora`, que deve ter um atributo `salarioBruto` do tipo `double` (que representa o salário bruto da pessoa colaboradora) e também os seguintes métodos:

- `calcularSalarioLiquido`: realiza o cálculo do salário líquido, ou seja, o salário após o desconto do imposto de renda. Considere o valor do imposto de renda como 20% do salário bruto.

- `calcularValorBrutoRecebidoAnual`: esse método será responsável por calcular quanto dinheiro a pessoa colaboradora receberá após um número x de anos. Então esse método deve receber um número inteiro, que representa a quantidade de anos que será avaliada; e retorna um valor do tipo `double`, representando o valor em dinheiro que a pessoa colaboradora irá receber depois de x anos. Para esse método, use o valor bruto do salário.

- `calcularValorLiquidoRecebidoAnual`: esse método será responsável por calcular quanto dinheiro a pessoa colaboradora receberá após um número x de anos. Então esse método deve receber um número inteiro, que representa a quantidade de anos que será avaliada; e retorna um valor do tipo `double`, representando o valor em dinheiro que a pessoa colaboradora irá receber depois de x anos. Para esse método, use o valor liquido do salário.

- `calcularValorImpostoAnual`: esse método será responsável por calcular quanto dinheiro foi pago de imposto após um número x de anos. Então esse método deve receber um número inteiro, que representa a quantidade de anos que será avaliada, e retornar um valor do tipo `double`, representando o valor em dinheiro que a pessoa colaboradora pagou de imposto de renda. Em outras palavras, esse método retorna a soma do valor mensal pago ao imposto de renda durante um período de anos. Lembre-se também de adicionar os métodos get e set referentes ao atributo `salarioBruto`, usando a opçao `Source` > `Generate Getters and Setters...`.

Para esse desafio, você terá também que desenvolver os testes unitários utilizando a extensão do JUnit no Eclipse. Crie a classe `TestePessoaColaboradora` utilizando a extensão do JUnit e escreva os métodos testes para cada método da classe `PessoaColaboradora`. Os testes unitários devem cobrir todos os métodos da classe `PessoaColaboradora`, ou seja, a classe teste deverá ter os seguintes métodos:

- `testeCalcularSalarioLiquido`: esse método é responsável por testar o método `calcularSalarioLiquido` da classe `PessoaColaboradora`.

- `testeCalcularValorBrutoRecebidoAnual`: esse método é responsável por conter o teste do método `calcularValorBrutoRecebidoAnual` da classe `PessoaColaboradora`.

- `testeCalcularValorLiquidoRecebidoAnual`: esse método aqui é o responsável por verificar o correto funcionamento do método `calcularValorLiquidoRecebidoAnual` da classe `PessoaColaboradora`.

- `testeCalcularValorImpostoAnual`: por fim, esse método é o responsável por testar o método `calcularValorImpostoAnual` da classe `PessoaColaboradora`.

**IMPORTANTE: use a anotação `@DisplayName` para dar nomes mais significativos para os métodos de teste.**

## Exemplo

Exemplos de funcionamento dos métodos da classe `PessoaColaboradora` com as entradas e as respectivas saídas:

- `calcularSalarioLiquido()`: esse método não recebe argumentos, ele usa o atributo `salarioBruto` para gerar sua saída. Suponha que o `salarioBruto` é igual a 3000, então esse método deve retornar 2400. Ou seja, se o salário bruto é 3000, o salário líquido deve ser 2400.

- `calcularValorBrutoRecebidoAnual(int anos)`: esse método recebe um inteiro, que representa o período em anos que será usado no cálculo. Suponha que o salário bruto mensal é 3000, e a entrada desse método é 5, então a saída desse método deve ser 180000.

- `calcularValorLiquidoRecebidoAnual(int anos)`: esse método recebe um inteiro, que representa o período em anos que será usado no cálculo. Suponha que o salário líquido mensal é 2400, e a entrada desse método é 5, então a saída desse método deve ser 144000.

- `calcularValorImpostoAnual(int anos)`: esse método recebe um inteiro, que representa o período em anos que será usado no cálculo. Suponha que o salário bruto mensal é 3000, e a entrada desse método é 5, então a saída desse método deve ser 36000.
