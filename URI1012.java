import java.util.Scanner;

public class URI1012{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo; 



        // Receber valores: 
         
         A = teclado.nextDouble(); 
         B = teclado.nextDouble();
         C = teclado.nextDouble();
                         
        // Calcular os produtos de A com B e C com D e calcular a diferença: 
        
         triangulo = (A*C)/2;
         circulo = (C*C) * 3.14159;
         trapezio = ((A + B) * C)/2;
         quadrado = B * B;
         retangulo = A * B;


        // Exibir valor calculado da diferença entre os produto de : 

         System.out.printf("TRIANGULO: %.3f\n" , triangulo);
         System.out.printf("CIRCULO: %.3f\n" , circulo);
         System.out.printf("TRAPEZIO: %.3f\n" , trapezio);
         System.out.printf("QUADRADO: %.3f\n" , quadrado);
         System.out.printf("RETANGULO: %.3f\n" , retangulo);
    }    
}