/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite o primeiro numero");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("O numero 1 e maior");
            
            }else{
            System.out.println("O numero 2 e maior");}
        }
    
}
