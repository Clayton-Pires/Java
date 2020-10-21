import java.util.Scanner;

public class URI1007{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int A, B, C, D, dif; 

        // Receber valores: 
         
         A = teclado.nextInt(); 
         B = teclado.nextInt();
         C = teclado.nextInt();
         D = teclado.nextInt();
                
        // Calcular os produtos de A com B e C com D e calcular a diferença: 
        
         dif = ((A*B) - (C*D));

        // Exibir valor calculado da diferença entre os produto de : 

         System.out.println("DIFERENCA = " + dif);
    }    
}