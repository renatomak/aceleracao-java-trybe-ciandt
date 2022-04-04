package com.trybe.acc.java.sistemadevotacao;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    UsefulFunctions utils = UsefulFunctions();

    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    
    String nome = "";
    Integer numero = 0;
    String cpf = "";
    short opcao = -1;

    do {
      utils.menuCadastroPessoasCandidatas();
      opcao = scan.nextShort();

      if(opcao == 1) {
        imprimir("Entre com o nome da pessoa candidata: ");
        nome = scan.next();
        imprimir("Entre com o número da pessoa candidata: ");
        numero = scan.nextInt();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }
      
    } while(opcao == 1);
    
    // gerenciamentoVotacao.mostrarCandidatos();
    
    opcao = -1;
    do {
      utils.menuCadastroPessoasEleitoras();
      opcao = scan.nextShort();
      
      if (opcao == 1) {
        imprimir("Entre com o nome da pessoa eleitora: ");
        nome = scan.next();
        imprimir("Entre com o cpf da pessoa eleitora: ");
        cpf = scan.next();
      
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }
    } while(opcao == 1)
    
    // gerenciamentoVotacao.mostrarEleitores();
    opcao = -1;
    do{
      utils.menuVotacao();
      opcao = scan.nextShort();

      switch (opcao) {
        case 1:
          utils.imprimir("Entre com o cpf da pessoa eleitora: ");
          cpf = scan.next();

          utils.imprimir("Entre com o número da pessoa candidata: ");
          numero = scan.nextInt();
          gerenciamentoVotacao.votar(cpf, numero);
          break;
        case 2:
          gerenciamentoVotacao.mostrarResultado();
          break;
      }
    }while(opcao != 3);
    
    gerenciamentoVotacao.mostrarResultado();
    
    scan.close();
    
  }

}
