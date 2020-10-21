import java.util.Scanner;

public class URI1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, vl2, vl3; 
        
        N = teclado.nextInt(); 
         
        for ( int loop = 1; loop <= N ; loop++){
            vl2 = loop * loop;
            vl3 = vl2 * loop;
              System.out.println(loop + " "+vl2+" "+vl3);
                        
        }
    }   
}