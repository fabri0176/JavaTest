/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class EntradaDatos {
    public static void main(String... args) {
        String captura = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?: ");
        
        captura = scanner.nextLine();
        System.out.println("Your age is: "+captura);
        while(!captura.equals("exit")){
            System.out.println("Enter your code: "+captura);
            captura = scanner.nextLine();
            System.out.println("Your age is: "+captura);
        }
        
    }
}
