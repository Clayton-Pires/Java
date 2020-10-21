import java.util.Scanner;

public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int verif, par, impar,pos,neg;
        par = 0;
        impar = 0;
        pos = 0;
        neg = 0;

        for (int cont = 1 ; cont <= 5; cont++){
            numero = teclado.nextInt();
            verif = numero % 2 ;     
            if (verif == 0){
                par++;
            }
            else if (verif != 0){
                impar++;
            };
            if ( numero > 0) {
                pos++;
            }
            else if (numero < 0){
                neg++;
            };
           
        }
        System.out.println(par+" valor(es) par(es)");
        System.out.println(impar+" valor(es) impar(es)");
        System.out.println(pos+" valor(es) positivo(s)");
        System.out.println(neg+" valor(es) negativo(s)");

    }
}