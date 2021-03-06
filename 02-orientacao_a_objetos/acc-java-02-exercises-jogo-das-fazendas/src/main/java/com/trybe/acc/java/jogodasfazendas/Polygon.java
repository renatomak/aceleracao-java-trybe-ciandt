package com.trybe.acc.java.jogodasfazendas;

public abstract class Polygon implements Farm {

  protected double base;
  protected double height;

  /**
   * Polygon method.
   * @param base double
   * @param height double
   */
  public Polygon(double base, double height) {
    super();
    this.base = base;
    this.height = height;
  }


  @Override
  public double area() {
    // TODO Auto-generated method stub
    return base * height;
  }

}
