# Boas vindas ao repositório do desafio "Calculando IMC" da Aceleração Java!

# Requisitos do desafio

## Calculando IMC

Desenvolva um algoritmo em Java que, após ler dois números do console (respectivamente, o peso e a altura de uma pessoa), calcula o IMC, considerando apenas 4 casas decimais. Por fim, ainda imprime o resultado do IMC. Use como base o código abaixo. 

🧙‍♂️ **Dica: O objeto System.in é o que faz a leitura do que se escreve no console do Java. Já o System.out.println é o que imprime a saída no console do Java.**

```java
package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
			// Ler a entrada de um número pelo console	
			Scanner scan = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.println("Digite o peso:");
			float peso = scan.nextFloat();
			
			System.out.println("Digite a aultura:");
			float altura = scan.nextFloat();
			
			// Seu código aqui
			
					
			// Imprime a saída no console. OBS: descomente a próxima linha
			//System.out.println(imc);

	}

}

```

## Exemplos

### Exemplo 1

Supondo que os dados sejam: peso igual a 54kg e altura igual a 1.70, então a saída será:
```
18.68512
```

### Exemplo 2

Supondo que os dados sejam: peso igual a 67kg e altura igual a 1.90, então a saída será:
```
18.559557
```



---
