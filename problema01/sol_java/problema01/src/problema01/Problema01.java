package problema01;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    //Variables
    double angulo1;
    double angulo2;
    double angulo3;
    
    System.out.println("Ingrese el primer angulo del triangulo");
    angulo1 = entrada.nextInt();

    System.out.println("Ingrese el segundo angulo del triangulo");
    angulo2 = entrada.nextInt();

    System.out.println("Ingrese el tercer angulo del triangulo");
    angulo3 = entrada.nextInt();

    if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
        System.out.printf("El tipo de triangulo que corresponde a el ángulo "
            + "ingresado es Rectángulo \n");
    } else {
        if (angulo1 > 90 && angulo1 < 180 || angulo2 > 90 && angulo2 < 180
                || angulo3 > 90 && angulo3 < 180) {
        System.out.printf("El tipo de triangulo que corresponde a el ángulo "
            + "ingresado es Obtusángulo\n");
        } else {
            if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
            System.out.printf("El tipo de triangulo que corresponde a el ángulo "
                + "ingresado es Acutángulo\n");
                } else {
                    System.out.println("Los datos ingresados no corresponden "
                            + "a ninguno de estos triangulos");
                }
            }

        }
    }
}
