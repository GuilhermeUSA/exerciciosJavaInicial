
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o Valor:");
        num = s.nextInt();
        
        if(num > 10  && num < 100){
          System.out.printf("Num elevado a 2: %.0f", Math.pow(num,2));
        }else{
         System.out.printf("Raiz Quadrada do Num: %.0f",Math.sqrt(num));
        }
        System.out.println(".:Fim");
    } 
    
}
