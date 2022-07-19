# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio


### Calculadora

Crie uma API capaz de receber dois valores e uma operação que possa realizar o cálculo e retornar o resultado à pessoa cliente.
A aplicação receberá três parâmetros, sendo eles:
- `primeiroValor` do tipo Integer
- `segundoValor` do tipo Integer
- `operacao` do tipo String

> Para o campo `operacao`, assuma que receberá apenas os seguintes valores: [`ADICAO`, `SUBTRACAO`, `MULTIPLICAO`, `DIVISAO`].
> Em casos de erros, como divisão por zero, assuma o valor `0` como resultado.
 

```
Cenário 1:
Entrada: http://localhost:8080/?primeiroValor=2&segundoValor=2&operacao=ADICAO
Saida:
- payload: {"valor": 4}

Entrada: http://localhost:8080/?primeiroValor=2&segundoValor=2&operacao=SUBTRACAO 
Saida:
- payload: {"valor": 0}

Entrada: http://localhost:8080/?primeiroValor=2&segundoValor=2&operacao=MULTIPLICACAO 
Saida:
- payload: {"valor": 4}

Entrada: http://localhost:8080/?primeiroValor=2&segundoValor=2&operacao=DIVISAO 
Saida:
- payload: {"valor": 1}

Entrada: http://localhost:8080/?primeiroValor=2&segundoValor=0&operacao=DIVISAO 
Saida:
- payload: {"valor": 0}
```
