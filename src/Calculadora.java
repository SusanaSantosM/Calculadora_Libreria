package com.Susana;

public class Calculadora {
  public final static int SUMA=1;
  public final static int RESTA=2;
  public final static int MULTIPLICACION=3;
  public final static int DIVISION=4;
  /*
  * Método para realizar una operación entre dos números
  * Suma
  * Resta
  * Multiplicación
  * División
   */

  public static float opcion(Integer opcion, Float numero1, Float numero2) {
    Float resultado= 0.0f;
    switch (opcion) {
      case 1:
        //Suma
        resultado = numero1 + numero2;
      break;
      case 2:
        //Resta
        resultado = numero1 - numero2;
      break;
      case 3:
        //Multiplicación
        resultado = numero1 * numero2;
      break;
      case 4:
        //División
        resultado = numero1 / numero2;
      break;
      default:
        //El null nos sirve para hacer condiciones en lugar de try-catch para el retorno
        resultado = null;

        //System.out.println("Opcion no válida");
        //JOptionPane.showMessageDialog(null,"Opción no válida");
        break;
    } return resultado;
  }
}
