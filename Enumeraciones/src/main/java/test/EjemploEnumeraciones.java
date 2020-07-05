/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;

/**
 *
 * @author fabricio
 */
public class EjemploEnumeraciones {

    public static void main(String... args) {
        System.out.println("Valor 1: " + Dias.LUNES);
        System.out.println("Valor 2: " + Dias.MARTES);
        System.out.println("Valor 3: " + Dias.MIERCOLES);
        System.out.println("Valor de: " + Dias.MIERCOLES + " es ");
        Dias.indicarDia(Dias.MIERCOLES);

        System.out.println("\n----------------------------------------------------");
        System.out.println("Número paises por continente");
        System.out.println("Continente 4: " + Continentes.AMERICA);
        System.out.println("Continente 4 número paises: " + Continentes.AMERICA.getPaises());

        System.out.println("Continente 1: " + Continentes.AFRICA);
        System.out.println("Continente 1 número paises: " + Continentes.AFRICA.getPaises());
        System.out.println("----------------------------------------------------");
    }
}
