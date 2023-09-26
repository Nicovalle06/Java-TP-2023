/*
 * Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
    otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
    una constante de los valores que no van a cambiar en esta conversión. Muestre el
    resultado por pantalla
 */


public class Ejer5 {
    public static void main(String[] args) {
        
        double libras = 203;
        double EquivalenciaKg = 0.453592;

        double conversion = libras * EquivalenciaKg;

        System.out.println("La conversion de: " + libras +" lb"+ " a Kilogramos es: " + conversion + " Kg");

    }
    
}
