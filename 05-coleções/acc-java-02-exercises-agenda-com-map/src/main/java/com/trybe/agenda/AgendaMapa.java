package com.trybe.agenda;

import java.util.HashMap;
import java.util.Map;


public class AgendaMapa {

  Map<String, String> agenda = new HashMap<String, String>();

  public Integer tamanhoAgenda() {
    return agenda.size();
  }

  public boolean verificaContato(String nome) {
    return agenda.containsKey(nome);
  }

  public void excluirContato(String nome) {
    agenda.remove(nome);
  }

  public void incluirContato(String nome, String telefone) {
    agenda.put(nome, telefone);
  }

  public void atualizarTelefone(String nome, String telefone) {
    agenda.put(nome, telefone);
  }

  public Object obterTelefone(String nome) {
    return agenda.get(nome);
  }

}
