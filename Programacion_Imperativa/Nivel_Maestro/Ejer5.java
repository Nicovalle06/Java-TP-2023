package Nivel_Maestro;

/*
 *  Cálculo de la energía cinética:
    Escribir un programa en Java que calcule la energía cinética de un objeto en
    movimiento, dados su masa y su velocidad.
    Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
    del objeto y v es la velocidad.
    Muestre el resultado por pantalla.
 */
public class Ejer5 {
    public static void main(String[] args) {
       
        double masa = 25.0;
        double velocidad = 30.0;

        double calculoEc = (0.5) * masa * (velocidad * velocidad);

        System.out.println("La enegia cinetica de un objeto en movimiento cuya masa es de " + masa + " y su velocidad " + velocidad + " es: " + calculoEc);
    }
}
