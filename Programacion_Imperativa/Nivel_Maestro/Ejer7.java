package Nivel_Maestro;
 /*
  *  Cálculo de la fuerza centrípeta:
    Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
    mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
    y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
    fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
    de la trayectoria.
    Muestre el resultado por pantalla.
  */
public class Ejer7 {
    
    public static void main(String[] args) {
        
        double masa = 45.0;
        double valocidadAngular = 6.0;
        double radio = 4;

        double fuerzaCentripeta = masa * valocidadAngular*valocidadAngular / radio;

        System.out.println("La fuerza centripeta necesaria para mantener un objeto en una trayectoria circular cuya masa es " + masa +", velocidad angular " + valocidadAngular + " y radio " + radio + " es: " + fuerzaCentripeta);
    }
}
