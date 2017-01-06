/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_0403;

import java.util.Scanner;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0403 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("Informe um número inteiro: ");
        int num = scan.nextInt();
        
        double po = Math.pow(num, 2);
        int it = (int) po;
        
        System.out.println("O quadrado de " + num + " é: " + it);
        System.out.println();
    }
    
}
