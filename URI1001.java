import java.util.Scanner;

public class URI1001{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int A,B,X; 

        // Receber valores
        A = teclado.nextInt(); 
        B = teclado.nextInt();
        
        // Calcular área com  valores recebidos:
         X =  A + B;

        // Exibir valor calculado: 
         System.out.println("X = " +X);
    }         
}
