import java.util.Scanner;

public class URI1064{
     public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

       float numero, media;
        int qtdPositivos = 0;
        media = 0; 

        for (int cont=1; cont <= 6; cont++){
            numero = teclado.nextFloat();
            if (numero > 0){
                qtdPositivos++;
                media = media + numero;
            }
        }
        media = media / qtdPositivos ;
        System.out.println(qtdPositivos+" valores positivos");
        System.out.printf("%.1f\n", media);
      
    }
}