import java.util.Scanner;

public class Exec2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float area, base, altura; 

        // Receber valores para calculo:
        System.out.println("Calcular àrea de um triângulo:");
        System.out.println("por favor informe o valor da Base:");
        base = teclado.nextFloat();  

        System.out.println("por favor informe o valor da Altura:");
        altura = teclado.nextFloat();  
        
        // Calcular área com  valores recebidos:

        area =  (base * altura)/2;


        // Exibir valor calculado: 

         System.out.println("Valor calculado da área:"+area);
         System.out.printf("Valor calculado da área é %.4f", area);
         
         System.out.printf("O Trinagulo de base %.2f e altura %.2f tem área %.4f", base, altura, area);
    }
}