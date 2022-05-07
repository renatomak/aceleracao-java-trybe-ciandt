package com.trybe.acc.java.planejamentodeviagem;

public class Viagem {
  private String embarque;
  private String origem;
  private String destino;
  private double distanciaKm;
  private Voo voo;

  /**
   * Método construtor da classe.
   * 
   * @param distanciaKm string
   * @param origem string
   * @param destino string
   * @param partida string
   * 
   */
  public Viagem(String partida, String origem, String destino, double distanciaKm) {
    this.embarque = partida;
    this.origem = origem;
    this.destino = destino;
    this.distanciaKm = distanciaKm;
    voo = new Voo();
  }

  /**
   * Método para retorno do horário de Desembarque no Destino.
   * 
   */
  public String retonarDesembarqueHorarioLocalDestino() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());
    return tempoViagem.retonarDesembarqueHorarioLocalDestino();
  }

  // aqui consideramos que um aviao percorre em media 700 km a cada hora
  public int retornarDuracaoVoo() {
    return voo.retornarTempoVoo(this.distanciaKm);
  }

  /**
   * Método para retorno da informaçao da viagem.
   * 
   */
  public String retornarInformacaoViagem() {
    Tempo tempoViagem =
        new Tempo(this.embarque, this.origem, this.destino, this.retornarDuracaoVoo());

    String desembarque = tempoViagem.retonarDesembarqueHorarioLocalDestino();
    String embarque = tempoViagem.retonarDesembarqueHorarioLocalOrigem();
    return voo.retornarInformacaoVoo(embarque, origem, desembarque, destino);
  }
}
