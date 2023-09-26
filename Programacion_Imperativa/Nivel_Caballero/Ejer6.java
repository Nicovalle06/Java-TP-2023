package Nivel_Caballero;
/*
 * Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
    usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
    tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
    dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
 */
public class Ejer6 {
    
    public static void main(String[] args) {
        
        double CantBitcoins = 0.5;
        double TasaCambio = 50000;

        double conversion = CantBitcoins * TasaCambio;

        System.out.println("La cantidad de bitcoins ingresados son: " + CantBitcoins + " BTC" + " y su equivalente a dolares es de: " + conversion + " USD");
    }
}
