# Boas vindas ao repositório do desafio da Aceleração Java!



# Requisitos do desafio: Números aleatórios

Faça um algoritimo que imprima valores aleatórios de 1 a 5 até que o valor selecionado seja 4 (você também deve imprimir esse 4).

Use como base o código abaixo. Chame a função `numeroAleatorio()` para gerar um número e a função `imprime()` para imprimi-lo.

```java
package exercicios.trybe.NumerosAleatorios;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
	// Seu código vai aqui
    }

    // Chame a função escrevendo `imprime()`
    static void imprime(int numero) {
	System.out.println(numero);
    }

    // Chame a função escrevendo `numeroAleatorio()`
    static int numeroAleatorio() {
	return numerosAleatorios.entreUmECinco();
    }

    static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

    int entreUmECinco() {
	return new Random().nextInt(5) + 1;
    }
}
```

---
