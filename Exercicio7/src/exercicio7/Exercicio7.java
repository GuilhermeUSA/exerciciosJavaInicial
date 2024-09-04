/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Digite o numero 1");
        num1 = scanner.nextInt();

        System.out.println("Digite o numero 2");
        num2 = scanner.nextInt();

        if (num1 > num2) {
         System.out.println("Numero 1 e maior");
        }else{
        System.out.println("O numero 2 é maior");
    }
            
        if(num1 == num2){
            System.out.println("Os numeros sao iguais");
        }else{
            System.out.println("O Numero e Diferente");
        }

    }

}
