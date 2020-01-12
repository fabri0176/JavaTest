/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabraFinal;

/**
 *
 * @author fabricio
 */
public final class ClaseFinal extends Persona{
    //Variable marcada cómo final a nivel de objeto
    public final int varNumero = 150;
    
    //Constante Java a nivel de clase 
    public static final int VAR_PRIMITIVO = 15;
    
    //Variable de tipo persona que no puede apuntar a otro objeto, no puede modificar la referencia
    public static final Persona VAR_PERSONA = new Persona();
    
    //En la clase hija no puede modificar el comportamiento del metodo
    public final void metodoFinal(){
        
    }

    @Override
    public String toString() {
        return "ClaseFinal{" + "varNumero=" + varNumero + '}';
    }
    
    
}
