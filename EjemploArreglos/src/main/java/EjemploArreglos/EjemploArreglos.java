/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploArreglos;

/**
 *
 * @author fabricio
 */
public class EjemploArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        String nombres[] = new String[3];
        Personas personas[] = new Personas[3];
        
        edades[0] = 28;
        edades[1] = 30;
        
        System.out.println(edades[0]);
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades["+i+"] = "+edades[i]);
        }
        
        
        String nombres2[] = {"nestor","fabricio","parra","gonzalez"};
        
        for (int i = 0; i < nombres2.length; i++) {
            System.out.println("nombres2["+i+"] = "+nombres2[i]);
        }
        
        int edades2[] = {1,2,3,4,5,6,7,8};
        
        for (int i = 0; i < edades2.length; i++) {
            System.out.println("edades2["+i+"] = "+edades2[i]);
        }
        
        Personas personas2[] = {
            new Personas("Nestor Fabricio", "Parra"),
            new Personas("Katherine Lisseth", "Ortega"),
            new Personas("Luz Marina", "Gonzalez"),
            new Personas("Néstor Raul", "Parra"),
            new Personas("Jose Raul", "Parra"),
            new Personas("Amparo Raul", "Parra"),
            new Personas("Manuel Raul", "Parra"),
            new Personas("Andres Raul", "Parra"),
            new Personas("Jeison Raul", "Parra"),
            null,
            new Personas("Nelson Raul", "Parra"),
            null,
            null,
            new Personas("Mariana", "Campillo"),
        };
        
        for (int i = 0; i < personas2.length; i++) {
            Personas personaItter = personas2[i];
            if(personaItter == null){
                continue;
            }

            System.out.println("personas2["+i+"] = "+personas2[i]);
        }
        
    }

}
