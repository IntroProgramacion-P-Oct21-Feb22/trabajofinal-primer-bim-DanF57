package problema05;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //variables
        double corY;
        double corX;
        
        System.out.println("Ingrese la cordenada X");
        corX = entrada.nextDouble();
        
        System.out.println("Ingrese la coordenada Y");
        corY = entrada.nextDouble();
        
        if(corX == 0 && corY ==0){
            System.out.println("La coordenada esta en el centro del plano");
        } else if (corX > 0 && corY > 0){
            System.out.println("La coordenada se encuentra en el Primer "
                    + "cuadrante: Región superior derecha");
        } else if(corX < 0&& corY > 0){
            System.out.println("La coordenada se encuentra en el Segundo "
                    + "cuadrante: Región superior izquierda");
        } else if (corX < 0 && corY < 0){
            System.out.println("La coordenada se encuentra en el Tercer "
                    + "cuadrante: Región inferior izquierda");
        }else if (corX > 0 && corY <0){
            System.out.println("La coordenada se encuentra en el Cuarto "
                    + "cuadrante: Región inferior derecha");
        }
    }
    
}
