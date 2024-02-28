package com.trybe.java;

/**
 * Classe.
 **/
public class SmartHouse {
  boolean lampada;

  public SmartHouse() {
    this.lampada = false;
  };

  public void ligarLampada() {
    this.lampada = true;
  };

  public void desligarLampada() {
    this.lampada = false;
  };

  public boolean isLampadaLigada() {
    return this.lampada;
  };
}
