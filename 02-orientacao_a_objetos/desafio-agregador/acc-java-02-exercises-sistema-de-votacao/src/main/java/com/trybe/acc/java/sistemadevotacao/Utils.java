package com.trybe.acc.java.sistemadevotacao;



public class Utils {

  protected static final String menu = String
      .format("\n1 - Sim\n" + "2 - Não\n" + "Entre com o número correspondente à opção desejada:");

  static void imprimir(String message) {
    System.out.println(message);
  }

  static void menuCadastroPessoasCandidatas() {
    String menu = String.format("Cadastrar pessoa candidata?" + Utils.menu);
    System.out.println(menu);
  }

  static void menuCadastroPessoasEleitoras() {
    String menu = String.format("Cadastrar pessoa eleitora?" + Utils.menu);
    System.out.println(menu);
  }

  static void menuVotacao() {
    String menu = String.format("Entre com o número correspondente à opção desejada:\n"
        + "1 - Votar\n" + "2 - Resultado Parcial\n" + "3 - Finalizar Votação");
    System.out.println(menu);
  }
}
