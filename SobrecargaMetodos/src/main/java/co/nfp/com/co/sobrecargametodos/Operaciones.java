/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.nfp.com.co.sobrecargametodos;

/**
 *
 * @author fabricio
 */
public class Operaciones {
    public static int sumar(int a, int b){
        System.out.println("Sobrecarga int int");
        return a+b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("Sobrecarga double double");
        return a+b;
    }
    
    public static double sumar(int a, double b){
        System.out.println("Sobrecarga int double");
        return a + b;
    }
}
