/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
public class SobrecargaConstructores {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Néstor Fabricio", 28);
        System.out.println(persona1);
        
        Empleado empleado1 = new Empleado("Nestor Fabricio Parra", 28, 210000);
        System.out.println(empleado1);
    }
}
