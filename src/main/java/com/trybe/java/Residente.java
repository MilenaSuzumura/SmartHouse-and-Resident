package com.trybe.java;

/**
 * Classe.
 **/
public class Residente {
  String nome;
  int idade;
  double peso;
  double altura;

  public Residente(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  };

  public double calculaImc() {
    double alturaAoQuadrado = this.altura * this.altura;
    double imc = this.peso / alturaAoQuadrado;
    return imc;
  };
}
