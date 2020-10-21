import java.util.Scanner;

public class URI1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x , impar, verif;

        x = teclado.nextInt();

        for (int loop = 1; loop <= x; loop++){
            verif = loop % 2; 
            if (verif != 0) { 
                System.out.println(loop);
            }
        }  


    }
}