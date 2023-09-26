package Nivel_Caballero;
/*
 * Conversión de euros a dólares: Escribir un programa en Java que solicite al
    usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
    tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
    el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
 */

public class Ejer3 {
    public static void main(String[] args) {
        
        double CantEuros = 100.0;
        double TasaCambio = 1.20;

        double conversion = CantEuros * TasaCambio;

        System.out.println("La cantidad de euros ingresados son: " + CantEuros + " EUR" + " y su equivalente a dolares es de: " + conversion + " USD");
    }
}
