/*
 * Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
    en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
    ¿Qué es unicode?
 */
public class Ejer3 {
    public static void main (String [] args) {
        char letraN = '\u004E';
        char letraI = '\u0049';
        char letraC = '\u0043';
        char letraO = '\u004F';

        System.out.println("Nombre: " + letraN + letraI + letraC + letraO);
    }
}
