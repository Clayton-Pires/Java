import java.util.Scanner;

public class URI1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double a,b,c, perimetro,trparea;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        if ( (a+b>c) && (b+c>a) && (a+c>b) ){
            perimetro = a + b + c;
            System.out.printf ("Perimetro = %.1f\n" , perimetro);
        }
        else { 
            trparea = ((a+b)*c)/2;
            System.out.printf ("Area = %.1f\n" , trparea);
        }

    }
}