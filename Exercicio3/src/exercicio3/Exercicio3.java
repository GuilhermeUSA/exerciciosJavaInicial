/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1;
    int num2;
    int soma;
    int divisao;
    int mult;
        
    System.out.println("Insira o primeiro Numero");
    num1 = scanner.nextInt();
    System.out.println("Insira o segundo numero");
    num2 = scanner.nextInt();
    soma = num1+num2;
    divisao = num1/num2;
    mult = num1 * num2;
        System.out.println("A soma é:" + soma + divisao + mult);
   
   
    
    
    }
    
}
