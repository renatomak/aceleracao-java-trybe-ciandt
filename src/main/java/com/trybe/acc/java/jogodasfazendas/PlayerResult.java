package com.trybe.acc.java.jogodasfazendas;

import java.util.ArrayList;
import java.util.List;

public class PlayerResult {

  private String playerName;
  private Farm[] farms;

  /**
   * @param playerName
   * @param farms
   */
  public PlayerResult(String playerName, Farm[] farms) {
    super();
    this.playerName = playerName;
    this.farms = farms;
  }

  /**
   * @return
   */
  public double score() {
    double sum = 0;

    for (int i = 0; i < farms.length; i++) {
      sum += farms[i].area();
    }
    return sum;
  }

  @Override
  public String toString() {
    return "PlayerResult [playerName=" + playerName + ", score()=" + score() + ", getClass()="
        + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }

}
