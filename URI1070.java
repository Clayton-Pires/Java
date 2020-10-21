import java.util.Scanner;

public class URI1070{
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);

        int valor_x, loop, verif;
        loop = 0;
       
        valor_x = teclado.nextInt();
        while (loop < 6 ) {
            verif = valor_x % 2;
            if (verif != 0){
                System.out.println(valor_x);
                valor_x = valor_x + 2;
                loop++;
            }
            else if (verif == 0) {
                valor_x++;
            }
        }

    }
}