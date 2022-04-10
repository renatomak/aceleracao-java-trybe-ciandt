# Boas vindas ao repositório do desafio da Aceleração Java!


## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

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
