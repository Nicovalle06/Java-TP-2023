package Nivel_Caballero;
/*
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al
    usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
    tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
    usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */

public class Ejer2 {
    public static void main(String[] args) {
        
        int CantDolares = 50;
        int TasaCambio = 20;

        int conversion = CantDolares * TasaCambio;

        System.out.println("La cantidad de dolares ingresados son: " + CantDolares + " USD" + " y su equivalente a pesos es de: " + conversion + " ARS");

    }
}
