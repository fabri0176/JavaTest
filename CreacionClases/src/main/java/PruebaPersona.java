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
        personaUno.getNombres();
        personaDos.showFullName();
        
        Imprimir impresion = new Imprimir();
        System.out.println(personaDos);
        impresion.imprimir(personaDos);
        impresion.imprimir(impresion);
    }

}

class Imprimir {
    public void imprimir(Object objecto){
        System.out.println(objecto);
        System.out.println(this);
    }
}   
