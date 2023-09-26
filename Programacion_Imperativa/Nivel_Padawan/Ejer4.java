/*
 * Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
    edad y los nombres de esas personas, luego saque su promedio e imprima por
    pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
    edades
 */

public class Ejer4 {
    public static void main(String[] args) {

        String nombreSujeto1 = "Rocio";
        int edadSujeto1 = 24;
        
        String nombreSujeto2 = "Manuel";
        int edadSujeto2 = 15;
        
        String nombreSujeto3 = "Rodrigo";
        int edadSujeto3 = 42;
        
        String nombreSujeto4 = "Gimena";
        int edadSujeto4 = 62;

        double cantidadEdades = 4.0;

        double promedioEdades = (edadSujeto1 + edadSujeto2 + edadSujeto3 + edadSujeto4) / cantidadEdades;

        System.out.println("El sujeto 1 se llama: " + nombreSujeto1 + " y tiene: " + edadSujeto1 + " años");
        System.out.println("El sujeto 2 se llama: " + nombreSujeto2 + " y tiene: " + edadSujeto2 + " años");
        System.out.println("El sujeto 3 se llama: " + nombreSujeto3 + " y tiene: " + edadSujeto3 + " años");
        System.out.println("El sujeto 4 se llama: " + nombreSujeto4 + " y tiene: " + edadSujeto4 + " años");

        System.out.println("---------------------------------------------");
        
        System.out.println("El promedio de edad de todas las personas es: " + promedioEdades);

    }
}
