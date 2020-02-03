
import com.google.gson.Gson;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
public class Default {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona();
        persona.setNombre("Néstor Fabricio");
        persona.setSalario(2100);
        persona.setEliminado(false);
        
        System.out.println("Persona Nombre = "+persona.getNombre());
        System.out.println("Persona Salario = "+persona.getSalario());
        System.out.println("Persona Eliminada? = "+persona.isEliminado());
        System.out.println(persona);
        
    }
    
}
