package com.trybe.acc.java.sistemadevotacao;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

  public static final String NOME_PESSOA = "Entre com o nome da pessoa ";
  public static final String NUMERO_PESSOA = "Entre com o número da pessoa ";
  public static final String CPF_PESSOA = "Entre com o cpf da pessoa ";
  public static final String CANDIDATA = "candidata: ";
  public static final String ELEITORA = "eleitora: ";

  /**
   * main.
   * 
   * @param args string
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    String nome = "";
    Integer numero = 0;
    String cpf = "";
    short opcao = 0;

    do {
      Utils.menuCadastroPessoasCandidatas();
      opcao = scan.nextShort();

      if (opcao == 1) {
        Utils.imprimir(NOME_PESSOA + CANDIDATA);
        nome = scan.next();
        Utils.imprimir(NUMERO_PESSOA + CANDIDATA);
        numero = scan.nextInt();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }

    } while (opcao == 1);



    opcao = 0;
    do {
      Utils.menuCadastroPessoasEleitoras();
      opcao = scan.nextShort();

      if (opcao == 1) {
        Utils.imprimir(NOME_PESSOA + ELEITORA);
        nome = scan.next();
        Utils.imprimir(NUMERO_PESSOA + ELEITORA);
        cpf = scan.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }
    } while (opcao == 1);

    opcao = 0;
    do {
      Utils.menuVotacao();
      opcao = scan.nextShort();

      switch (opcao) {
        case 1:
          Utils.imprimir(CPF_PESSOA + ELEITORA);
          cpf = scan.next();

          Utils.imprimir(NUMERO_PESSOA + CANDIDATA);
          numero = scan.nextInt();
          gerenciamentoVotacao.votar(cpf, numero);
          break;
        case 2:
          gerenciamentoVotacao.mostrarResultado();
          break;
        default:
          break;
      }
    } while (opcao != 3);

    gerenciamentoVotacao.mostrarResultado();

    scan.close();


  }

}
