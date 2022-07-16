# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio

## Calcular a média das notas de uma pessoa usuária

Escreva uma classe para conter seu método `main` que leia o nome de uma pessoa usuária do console Java e mais quatro valores que serão referentes às notas de 4 avaliações. 
Escreva uma segunda classe Java que calcule a média das 4 notas que a pessoa usuária entrou. Você deve chamar a classe de `Nota`. Essa classe deve conter um método chamado `calcularMedia`, que recebe 4 argumentos do tipo `float` ou `double`: nota1, nota2, nota3 e nota4. Esse método deve calcular e retornar a média, e esse retorno deve ser do tipo `float` ou `double`. Em outras palavras:

1. a pessoa deve entrar com seu nome e quatro valores decimais;
2. o método `calcularMedia` deve calcular e retornar a média dos valores inseridos pela pessoa usuária.

*Lembre-se* de que você deve fazer a conversão da entrada da pessoa usuária para `float` ou `double` para poder realizar o cálculo, pois o método `scanner.next()` lê a entrada da pessoa usuária e converte para `String`.

### Exemplos

#### Exemplo 1
Supondo que minha entrada seja:
```bash
Qual é o seu nome?
Carla
Entre com as notas das provas:
Avaliação 1:
9.85
Avaliação 2:
9.58
Avaliação 3:
9.90
Avaliação 4:
8.75
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe `Nota`, passamos as notas das avaliações para o método `calcularMedia(9.85, 9.58, 9.90, 8.75)`, e a saída da método `calcularMedia(9.85, 9.58, 9.90, 8.75)` deve ser `9.52`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Carla
Entre com as notas das provas:
Prova 1:
9.85
Prova 2:
9.58
Prova 3:
9.90
Prova 4:
8.75
Olá, Carla, sua média é 9.52
```

#### Exemplo 2
Nesse segundo exemplo, supondo que a entrada seja:
```bash
Qual é o seu nome?
Paulo
Entre com as notas das avaliações:
Avaliação 1:
7.80
Avaliação 2:
6.5
Avaliação 3:
10.00
Avaliação 4:
8.75
```
Aqui nós lemos as entradas da pessoa usuária, fizemos as devidas conversões, instanciamos a classe `Nota`, passamos as notas das provas para o método `calcularMedia(7.80, 6.5, 10.00, 8.75)`, e a saída da método `calcularMedia(7.80, 6.5, 10.00, 8.75)` deve ser `8.2625`. Ou seja, a saída final do programa deve ser similar a essa:
```bash
Qual é o seu nome?
Paulo
Entre com as notas das avaliações:
Avaliação 1:
7.80
Avaliação 2:
6.5
Avaliação 3:
10.00
Avaliação 4:
8.75
Olá, Paulo, sua média é 8.2625
```


---
