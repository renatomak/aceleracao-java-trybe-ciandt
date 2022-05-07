# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

Neste desafio, você deverá implementar uma classe chamada `AnoBissexto`, que tem um método chamado de `identificarAnoBissexto`. Esse método recebe um valor inteiro positivo representando o ano e retorna `true` quando o ano é bissexto ou `false` caso contrário. E um outro método chamado `identificarProximoAnoBissexto`, que recebe uma String representando a data no formato brasileiro (por exemplo, 22/12/2021) e retorna um valor inteiro representando o próximo ano bissexto, a partir da data recebida por parâmetro.

🥸 Dica: lembre-se de usar a classe `DateTimeFormatter` para poder criar um objeto `LocalDate` usando uma String no formato da data brasileira. Use os métodos `.plusYears()`,`.getYear()`, e `.isLeapYear()`.

## Exemplo

Quando passado o valor inteiro `2021` como argumento para o método `identificarAnoBissexto`, a saída no console deve ser: `false`

Quando passado o valor inteiro `2024` como argumento para o método `identificarAnoBissexto`, a saída no console deve ser: `true`

Quando passado a String `"22/12/2021"` como argumento para o método `identificarProximoAnoBissexto`, a saída no console deve ser: `2024`
