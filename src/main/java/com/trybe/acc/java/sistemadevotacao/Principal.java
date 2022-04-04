package com.trybe.acc.java.sistemadevotacao;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

  public static final NOME_PESSOA = "Entre com o nome da pessoa ";
  public static final NUMERO_PESSOA = "Entre com o número da pessoa candidata: "
  public static final CPF_PESSOA = "Entre com o cpf da pessoa "
  public static final CANDIDATA = "candidata: "
  public static final ELEITORA = "eleitora: "

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    UsefulFunctions utils = UsefulFunctions();

    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    
    String nome = "";
    Integer numero = 0;
    String cpf = "";
    short opcao = 0;

    do {
      utils.menuCadastroPessoasCandidatas();
      opcao = scan.nextShort();

      if(opcao == 1) {
        utils.imprimir(NOME_PESSOA + CANDIDATA);
        nome = scan.next();
        utils.imprimir(NUMERO_PESSOA + CANDIDATA);
        numero = scan.nextInt();
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }
      
    } while(opcao == 1);
    
    // gerenciamentoVotacao.mostrarCandidatos();
    
    opcao = 0;
    do {
      utils.menuCadastroPessoasEleitoras();
      opcao = scan.nextShort();
      
      if (opcao == 1) {
        utils.imprimir(NOME_PESSOA + ELEITORA);
        nome = scan.next();
        utils.imprimir(NUMERO_PESSOA + ELEITORA);
        cpf = scan.next();
      
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }
    } while(opcao == 1)
    
    // gerenciamentoVotacao.mostrarEleitores();
    opcao = 0;
    do{
      utils.menuVotacao();
      opcao = scan.nextShort();

      switch (opcao) {
        case 1:
          utils.imprimir(CPF_PESSOA + ELEITORA);
          cpf = scan.next();

          utils.imprimir(NUMERO_PESSOA + CANDIDATA);
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
