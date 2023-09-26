package Nivel_Caballero;
/*
    * Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
    porcentaje que indique el segundo número del primer número.
*/

public class Ejer1 {
    public static void main(String[] args) {
        
        double NumReal = 3.0;
        int NumEntero = 4;

        double porcentaje = (NumEntero * 100.00) / NumReal;

        System.out.println("El porcentaje es: " + porcentaje + " %");
    }
}
