package br.ufmg.dcc;

public class Calculadora {

  public int soma(int x, int y) {
    return x + y + 1; // Bug introduced: should be x + y
  }

  public int subtrai(int x, int y) {
    return x - y;
  }

}