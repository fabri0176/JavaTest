/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoJavaBeans;

import beans.PersonaBean;

/**
 *
 * @author fabricio
 */
public class ManejoJavaBeans {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        
        persona.setNombre("Néstor Fabricio");
        persona.setEdad(12);
        
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());
        
        
        PersonaBean persona2 = new PersonaBean("Katherine Lisseth", 30);
        System.out.println("Nombre: "+persona2.getNombre());
        System.out.println("Edad: "+persona2.getEdad());
        
    }
}
