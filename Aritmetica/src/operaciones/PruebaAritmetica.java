/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class PruebaAritmetica {

    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("--------------------------------------------------");
        try {
            System.out.println("Ingrese el número A: ");
            number1 = consola.nextInt();

            System.out.println("Ingrese el número B: ");
            number2 = consola.nextInt();

        } catch (Exception e) {
            System.out.println("Error al ingresar el número, intente de nuevo");
            return;
        }
        System.out.println("--------------------------------------------------");
        Aritmetica aritmetica = new Aritmetica(number1, number2);

        System.out.println("Resultado Suma: ");
        aritmetica.showResultadoSuma();
    }
}
