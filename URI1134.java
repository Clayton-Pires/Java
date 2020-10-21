import java.util.Scanner; 
    public class URI1134{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);
            int opcao,alc,gas,die;
            alc = 0;
            gas = 0;
            die = 0;

            do {                
                opcao = teclado.nextInt();
                if (opcao == 1){
                    alc++;
                }
                else if (opcao == 2){
                    gas++;
                }
                else if (opcao == 3){
                    die++;
                }
                
            } while (opcao != 4 );
            
            System.out.println("MUITO OBRIGADO");
            System.out.println("Alcool: " +alc);
            System.out.println("Gasolina: " +gas);
            System.out.println("Diesel: " +die);


        }
    }