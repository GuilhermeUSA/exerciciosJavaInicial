/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num1;
      
      System.out.println("Digite o Numero");
      num1 = scanner.nextInt();
      
      if(num1 %2 == 0){
          System.out.println("O numero e Par");
      }else{
         System.out.println("O numero e Impar");
      }
     
      
      
    }
    
}
