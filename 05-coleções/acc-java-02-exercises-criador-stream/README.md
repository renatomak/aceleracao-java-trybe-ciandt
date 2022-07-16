# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

## Descrição do desafio: praticando a criação de _streams_

Vamos colocar o seu conhecimento em prática!

Você começou a trabalhar em uma empresa e assumiu o desenvolvimento de um novo sistema de relatórios. Os dados do relatório chegam do módulo de dados da empresa em forma de item, array ou coleção. Você, que já sabe que para aplicar os filtros e transformações que um relatório exige é muito melhor usar _streams_, vai utilizar essa boa prática no desenvolvimento.

Para poder transformar a entrada que você tem em _streams_, escreva uma classe utilitária pública e instanciável chamada `CriadorStream`.

Essa classe deve definir os seguintes métodos:

1: `<T> Stream<T> criarDoItem(T item)`
2: `<T> Stream<T> criarDoArray(T[] array)`
3: `<T> Stream<T> criarDaLista(List<T> lista)`

Use seus aprendizados para, em cada método, criar um `Stream` de acordo com o parâmetro recebido. Note que usamos _generics_ definidos na própria assinatura do método para que o `Stream` de retorno tenha o mesmo tipo do objeto que recebemos como parâmetro.

Boa sorte! 👊
