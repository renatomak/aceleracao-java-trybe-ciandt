package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoVotacao {

  private List<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private List<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private List<String> cpfComputado = new ArrayList<String>();
  private int totalVotos;

  public void cadastrarPessoaCandidata(String nome, Integer numero) {
    boolean isIncluded = false;

    for(int i = 0; i < pessoasCandidatas.size(); i++) {
      if(pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
        isIncluded = true;
        break;
      }
    }
    if(!isIncluded) {
      PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(pessoaCandidata);
    }
  }

  public void cadastrarPessoaEleitora(String nome, String cpf) {
    boolean isIncluded = false;

    for(int i = 0; i < pessoasEleitoras.size(); i++) {
      if(pessoasEleitoras.get(i).getCpf().compareTo(cpf) == 0) {
        System.out.println("Pessoa eleitora já cadastrada!");
        isIncluded = true;
        break;
      }
    }
    if(!isIncluded) {
      PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(pessoaEleitora);
    }
  }

  public void votar(String cpfPessoaEleitora, Integer numeroPessoaCandidata) {
    boolean isIncluded = false;
    for(int i = 0; i < cpfComputado.size(); i++) {
      if (cpfComputado.get(i).compareTo(cpfPessoaEleitora) == 0) {
        System.out.println("Pessoa eleitora já votou!");
        isIncluded = true;
        break;
      }
    }
    if(!isIncluded) {
      pessoasCandidatas.forEach(pessoa -> {
        if (pessoa.getNumero() == numeroPessoaCandidata) {
          pessoa.receberVoto();
          cpfComputado.add(cpfPessoaEleitora);
        }
      });
    }
  }

  public void mostrarResultado() {
    if(totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      pessoasCandidatas.forEach(pessoa -> {
        System.out.println("Nome: " + pessoa.getNome() + " - " + pessoa.getVotos() + "( " + calcularPorcentagemVotos(pessoa.getVotos()) + "% )");
      });
      System.out.println("Total de votos: " + totalVotos);
    }
  }
  
  private double calcularPorcentagemVotos(Integer votos) {
    return Math.round((votos / totalVotos) * 100);
  }
  
  public void mostrarEleitores() {
    pessoasCandidatas.forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() + " - Numero: " + pessoa.getNumero() + " - Votos: " + pessoa.getVotos()));
  }
  
  public void mostrarCandidatos() {
    pessoasEleitoras.forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() + " - CPF: " + pessoa.getCpf()));
  }


}
