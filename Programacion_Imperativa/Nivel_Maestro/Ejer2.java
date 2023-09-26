package Nivel_Maestro;

/*
 * Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
    Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
    la fórmula con la que se resuelve.

 */
public class Ejer2 {
    public static void main(String[] args) {
        
        double tempCelsius = 18.6;
        
        double conversion = (tempCelsius * 9/5) + 32;

        System.out.println("La conversion de la temperatura: " + tempCelsius + " Celsius" + " a Fahrenheit es: " + conversion);
    }
}
