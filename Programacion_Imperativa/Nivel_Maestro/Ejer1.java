package Nivel_Maestro;
/*
 * Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
    de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
    resuelve.

 */
public class Ejer1 {
    
    public static void main(String[] args) {
        
        double pi = 3.14;
        double radio = 5.0;

        double areaCirculo = pi * (radio * radio);

        System.out.println("El area de un circulo de radio: " + radio + " es: " + areaCirculo);
    }
}
