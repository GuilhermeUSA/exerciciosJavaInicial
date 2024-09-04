/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String nome;
    String idade;
    String genero;
    String favorito;
    String esporte;
    
        
        
    System.out.println("Insira seu nome");
    nome = scanner.nextLine();
    System.out.println("Insira sua idade");
    idade = scanner.nextLine();
    System.out.println("Insira seu genero");
    genero = scanner.nextLine();
    System.out.println("Insira a sua cor Favorita");
    favorito = scanner.nextLine();
    System.out.println("Pratica algum esporte?");
    esporte = scanner.nextLine();
    
    System.out.print("meu nome e: " + nome + "minha idade e: "+ idade + "meu genero e: "+ genero + "cor favorita e: "+favorito + "pratico esporte: " + esporte);
        
        
        
        
        
    }
    
}
