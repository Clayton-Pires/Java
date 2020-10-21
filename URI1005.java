import java.util.Scanner;

public class URI1005{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        double A, B, media; 

        // Receber valores: 
         
         A = teclado.nextDouble(); 
         B = teclado.nextDouble();

                
        // Calcular média: 
        
         media = ((A*3.5) + (B*7.5))/11;

        // Exibir valor calculado: 

         System.out.printf("MEDIA = %.5f\n", media);
    }    
}