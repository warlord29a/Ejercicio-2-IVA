package com.gorka;
import java.util.Scanner;

public class PrecioConIvaMain {

    /**
     * Inicializamos el atributo precio y pedimos al usuario
     * que introduzca un número con decimales. Luego invocamos
     * al método ponerIva()
     */
    public static void main(String[] args) {
        double precio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el precio sin IVA:");
        precio = (teclado.nextDouble());
        ponerIva(precio);

    }

    /**
     * Este método recibe un precio y le suma el IVA.
     * @param i es el precio sobre el que se calcula.
     */
    private static void ponerIva(double i) {
        System.out.println("Precio sin IVA: " + i);
        System.out.println("IVA 21%: " + i * 0.21);
        System.out.println("Precio con IVA: " + i * 1.21);
    }


}
