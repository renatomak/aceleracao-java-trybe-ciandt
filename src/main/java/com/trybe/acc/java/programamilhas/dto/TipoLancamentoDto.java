package com.trybe.acc.java.programamilhas.dto;

import com.trybe.acc.java.programamilhas.model.TipoLancamento;

public class TipoLancamentoDto {

  private String descricao;

  public TipoLancamentoDto() {}

  public TipoLancamentoDto(TipoLancamento entity) {
    this.descricao = entity.getDescricao();
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

}
