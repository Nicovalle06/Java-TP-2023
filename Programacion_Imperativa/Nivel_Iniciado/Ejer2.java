/*
 * Suma de dos números bis: Se les solicita que guarden dos números enteros y los
    sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
    indique si se trata de un número par o impar.
    El mensaje debe tener el siguiente formato:
 */
public class Ejer2 {
    public static void main (String [] args) {

        int num1 = 4;
        int num2 = 3;
        int resultado = num1 + num2;

        String paridad = (resultado % 2 == 0) ? "Par" : "Impar";

        System.out.println("El resultado es " + resultado + " y es " + paridad);

    }
}
