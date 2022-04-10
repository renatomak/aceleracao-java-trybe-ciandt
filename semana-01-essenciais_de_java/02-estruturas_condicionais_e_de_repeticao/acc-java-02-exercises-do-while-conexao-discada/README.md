# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio: Conexão discada

Faça um algoritimo que simule conexão discada à internet que faça três tentativas e, caso a conexão seja estabelecida ou ocorram três tentativas, o processo seja interrompido. Use como base o código abaixo. Chame a função `conectou()` para simular cada tentativa de conexão e verificar se ela teve sucesso.

```java
package exercicios.trybe.conexaoDiscada;

import java.util.Random;

public class ConexaoDiscada {
    public static void main(String[] args) {
	// Seu código aqui
    }

    // Chame esta função escrevendo `conectou()`
    static boolean conectou() {
	return conexaoDiscada.verdadeiroOuFalso();
    }

    static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

    boolean verdadeiroOuFalso() {
	return new Random().nextInt(2) == 1;
    }

}
```

---

# Avisos Finais
