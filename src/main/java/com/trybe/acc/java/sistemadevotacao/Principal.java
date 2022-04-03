package com.trybe.acc.java.sistemadevotacao;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

  protected static final String menu = String
      .format("\n1 - Sim\n" + "2 - Não\n" + "Entre com o número correspondente à opção desejada:");

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    
    String nome = "";
    Integer numero = 0;
    String cpf = "";
    int opcaoVotacao = 0;



    while (menuCadastroPessoasCandidatas() == 1) {
      imprimir("Entre com o nome da pessoa candidata: ");
      nome = scan.next();
      

      imprimir("Entre com o número da pessoa candidata: ");
      numero = scan.nextInt();
      gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
    }
    
    gerenciamentoVotacao.mostrarCandidatos();
    

    while (menuCadastroPessoasEleitoras() == 1) {
      imprimir("Entre com o nome da pessoa eleitora: ");
      nome = scan.next();
      imprimir("Entre com o cpf da pessoa eleitora: ");
      cpf = scan.next();
      
      gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
    }
    
    gerenciamentoVotacao.mostrarEleitores();
    
    do{
      opcaoVotacao = menuVotacao();
      
      switch (opcaoVotacao) {
        case 1:
          imprimir("Entre com o cpf da pessoa eleitora: ");
          cpf = scan.next();

          imprimir("Entre com o número da pessoa candidata: ");
          numero = scan.nextInt();
          gerenciamentoVotacao.votar(cpf, numero);
          break;
        case 2:
          gerenciamentoVotacao.mostrarResultado();
          break;
      }
    }while(opcaoVotacao != 3);
    
    gerenciamentoVotacao.mostrarResultado();
    
    scan.close();
    
  }

  static void imprimir(String message) {
    System.out.println(message);
  }

  // Por quê não posso fechar o scan dentro da primeira função de menu a ser chamada?
  static short menuCadastroPessoasCandidatas() {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    String menu = String.format("Cadastrar pessoa candidata?" + Principal.menu);

    System.out.println(menu);
    short escolha = scan.nextShort();
    // scan.close();
    return escolha;
  }

  static short menuCadastroPessoasEleitoras() {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    String menu = String.format("Cadastrar pessoa eleitora?" + Principal.menu);

    System.out.println(menu);
    short escolha = sc.nextShort();
    // sc.close();
    return escolha;
  }

  static short menuVotacao() {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    String menu = String.format("Entre com o número correspondente à opção desejada:\n"
        + "1 - Votar\n" + "2 - Resultado Parcial\n" + "3 - Finalizar Votação");

    System.out.println(menu);
    short escolha = sc.nextShort();
    return escolha;
  }

}
