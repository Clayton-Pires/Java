import java.util.Scanner;

public class URI1006{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        double A, B, C, media; 

        // Receber valores: 
         
         A = teclado.nextDouble(); 
         B = teclado.nextDouble();
         C = teclado.nextDouble();
                
        // Calcular média: 
        
         media = ((A*2) + (B*3) + (C*5))/10;

        // Exibir valor calculado: 

         System.out.printf("MEDIA = %.1f\n", media);
    }    
}