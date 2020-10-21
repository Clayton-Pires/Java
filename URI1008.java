import java.util.Scanner;

public class URI1008{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int codFunc, horasTrab;
        double valorHora, salario; 

        // Receber valores: 
         
         codFunc = teclado.nextInt(); 
         horasTrab = teclado.nextInt();
         valorHora = teclado.nextDouble();
                
        // Calcular o valor do salário: 
        
         salario = horasTrab * valorHora;

        // Exibir valor calculado da diferença entre os produto de : 

         System.out.println("NUMBER = " + codFunc);
         System.out.printf("SALARY = U$ %.2f\n" , salario);
    }    
}