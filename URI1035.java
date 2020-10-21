import java.util.Scanner;

public class URI1035{
    public static void main(String args{}){
        Scanner teclado = new Scanner(System.in);
        int a,b,c,d;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        if ((b > c) && (d > a) && (c + d) > (a + B) && (c > 0 && d > 0) && (a % 2 == 0)){
             System.out.println("valores aceitos");
        }
        else{
             System.out.println("valores não aceitos");
        }




    }
    
}