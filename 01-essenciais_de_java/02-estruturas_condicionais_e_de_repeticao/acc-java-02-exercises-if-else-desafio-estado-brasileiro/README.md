# Boas vindas ao repositório do desafio da Aceleração Java!



# Requisitos do desafio: Nomeie o estado brasileiro

Crie um programa no qual
* SE a variável `uf` for igual a `CE` imprima: `CEARA` (sem acento);
* SE a variável `uf` for igual a `SC` imprima: `SANTA CATARINA`.
* SE a variável `uf` for igual a `AM` imprima: `AMAZONAS`;

Use como base o código abaixo:

```java
package exercicios.trybe.EstadosBrasileiros;

import java.util.Random;

public class EstadosBrasileiros {
    public static void main(String[] args) {
	// Sorteia uma UF
	String[] UFs = { "CE", "SC", "AM" };
	int pos = new Random().nextInt(UFs.length);

	// Mostra o nome do estado
	mostraNomeEstado(UFs[pos]);
    }
    
    static void mostraNomeEstado(String uf) {
	// Seu código aqui
    }

    // Chame a função escrevendo `imprime()`
    static void imprime(String nomeEstado) {
	System.out.println(nomeEstado);
    }
}
```

---
