/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kathe15ortega12
 */
public class PruebaPersona {
      public static void main(String[] args) {
          Persona personaUno = new Persona();
          Persona personaDos = new Persona();
          
          personaUno.setNombres("Néstor Fabricio");
          personaDos.setNombres("Katherine Lisseth");
          personaDos.apellidos = "Ortega";
          
          personaUno.showFullName();
          personaDos.showFullName();
          
          
      }
    
}
