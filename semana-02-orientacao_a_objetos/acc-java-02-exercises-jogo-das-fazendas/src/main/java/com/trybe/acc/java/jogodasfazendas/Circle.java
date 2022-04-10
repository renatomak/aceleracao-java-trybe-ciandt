package com.trybe.acc.java.jogodasfazendas;

public class Circle implements Farm {

  private static final double PI = 3.14;
  private double radius;


  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  @Override
  public double area() {
    // TODO Auto-generated method stub
    return PI * radius * radius;
  }

}
