import java.util.Scanner;

public class URI1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero, verif, pares;
        pares = 0;  
        
        for (int cont = 1 ; cont <= 5; cont++){
            numero = teclado.nextInt();
            verif = numero % 2 ;     
            if (verif == 0){
                pares++;
            } 

        }
        System.out.println(pares+" valores pares");

    }
}