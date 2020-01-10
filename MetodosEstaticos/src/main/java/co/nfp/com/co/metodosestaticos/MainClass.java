/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.nfp.com.co.metodosestaticos;

/**
 *
 * @author fabricio
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1 = new Persona();
        System.out.println("getContadorPersonas "+Persona.getContadorPersonas());
        
        Persona persona2 = new Persona();
        System.out.println("getContadorPersonas "+Persona.getContadorPersonas());
        
        Persona persona3 = new Persona();
        System.out.println("getContadorPersonas "+Persona.getContadorPersonas());
    }
    
}
