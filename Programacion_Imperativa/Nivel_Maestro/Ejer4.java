package Nivel_Maestro;
/*
 *  Cálculo de la media aritmética:
    Escribir un programa en Java que calcule la media aritmética de un conjunto de
    números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
    los números y k es el número total de elementos. Utilicen variables y constantes
    según corresponda.
    Muestre el resultado por pantalla.
 */
public class Ejer4 {
    
    public static void main(String[] args) {
        
        double n1 = 1;
        double n2 = 2;
        double n3 = 3;
        double n4 = 4;
        double n5 = 5;
        double n6 = 6;

        double media = (n1 + n2 + n3 + n4 + n5 + n6) / 6.0;

        System.out.println("La media de todos los numeros registrados es de: " + media);
    }
}
