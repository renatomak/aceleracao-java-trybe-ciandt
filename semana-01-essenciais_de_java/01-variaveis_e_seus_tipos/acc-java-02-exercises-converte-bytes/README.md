# Boas vindas ao repositório do desafio "Convertendo bytes em bits" da Aceleração Java!


# Requisitos do desafio

## Convertendo bytes em bits

Desenvolva um algoritmo em Java que, após ler um número do console (que representará um valor X de bytes), imprima quantos bits correspondem a esses bytes no seguinte formato: `X bytes correspondem a X bits`. Use como base o código abaixo. 

🧙‍♂️ **Dica: O objeto System.in é o que faz a leitura do que se escreve no console do Java. Já o System.out.println é o que imprime a saída no console do Java.**

```java
package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class ConverteBytes {
	
	public static void main(String[] args) {
			// Ler a entrada de um número pelo console
			Scanner scan = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.println("Digite um número:");
			byte valor = scan.nextByte();
			
			// Seu código aqui
			
			
			// Imprime a saída no console. OBS: descomente a próxima linha
			//System.out.println(valor + " bytes correspodem a " + qtdBits + " bits");

		}
}

```

## Exemplos

### Exemplo 1

Supondo que o valor armazenado seja 3, então a saída será:
```
3 bytes correspondem a 24 bits.
```

### Exemplo 2

Supondo que o valor armazenado seja 14, então a saída será:
```
14 bytes correspondem a 112 bits.
```


---
