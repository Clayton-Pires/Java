import java.util.Scanner;

public class URI1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int senha; 

        do {
            //System.out.println("Digite uma senha:");
            senha = teclado.nextInt(); 
            if (senha == 2002) {
                System.out.println("Acesso Permitido");
            }
            else System.out.println("Senha Invalida");            
             
        } while (senha != 2002);

       
    }
}