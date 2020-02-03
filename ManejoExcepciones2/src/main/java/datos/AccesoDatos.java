/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import excepciones.AccesoDatosEx;

/**
 *
 * @author fabricio
 */
public interface AccesoDatos {
    //CONSTANTE PUBLICA FINAL
    int MAX_REGISTROS = 10;
    
    //
    public static final int MIN_REGISTROS = 1;
    
    public abstract void insertar() throws AccesoDatosEx;
    
    public abstract void listar() throws AccesoDatosEx;
    
    
    public abstract void simularError(boolean simularError);
    
    
}
