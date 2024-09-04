/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int num1;
       System.out.println("Digite o numero");
      num1= scanner.nextInt();
       for (int i = 0; i <= 10; i = i + 2){
           System.out.println(Math.pow(num1,i));
       }
       
       
       
    }
    
}
