<<<<<<< HEAD
### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado
 
 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

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

# Requisitos do desafio

# Exceção customizada

Estamos construindo um sistema de venda de ingressos para shows. Dentro do sistema, existe a classe `Show`, que trata diversas regras de negócio, entre as quais a permissão de entrada das pessoas. Neste desafio, o show em questão só permite a entrada de pessoas maiores de 18 anos e, para garantir isso, teremos que alterar a classe `Show`.

Dentro dela existe um método chamado `permitirEntrada`, que recebe um parâmetro do tipo `int` representando a idade da pessoa.

Seu desafio aqui é criar e lançar uma exceção customizada para tratar esse erro de forma específica. A exceçẽo deve ser chamada de `PessoaMenorDeIdadeException`, deve herdar de `Exception` e ser do tipo `checked`. Depois de criar essa exceção, você deverá alterar a classe `Show`, mudando o método `permitirEntrada` para que a exceção customizada seja lançada caso a pessoa seja menor de 18 anos.

Uma demanda que parece tranquila, mas muito importante para o bom andamento do evento, não é? #VQV 🧑‍🎤


---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---
=======
# Boas vindas ao repositório dos desafios da Aceleração Java - CI&T e Trybe!

Este repositório contém todas as atividades de aprendizagem desenvolvidas por [Renato Marques da Silva](https://github.com/renatomak) durante o Aceleração [CI&T](https://ciandt.com/br/) em parceiria com a [Trybe](https://www.betrybe.com/):

O programa conta com mais de 125 horas de aulas presenciais e online, aborda introdução ao desenvolvimento de software na linguagem Java e habilidades comportamentais.

## Para testar os projetos:

1. Clone o repositório

- `git clone https://github.com/renatomak/trybe-ciet-bootcamp-java-backend.git`
- Com a IDE de sua preferencia aberta, faça o import do projeto que deseja testar.

2. Instale as dependências:
   - `mvn install`

---

## 01. Essenciais de Java:

1.1 Variáveis e seus tipos:

   - [x] [Antecessor e sucessor](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/01-variaveis_e_seus_tipos/acc-java-02-exercises-antecessor-sucessor)
   - [x] [Calcula area](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/01-variaveis_e_seus_tipos/acc-java-02-exercises-calcula-area)
   - [x] [Calcula IMC](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/01-variaveis_e_seus_tipos/acc-java-02-exercises-calcula-imc)
   - [x] [Converte bytes](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/01-variaveis_e_seus_tipos/acc-java-02-exercises-converte-bytes)
   - [x] [Estado da lampada](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/01-variaveis_e_seus_tipos/acc-java-02-exercises-estado-lampada)
   - [x] [Fatorial](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/01-variaveis_e_seus_tipos/acc-java-02-exercises-fatorial)
   - [x] [Soma elementos](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/01-variaveis_e_seus_tipos/acc-java-02-exercises-soma-elementos)
   - [x] [Conexão discada](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/02-estruturas_condicionais_e_de_repeticao/acc-java-02-exercises-do-while-conexao-discada)
   - [x] [Números pares](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/02-estruturas_condicionais_e_de_repeticao/acc-java-02-exercises-for-numeros-pares)
   - [x] [Estado brasileiro](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/02-estruturas_condicionais_e_de_repeticao/acc-java-02-exercises-if-else-desafio-estado-brasileiro)
   - [x] [Números aleatórios](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/02-estruturas_condicionais_e_de_repeticao/acc-java-02-exercises-while-desafio-numeros-aleatorios)

  1.2 Finalmente, o 'Hello, world!' em Java!

   - [x] [Idade em dias](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/03-finalmente_o_hello_world_em_java/acc-java-02-exercises-idade-em-dias)
   - [x] [Média anual](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/03-finalmente_o_hello_world_em_java/acc-java-02-exercises-media-anual)

### 1º Desafio Agregador

   - [x] [Controle de Acesso](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/desafio-agregador)

## 2. Orientação a objetos:

2.1 Abstração: as Classes em Java

   - [x] [Conta poupança](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-conta-poupanca)

  2.2 Getters e Setters

   - [x] [Encapsulamento-recursos-humanos](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-encapsulamento-recursos-humanos)

  2.3 Encapsulamento e Herança

   - [x] [Gerar pessoa usuária](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-gerar-pessoa-usuaria)
   - [x] [Jogo das Fazendas](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-jogo-das-fazendas)
   - [x] [Polimorfismo-recursos-humanos](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-polimorfismo-recursos-humanos)

### 2º - Desafio Agregador

   - [x] [Sistema de votação](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/desafio-agregador/acc-java-02-exercises-sistema-de-votacao)

## 3. Manipulação de textos e arquivos

3.1 Leitura e escrita em arquivos

   - [x] [Gerador de senhas](https://github.com/renatomak/aceleracao-java-trybe-ciandt/tree/main/semana-03-manituplacao_de_textos_e_arquivos/acc-java-02-exercises-gerador-senhas)

  3.2 Lidando com Strings

   - [x] [Transforma texto](https://github.com/renatomak/aceleracao-java-trybe-ciandt/tree/main/semana-03-manituplacao_de_textos_e_arquivos/acc-java-02-exercises-transforma-texto)

## 3º Desafio Agregador

   - [x] [Conversor CSV](https://github.com/renatomak/aceleracao-java-trybe-ciandt/tree/main/semana-03-manituplacao_de_textos_e_arquivos/desafio-agregador/acc-java-02-exercises-conversor-csv)

## 4. Tratamento de erros

4.1 Try/Catch

   - [x] [Divisor](https://github.com/renatomak/aceleracao-java-trybe-ciandt/tree/main/04-tratamento_de_erros/acc-java-02-exercises-divisor)
   - [x] [Tratando nulos](https://github.com/renatomak/aceleracao-java-trybe-ciandt/tree/main/04-tratamento_de_erros/acc-java-02-exercises-tratando-nulos)

  4.2 Refinando seu tratamento de erros

   - [ ] [Maior Idade]()
   - [ ] [Leitura de arquivos]()
>>>>>>> 47ab55bf01a4909f431d852bcb34d82c1b9aeaff
