package com.trybe.acc.java.transformatexto;

/** Classe texto. */
public class Texto {
  /** Transforma texto. */
  public String transformaTexto(String frase) {
    String novaFrase = frase.replace('+', ' ');
    String[] separaPalavras = novaFrase.split(" ");
    int letraIndice = frase.indexOf('a');
    
    if ((letraIndice % 2) == 0) {
      return novaFrase.toUpperCase();
    } else {
      return separaPalavras[0];
    }
  }  
}
