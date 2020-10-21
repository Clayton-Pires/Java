import java.util.Scanner;

public class Exec2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float area, base, altura; 

        // Receber valores para calculo:
        System.out.println("Calcular àrea de um retangulo:");
        System.out.println("por favor informe o valor da Base:");
        base = teclado.nextFloat();  

        System.out.println("por favor informe o valor da Altura:");
        altura = teclado.nextFloat();  
        
        // Calcular área com  valores recebidos:

        area =  base * altura;


        // Exibir valor calculado: 

         System.out.println("Valor calculado da área:"+area);

    }
}