import java.util.Scanner;

public class URI1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, qtn, teste; 
        
        N = teclado.nextInt(); 
        qtn = N * 4; 
         
         for ( int numero = 1; numero <= qtn ; numero++){
            teste = numero % 4;
            if (teste != 0) {
                System.out.print(numero + " ");
            } 
            else if (teste == 0){
                System.out.println("PUM");
            }
                
         }
    }   
}