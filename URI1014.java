import java.util.Scanner;

public class URI1014{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
        int X; 
        float Y, media; 

        // Receber valores X distanca e Y litros: 
         
         X = teclado.nextInt(); 
         Y = teclado.nextFloat();

                
        // Calcular média: 
        
         media = X / Y;

        // Exibir valor calculado: 

         System.out.printf("%.3f km/l\n" , media);
    }    
}