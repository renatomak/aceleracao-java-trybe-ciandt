# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

## Simulador de Rendimento

Agora é a hora de você colocar em prática o que aprendeu sobre a classe `LocalDateTime`!
Aqui nesse desafio você deverá montar um simulador de rendimentos. A pessoa usuária deve entrar com um montante de dinheiro inicial e com o valor que objetiva ter no futuro, e, por fim, seu simulador deve dizer em que ano o objetivo terá sido atingido ou ultrapassado.

Você terá que escrever uma classe nomeada `SimuladorRendimento`, e nela deve haver um método chamado `simularRendimentoAnos`.
Esse método `simularRendimentoAnos` deve receber dois argumentos `double`: um representando o valor do montante inicial, outro representando o valor do objetivo. O retorno deve ser um número inteiro que representa o ano futuro em que o objetivo será alcançado ou ultrapassado. Os passos desse método são:

1- o método `simularRendimentoAnos` recebe dois argumentos `double`, que representam o valor inicial e o valor do objetivo, respectivamente;
2- considerando que o rendimento anual é de 10%, o método deve calcular quantos anos serão necessários para o valor inicial alcançar o valor do objetivo;
3- o método deve usar a classe `LocalDateTime` para pegar o ano atual (ex: 2022), somar a quantidade de anos que foram calculados no passo anterior e retornar em que ano do nosso calendário o valor do objetivo será alcançado. (Dicas: utilize os métodos `.plusYears()` e `.getYear()` para fazer essa manipulação.)
4- retornar um inteiro que representa o ano em que o objetivo será alcançado ou ultrapassado (ex: 2047).

# Exemplo

Se eu chamar o método `simularRendimentoAnos` passando 500 como valor inicial, e 5000 como valor do objetivo, considerando que estou executando isso no ano 2022, o retorno do método deve ser 2047. Isso porque o rendimento é de 10%, então para o valor inicial 500 alcançar 5000, levará 25 anos.

Note: se meu valor inicial é 500, no primeiro ano, com o rendimento de 10%, o valor que terei será 550. Para o segundo ano, o rendimento é calculado em cima do valor 550, ou seja, um rendimento de 10% em cima de 550 gera 605. No terceiro ano, o rendimento é calculado em cima do valor 605, e assim sucessivamente. Em outras palavras, como é rendimento, é cumulativo.

500 -> inicial

550 -> primeiro ano

605 -> segundo ano

665.5 -> terceiro ano

732.05 -> quarto ano

...

4924.87 -> vigésimo quarto ano

5417.36 -> vigésimo quinto ano

Adicione esse método `main` na sua classe `SimuladorRendimento`:

```java
public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo
            + " no ano " + obj.simularRendimentoAnos(inicial, objetivo));
}
```

Após executar seu programa, a saída deverá ser:

```
Com 500.0 seu rendimento será 5000.0 no ano 2047
```
