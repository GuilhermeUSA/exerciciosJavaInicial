/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int result;

        System.out.println("insira a nota 1");
        num1 = scanner.nextInt();
        System.out.println("Insira a nota 2");
        num2 = scanner.nextInt();
        result = num1 + num2 / 2;

        if (result >= 60) {
            System.out.print("Aprovado seu boiola!!");
        }else{
            System.out.print("Reprovado gay");
        }

    }

}
