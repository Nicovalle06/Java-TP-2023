package Nivel_Maestro;

/*
 * Cálculo de la velocidad final:
    Escribir un programa en Java que calcule la velocidad final de un objeto en caída
    libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
    transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
    es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
    transcurrido.
    Muestre el resultado por pantalla.
 */
public class Ejer6 {
    
    public static void main(String[] args) {
        
        double velocidadInicial = 25.0;
        double aceleracion = 9.8;
        double tiempo = 2.0;

        double velocidadFinal = velocidadInicial + aceleracion * tiempo;

        System.out.println("La velocidad final de un objeto en caida libre con una velocidad inicial de " + velocidadInicial +", aceleracion de la gravedad " + aceleracion + " y tiempo " + tiempo + " es: " + velocidadFinal);
    }
}
