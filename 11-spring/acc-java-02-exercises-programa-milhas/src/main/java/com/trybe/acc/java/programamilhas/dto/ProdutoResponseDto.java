package com.trybe.acc.java.programamilhas.dto;

import com.trybe.acc.java.programamilhas.model.Produto;

public class ProdutoResponseDto {
  
  private Integer idParceiro;

  private Integer valor;

  private String descricao;
  
  

  /**
   * Method constructor.
   * 
   * @param entity type Produto.
   */
  public ProdutoResponseDto(Produto entity) {
    this.idParceiro = entity.getParceiro().getId();
    this.valor = entity.getValor();
    this.descricao = entity.getDescricao();
  }

  public Integer getIdParceiro() {
    return idParceiro;
  }

  public void setIdParceiro(Integer idParceiro) {
    this.idParceiro = idParceiro;
  }

  public Integer getValor() {
    return valor;
  }

  public void setValor(Integer valor) {
    this.valor = valor;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
}
