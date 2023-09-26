package Nivel_Caballero;
/*
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
    solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
    dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
    libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
    deberá mostrar 70 dólares.
 */

public class Ejer4 {
    
    public static void main(String[] args) {
        
        double CantLibras = 50.0;
        double TasaCambio = 1.40;

        double conversion = CantLibras * TasaCambio;

        System.out.println("La cantidad de libras esterlinas ingresados son: " + CantLibras + " GBP" + " y su equivalente a dolares es de: " + conversion + " USD");

    }
}
