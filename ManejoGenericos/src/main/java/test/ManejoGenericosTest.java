/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author fabricio
 */
public class ManejoGenericosTest {
    public static void main(String... args) {
        ClaseGenerica <Integer> objInt = new ClaseGenerica(15);
        objInt.obtenerTipo();
        
        ClaseGenerica <String> objString = new ClaseGenerica("Objeto String");
        objString.obtenerTipo();
    }
}
