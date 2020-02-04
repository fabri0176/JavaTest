/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import calculadora.Operaciones;
import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class test {

    public static void main(String[] args) {
        try {
            System.out.println("Proporciona el primer valor [a]: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            System.out.println("Proporciona el segundo valor [b]: ");
            int b = scanner.nextInt();

            int result = Operaciones.sumar(a, b);
            System.out.println("El resultado de la operación es: " + result);
        } catch (Exception e) {
            System.out.println("El valor no es correcto");
        }

    }
}
