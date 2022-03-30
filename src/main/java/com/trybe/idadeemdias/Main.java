package com.trybe.idadeemdias;

import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    String nome = "";
    int idade = 0;
    int meses = 0;
    int dias = 0;

    System.out.println("Qual é o seu nome?");
    nome = scan.next();
    System.out.println("Idade (em anos): ");
    idade = scan.nextInt();
    System.out.println("meses completos após último aniversário: ");
    meses = scan.nextInt();
    System.out.println("dia do mês atual: ");
    dias = scan.nextInt();

    Pessoa pessoa = new Pessoa(nome);

    int idadeEmDias = pessoa.calcularIdadeEmDias(idade, meses, dias);
    System.out.println("Olá " + pessoa.getNome() + ", sua idade em dias é " + idadeEmDias);

  }

}
