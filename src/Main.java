package com.Susana;

public class Main {
  public static void main(String[] args) {
      Float retorno = Calculadora.opcion(4,2f,4f);
  // condición que indica
      if(retorno==null)//Método para indicar si devuelve un número
        System.out.println("Algo falla");
      else
        System.out.println("El resultado es: "+retorno);
  }
}