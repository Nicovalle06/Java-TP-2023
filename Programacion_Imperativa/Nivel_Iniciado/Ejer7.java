/*
 *  Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
    guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
    memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
    real? ¿Por qué?
    Respuesta: El resultado es un número real debido a la conversión de resultadoFloat sumado con resultadoInt.
*/
public class Ejer7 {
    public static void main (String [] args) {
        
        float resultadoFloat = 3.2F + 4.6F;
        int resultadoInt = 6 + 2;

        System.out.println(resultadoFloat + resultadoInt);
    }
}
