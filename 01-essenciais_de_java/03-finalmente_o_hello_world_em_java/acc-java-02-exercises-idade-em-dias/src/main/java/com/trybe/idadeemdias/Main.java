package com.trybe.idadeemdias;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  /**
  * The main method.
  *
  * @param args the arguments
  */    
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Qual é o seu nome?");
    String nome = scan.next();
    System.out.println("Idade (em anos): ");
    int idade = scan.nextInt();
    System.out.println("meses completos após último aniversário: ");
    int meses = scan.nextInt();
    System.out.println("dia do mês atual: ");
    int dias = scan.nextInt();

    Pessoa pessoa = new Pessoa(nome);

    int idadeEmDias = pessoa.calcularIdadeEmDias(idade, meses, dias);
    System.out.println("Olá " + pessoa.getNome() + ", sua idade em dias é " + idadeEmDias);

  }

}
