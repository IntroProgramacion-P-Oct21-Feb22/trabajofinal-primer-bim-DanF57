package problema07;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    //Ecuación : S = (a1+an)/2xn
    //Variables
    int numero = 0;
    int n;
    int resultado = 0; 
    
    System.out.println("Ingrese un numero par");
    numero = entrada.nextInt();
    
    if (numero >= 2){
        n = numero / 2;
        resultado = n * (n + 1);
        
    System.out.println("Número ingresado: " + numero);
    System.out.println("La suma es: " + resultado);
    }else{
        System.out.println("ERROR: Ingrese un numero par mayor a 2");
    }
    
    
}
}

