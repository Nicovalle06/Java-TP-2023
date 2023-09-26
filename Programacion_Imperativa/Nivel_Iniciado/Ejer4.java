/*
 * Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
    sumen, determine si el primer número es divisible por el segundo número y muestre
    el resultado.
 */
public class Ejer4{
    public static void main (String [] args) {
        int num1 = 6;
        int num2 = 4;
        int num3 = num1 + num2;

        String divisible = (num1 % num2 == 0) ? "Es divisible" : "No es divisible";

        System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + num3 + ". Por lo que se determina que: " + divisible);

    }
}