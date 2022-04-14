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

## Conversor de CSV

Você trabalha em um sistema que processa inscrições de pessoas para um evento nacional. As pessoas se inscrevem por meio de uma página web. No final do período de inscrições, os dados de todos os inscritos são compilados em arquivos CSV (valores separados por vírgula, do inglês Comma-Separated Values).

Existe um subsistema responsável pelo pós-processamento das inscrições que suporta arquivos CSV. Porém a formatação das informações que esse subsistema espera receber é diferente da formatação dos arquivos gerados pela página web.

**O seu objetivo é elaborar um programa em Java que seja capaz de converter os arquivos gerados pela página web para o formato requerido pelo subsistema.**


## Descrição dos arquivos de entrada e saída

Os arquivos CSV gerados pela página web estão disponíveis na pasta `entradas`, estando separados por estado. Por exemplo: `sp.csv`, `mg.csv`, `ba.csv` (não limitado a esses três!). Para cada arquivo contido na pasta `entradas`, você deve criar um arquivo correspondente com o mesmo nome na pasta `saidas`.

Os arquivos de entrada podem ser tratados como arquivos de texto e possuem a seguinte estrutura-padrão: 

- A primeira linha é sempre um cabeçalho fixo que contém os nomes das colunas separados por vírgula:
```text
Nome completo,Data de nascimento,Email,CPF
```

- Cada uma das linhas seguintes contém as informações de um inscrito, também separadas por vírgula. Exemplo:
```text
Moacir Monforte,04/07/1986,monforte@yahoo.com,72614377279
```

São garantidas as seguintes condições a respeito dos arquivos de entrada:

- Toda data de nascimento está em formato brasileiro: `dd/mm/aaaa`
- Todo email é válido
- Todo CPF é válido e composto por exatamente 11 dígitos decimais (sem ponto nem hífen)

Os nomes completos dos inscritos podem estar em letras maiúsculas, minúsculas ou meio a meio.

A formatação requerida para os arquivos de saída é a seguinte:
- O cabeçalho deve ser o mesmo dos arquivos de entrada.
- Os nomes completos dos inscritos devem ser padronizados todos em letras maiúsculas (acentos gráficos devem ser mantidos).
- As datas de nascimento devem estar no formato ISO-8601: `aaaa-mm-dd`.
- Os números de CPF devem estar corretamente formatados com ponto e hífen. Exemplo: `123.456.789-09`.

As linhas dos arquivos de saída devem estar dispostas na mesma ordem que as dos arquivos de entrada.

## Exemplo

Para o arquivo de entrada a seguir: `entradas/sp.csv`
```text
Nome completo,Data de nascimento,Email,CPF
IRANI TAPEREBÁ,29/06/2001,tapereba@gmail.com,81627775471
catarina mafra,28/05/1991,cmafra@gmail.com,75157671466
bento naves,25/12/1993,b.naves@aol.com,88826690685
Lurdes Neves,08/04/1985,lurdes.neves85@verizon.net,92277079138
```

Deve ser produzido o seguinte arquivo de saída: `saidas/sp.csv`
```text
Nome completo,Data de nascimento,Email,CPF
IRANI TAPEREBÁ,2001-06-29,tapereba@gmail.com,816.277.754-71
CATARINA MAFRA,1991-05-28,cmafra@gmail.com,751.576.714-66
BENTO NAVES,1993-12-25,b.naves@aol.com,888.266.906-85
LURDES NEVES,1985-04-08,lurdes.neves85@verizon.net,922.770.791-38
```

## Requisitos do código

O seu código deve ser construído a partir da classe `Conversor` abaixo:

```java
import java.io.File;
import java.io.IOException;

public class Conversor {

  public static void main(String[] args) throws IOException {
    File pastaDeEntradas = new File("./entradas/");
    File pastaDeSaidas = new File("./saidas/");
    new Conversor().converterPasta(pastaDeEntradas, pastaDeSaidas);
  }

  public void converterPasta(File pastaDeEntradas, File pastaDeSaidas) throws IOException {
    // TODO: Implementar.
  }
}
```

Você pode adicionar quantos métodos e atributos auxiliares à classe `Conversor` você desejar, desde que o nome da classe e a assinatura do método `converterPasta` sejam preservados.

Para este desafio, você não precisa se preocupar em tratar exceções (elas serão vistas na próxima seção 😉). Ao escrever certos métodos auxiliares, pode ser que você precise adicionar `throws IOException` à assinatura deles para evitar erros de compilação.

Agora é com você! O sistema de inscrições está em suas mãos, então foco na qualidade do resultado, combinado? #VQV 🚀

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

## Semana 01:

30/03 - Essenciais de Java - Variáveis e seus tipos:

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

31/03 - Essenciais de Java - Finalmente, o 'Hello, world!' em Java!

- [x] [Idade em dias](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/03-finalmente_o_hello_world_em_java/acc-java-02-exercises-idade-em-dias)
- [x] [Média anual](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/03-finalmente_o_hello_world_em_java/acc-java-02-exercises-media-anual)

### 01/04 - Desafio Agregador

- [x] [Controle de Acesso](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-01-essenciais_de_java/desafio-agregador)

## Semana 02:

05/04 - Orientação a objetos - Abstração: as Classes em Java

- [x] [Conta poupança](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-conta-poupanca)

05/04 - Orientação a objetos - Getters e Setters

- [x] [Encapsulamento-recursos-humanos](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-encapsulamento-recursos-humanos)

06/04 - Orientação a objetos - Encapsulamento e Herança

- [x] [Gerar pessoa usuária](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-gerar-pessoa-usuaria)
- [x] [Jogo das Fazendas](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-jogo-das-fazendas)
- [x] [Polimorfismo-recursos-humanos](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/acc-java-02-exercises-polimorfismo-recursos-humanos)

### 12/04 - Desafio Agregador

- [x] [Sistema de votação](https://github.com/renatomak/trybe-ciet-bootcamp-java-backend/tree/main/semana-02-orientacao_a_objetos/desafio-agregador/acc-java-02-exercises-sistema-de-votacao)

13/04 - Manipulação de textos e arquivos - Leitura e escrita em arquivos

- [X] [Gerador de senhas](https://github.com/renatomak/aceleracao-java-trybe-ciandt/tree/main/semana-03-manituplacao_de_textos_e_arquivos/acc-java-02-exercises-gerador-senhas)

13/04 - Manipulação de textos e arquivos - Lidando com Strings

- [x] [Transforma texto](https://github.com/renatomak/aceleracao-java-trybe-ciandt/tree/main/semana-03-manituplacao_de_textos_e_arquivos/acc-java-02-exercises-transforma-texto)

### 14/04 - Manipulação de textos e arquivos - Desafio Agregador

- [ ] [Conversor CSV]()
>>>>>>> 917f4716fe609d4433ea50541c36830799ecea18
