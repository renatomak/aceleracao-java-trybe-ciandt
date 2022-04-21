# Requisitos do desafio

## Tratando nulos

Neste desafio, você receberá uma classe de ajuda chamada `NullGenerator`. Essa classe possui um método chamado `getNome`, que recebe um número inteiro como parâmetro. Se esse número for par, ele vai retornar o nome BOB, em letras maiúsculas. Se for ímpar, será lançada uma exceção.

Seu desafio é criar uma classe chamada `NullGuard`, contendo apenas um método chamado `printName`, que recebe um parâmetro do tipo `int` e retorna um valor do tipo `String`, conforme esqueleto abaixo:

```java
public class NullGuard {

	public String printName(int divisor) {
        //seu código será inserido aqui
	}
}
```

Dentro desse método, você terá que criar uma instância de `NullGenerator` e chamar o método `getNome()`, passando o `divisor` como argumento. Em caso de sucesso, deverá retornar o valor obtido através do método `getNome()`; em caso de erro, deverá tratar a exceção que pode ser lançada nesse método, retornando um valor do tipo `String` escrito "Nome nulo".

---
