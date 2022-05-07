# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

## Descrição do desafio: Concessionária de automóveis

Graças à sua habilidade no uso de *streams*, você foi requisitado para escrever parte de um módulo financeiro do sistema de uma concessionária de automóveis. O aprendizado faz a gente se destacar! 😎

A especificação da sua demanda é a seguinte: implemente uma classe chamada `OperacoesVeiculos` que seja instanciável.

Essa classe deve conter os seguintes métodos:

1. `<T> int numVeiculosDiferentesVendidos(Stream<T> veiculosVendidos)`
Essa operação recebe um `Stream` de veículos vendidos, e você vai confiar no `equals()` do tipo `Veiculo`, mesmo sem conhecê-lo, para dizer **quantos veículos diferentes foram vendidos** nesse conjunto.

2. `<T> Stream<String> obterRepresentacao(Stream<T> veiculos)`
Essa operação recebe um `Stream` de veículos, e você vai retornar um `Stream` do mesmo tamanho, mas de `String`, em que cada item seja a representação de um veículo através da chamada do `toString()`. Você também consegue fazer isso sem conhecer a classe `Veiculo`, uma vez que todos os objetos em Java possuem o método `toString()`.

3. `<T> List<T> obterLista(Stream<T> veiculos)`
A operação `obterLista` deve apenas retornar um `List` com os mesmos elementos do `Stream` passado como parâmetro.

Boa sorte! 🚘 Lembre-se de que uma entrega de qualidade abre portas no mercado de trabalho! #VQV
