/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author fabricio
 */
public class ClaseGenerica<T> {
    //Variable de tipo Generico
    T objeto;
    
    //Constructor para inicializar la clase del objeto
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    //Metodo para obtener el tipo de la clase
    public void obtenerTipo(){
        System.out.println("El tipo T es:" + objeto.getClass().getName());
    }
    
}
