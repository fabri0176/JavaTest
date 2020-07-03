/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author fabricio
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int var1 = 2;
        System.out.println("Valor minimo Integer:\t" + Integer.MIN_VALUE);
        System.out.println("Valor maximo Integer:\t" + Integer.MAX_VALUE);
        System.out.println("------------------------------------");
        byte numByte = 10;
        System.out.println("Valor minimo byte:\t" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:\t" + Byte.MAX_VALUE);
        System.out.println("------------------------------------");
        short numShort = 12;
        System.out.println("Valor minimo Short:\t" + Short.MIN_VALUE);
        System.out.println("Valor maximo Short:\t" + Short.MAX_VALUE);
        System.out.println("------------------------------------");
        long numLong = 12;
        System.out.println("Valor minimo Long:\t" + Long.MIN_VALUE);
        System.out.println("Valor maximo Long:\t" + Long.MAX_VALUE);

        //Flotante
        System.out.println("------------------------------------");
        System.out.println("Valor minimo Float:\t" + Float.MIN_VALUE);
        System.out.println("Valor maximo Float:\t" + Float.MAX_VALUE);

        System.out.println("------------------------------------");
        System.out.println("Valor minimo Double:\t" + Double.MIN_VALUE);
        System.out.println("Valor maximo Double:\t" + Double.MAX_VALUE);

        var numEntero = 123;
        System.out.println(numEntero);

        char caracter1 = 'a';
        System.out.println("caracter1 = " + caracter1);

        boolean varBoolean = true;

        if (varBoolean) {
            System.out.println("Cornavirus");
        } else {
            System.out.println("Sin coronavirus");
        }
        System.out.println("------------------------------------");
        var edad = 39;
        var esAdulto = edad >= 18;

        if (esAdulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Conversion de tipos
        //Convert String to entero
        var virusColombia = Integer.parseInt("4150");
        System.out.println("virusColombia = " + (virusColombia + 1));
        System.out.println("------------------------------------");

        var valorPI = Double.parseDouble("3.141516");
        System.out.println("valorPI = " + valorPI);

        Scanner consola = new Scanner(System.in);

        boolean finish = false;
        do {
            try {
                System.out.println("------------------------------------");
                System.out.println("Ingresa la edad: ");
                int userEdad = Integer.parseInt(consola.nextLine());
                System.out.println("userEdad = " + userEdad);
                finish = true;
            } catch (Exception e) {
                System.out.println("Debe ingresar un número valido");

            }

        } while (!finish);

    }

}
