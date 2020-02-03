/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class MainCaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el alto: ");
        int alto = scanner.nextInt();
        
        System.out.print("Ingrese el largo: ");
        int largo = scanner.nextInt();
        
        System.out.print("Ingrese el profundo: ");
        int profundo = scanner.nextInt();
        
        Caja caja = new Caja(alto, largo, profundo);
        
        System.out.println("El area de la caja es: "+caja.getVolumen());
    }
}
