import java.util.Scanner;

public class URI1144{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, linha, vl2, vl3, vl4, vl5; 
        
        N = teclado.nextInt(); 
        
        for ( int loop = 1; loop <= N ; loop++){
            vl2 = loop * loop;
            vl3 = vl2 * loop;
            vl4 = vl2 + 1;
            vl5 = vl3 + 1;
            System.out.println(loop + " "+vl2+" "+vl3);
            System.out.println(loop + " "+ vl4 +" "+ vl5 );
                        
        }
    }   
}