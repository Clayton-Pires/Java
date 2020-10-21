import java.util.Scanner;

public class URI1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float salario,reajuste; 

        salario = teclado.nextFloat();

        if (salario <= 400) {
            reajuste = (salario*15)/100;
            salario = salario + reajuste;
            System.out.printf ("Novo salario: %.2f\n" , salario);
            System.out.printf ("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println ("Em percentual: 15 %");
        }
        else if (salario > 400 && salario <= 800){
            reajuste = (salario*12)/100;
            salario = salario + reajuste;
            System.out.printf ("Novo salario: %.2f\n" , salario);
            System.out.printf ("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println ("Em percentual: 12 %");
        }
        else if (salario > 800 && salario <= 1200){
            reajuste = (salario*10)/100;
            salario = salario + reajuste;
            System.out.printf ("Novo salario: %.2f\n" , salario);
            System.out.printf ("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println ("Em percentual: 10 %");
        }
         else if (salario > 1200 && salario <= 2000){
            reajuste = (salario*7)/100;
            salario = salario + reajuste;
            System.out.printf ("Novo salario: %.2f\n" , salario);
            System.out.printf ("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println ("Em percentual: 7 %");
        }
        else if (salario > 2000 ){
            reajuste = (salario*4)/100;
            salario = salario + reajuste;
            System.out.printf ("Novo salario: %.2f\n" , salario);
            System.out.printf ("Reajuste ganho: %.2f\n" , reajuste);
            System.out.println ("Em percentual: 4 %");
        }
    }

}








