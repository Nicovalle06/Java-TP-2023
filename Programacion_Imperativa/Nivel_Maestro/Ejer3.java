package Nivel_Maestro;
/*
  * Cálculo de la hipotenusa de un triángulo:
    Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
    dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
    hipotenusa, a y b son los catetos.

  */
public class Ejer3 {
    public static void main(String[] args) {
        
        int catetoA = 10;
        int catetoB = 5;

        double calculoHipotenusa = Math.sqrt(catetoA*catetoA + catetoB*catetoB);

        System.out.println("El resultado de la hipotenusa es: " + calculoHipotenusa);
    }
}
