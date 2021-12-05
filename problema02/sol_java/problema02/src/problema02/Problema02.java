package problema02;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //variables
        double porcentaje1 = 20;
        double porcentaje2 = 25;
        double porcentaje3 = 40;
        double porcentaje4 = 50;

        int cantidadTrajes;
        double precioUnitario;
        double subtotal;
        double descuento;
        double precioFinal;

        System.out.println("Ingrese la cantidad de trajes a comprar");
        cantidadTrajes = entrada.nextInt();

        System.out.println("Ingrese el precio unitario");
        precioUnitario = entrada.nextDouble();

        subtotal = cantidadTrajes * precioUnitario;
        if (cantidadTrajes <= 0) {
            System.out.println("El valor no es permitido");
        } else {
            if (cantidadTrajes == 1) {
                descuento = (subtotal * porcentaje1) / 100;
                precioFinal = subtotal - descuento;
                System.out.printf("El subotal a a pagar es: %.2f\n"
                        + "El descuento es: %.2f\n"
                        + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
            } else {
                if (cantidadTrajes == 2) {
                    descuento = (subtotal * porcentaje2) / 100;
                    precioFinal = subtotal - descuento;
                    System.out.printf("El subotal a a pagar es: %.2f\n"
                            + "El descuento es: %.2f\n"
                            + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
                } else {
                    if (cantidadTrajes == 3) {
                        descuento = (subtotal * porcentaje3) / 100;
                        precioFinal = subtotal - descuento;
                        System.out.printf("El subotal a a pagar es: %.2f\n"
                                + "El descuento es: %.2f\n"
                                + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
                    } else {
                        if (cantidadTrajes > 3) {
                            descuento = (subtotal * porcentaje4) / 100;
                            precioFinal = subtotal - descuento;
                            System.out.printf("El subotal a a pagar es: %.2f\n"
                                    + "El descuento es: %.2f\n"
                                    + "El total a pagar es: %.2f\n", subtotal, descuento, precioFinal);
                        }
                    }
                }
            }
        }
    }

}

