
package vic;

import java.util.Arrays;
import java.util.Scanner;

public class Vic {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String x[]= new String[5];
        String y[]= new String[5];
        String z[]= new String[10];

        for(int i=0;i<x.length;i++){
            System.out.print("Digite a primeira lista: ");
            x[i]=teclado.next();            
        }
        for(int i=0;i<y.length;i++){
            System.out.print("Digite a segunda lista: ");
            y[i]=teclado.next();            
        }
        System.arraycopy(x, 0, z, 0, 5);

        System.arraycopy(y, 5, z, 5, 4);
        for(String valor: z){
            System.out.print(valor+" " + ",");
           
        }
    }
    
}
