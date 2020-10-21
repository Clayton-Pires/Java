import java.util.Scanner;

public class Exec2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float area, baseMaior, baseMenor,altura; 

        // Receber valores para calculo:
        System.out.println("Calcular àrea de um trapézio:");
        System.out.print("por favor informe o valor da Base Maior:");
        baseMaior = teclado.nextFloat();  

        System.out.print("por favor informe o valor da Base Menor:");
        baseMenor = teclado.nextFloat();

        System.out.print("por favor informe o valor da Altura:");
        altura = teclado.nextFloat();  
        
        // Calcular área com  valores recebidos:

        area =  (baseMaior + baseMenor)* altura/2;


        // Exibir valor calculado: 

         System.out.println("Valor calculado da área:"+area);

    }
}