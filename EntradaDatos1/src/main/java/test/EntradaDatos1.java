/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabricio
 */
public class EntradaDatos1 {
    public static void main(String... args) {
        System.out.println("What's your name?: ");
        try {
            String caputra = null;
            // InputStreamReader lee caracter por caracter
            InputStreamReader input = new InputStreamReader(System.in);
            
            //Almacena caracteres
            BufferedReader brInput = new BufferedReader(input);
            
            
            
            caputra = brInput.readLine();
            System.out.println("Your name is: "+caputra);
        } catch (IOException ex) {
            //Imprimimos salida de excepción en la consola
            ex.printStackTrace(System.out);
        }
    }
}
