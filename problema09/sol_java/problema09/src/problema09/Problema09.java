package problema09;

/**
 *
 * @author Daniel
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String simbolo;
        String resta = "-";
        String suma = "+";
        String cadena = " ";
        int numeroInicial = 12;
        int numero2 = 11;
        int limite1 = 48;
        int limite2 = 50;
        do {
            // para manejar el signo asociado 
                if (numeroInicial % 12 == 0){
                    simbolo = suma;
                } else {
                    if ((numero2 == 11) || (numero2 % 11 == 0)) {
                    simbolo = resta;
                    }
                    
                }

                cadena = String.format("%s%s%d%s%d",
                        cadena,
                        suma,
                        numeroInicial, 
                        resta,
                        numero2);
                numeroInicial = numeroInicial + 12;
                numero2 = numero2 + 11;
            
        } while ((numero2 <= limite2)||(numeroInicial <= limite1));
        {

          System.out.println("S1 =" + cadena);

        }
    }
    
}