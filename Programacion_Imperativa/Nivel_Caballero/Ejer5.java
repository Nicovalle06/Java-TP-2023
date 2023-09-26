package Nivel_Caballero;
/*
 * Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
    una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
    cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
    ingresa 5000 pesos, el programa deberá mostrar 250 euros.

 */
public class Ejer5 {
    public static void main(String[] args) {
        
        int CantPesos = 5000;
        int TasaCambio = 20;

        int conversion = CantPesos * TasaCambio;

        System.out.println("La cantidad de pesos ingresados son: " + CantPesos + " ARS" + " y su equivalente a euros es de: " + conversion + " EUR");
    }
}
