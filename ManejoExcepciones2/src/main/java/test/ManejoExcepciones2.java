/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Division;
import domain.OperacionExcepcion;


/**
 *
 * @author fabricio
 */
public class ManejoExcepciones1 {
    public static void main(String... args) {
        try {
            Division division = new Division(30, 0);
            division.visualizarOperacion();
        } catch (OperacionExcepcion ex) {
            
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        System.out.println("El programa continua");
    }
}
