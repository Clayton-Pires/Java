import java.util.Scanner;

public class URI1010{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int codA, qtdA, codB, qtdB;
        double valorA, valorB, total;

        // Receber valores: 
         
         codA = teclado.nextInt(); 
         qtdA = teclado.nextInt(); 
         valorA = teclado.nextDouble(); 

         codB = teclado.nextInt(); 
         qtdB = teclado.nextInt(); 
         valorB = teclado.nextDouble(); 
                         
        // Calcular os total gasto na compra dos produtos: 
        
         total = ((qtdA*valorA) + (qtdB*valorB));

        // Exibir valor calculado:

         System.out.printf("VALOR A PAGAR: R$ %.2f\n" , total);
    }    
}