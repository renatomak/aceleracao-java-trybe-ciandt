# Boas vindas ao repositório do desafio "Calculando área do quadrado" da Aceleração Java!


# Requisitos do desafio

## Calculando área do quadrado 

Desenvolva um algoritmo em Java que, após ler um número do console que representará o lado de um quadrado, calcula a área e imprime a informação no seguinte formato: `A area do quadrado de lado X é igual a Y`. Use como base o código abaixo. 

🧑‍🏫 **Dica: O objeto System.in é o que faz a leitura do que se escreve no console do Java. Já o System.out.println é o que imprime a saída no console do Java.**

```java
package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class Area {
  public static void main(String[] args) {
    
      // Ler a entrada de um número pelo console
      Scanner scan = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite a medida do lado do quadrado:");
      double lado = scan.nextDouble();
      
      // Seu código aqui


      // Imprime a saída no console. OBS: descomente a próxima linha
      //System.out.println("A area do quadrado de lado "+ lado + " é igual a " + area);
  }
  
}
```

## Exemplos

### Exemplo 1

Supondo que o valor do lado é 3, então a saída será:
```
A área do quadrado de lado 3 é igual a 9. 
```

### Exemplo 2

Supondo que o valor do lado é 5, então a saída será:
```
A área do quadrado de lado 5 é igual a 25. 
```
