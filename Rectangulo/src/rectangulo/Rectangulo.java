/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------------------------------------------------");
        System.out.println("En el siguiente ejercicio se solicita calcular el área y perímetro de un Rectángulo");
        System.out.println("-------------------------------------------------");

        Scanner consola = new Scanner(System.in);
        int altura;
        try {
            System.out.println("Ingrese la altura: ");
            altura = Integer.parseInt(consola.nextLine());
            if (altura <= 0) {
                System.out.println("El valor de altura no es correcta");
                return;
            }
        } catch (Exception e) {
            System.out.println("El valor de altura no es correcta");
            return;
        }
        int base;
        try {
            System.out.println("Ingrese la base: ");
            base = Integer.parseInt(consola.nextLine());
            if (base <= 0) {
                System.out.println("El valor de base no es correcta");
                return;
            }
        } catch (Exception e) {
            System.out.println("El valor de base no es correcta");
            return;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Resutlado");
        float perimetro = (altura + base) * 2;
        System.out.println("perimetro = " + perimetro);

        float area = altura * base;
        System.out.println("area = " + area);

    }

}
