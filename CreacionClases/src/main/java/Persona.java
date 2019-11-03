/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kathe15ortega12
 */
public class Persona {
    String nombres;
    String apellidos;
    String email_1;
    String email_2;
    String telefonoMovil;
    String telefonoFijo;
    
    //Metodo de la clase
    public String getEmail(){
        
        if(this.nombres.equals("")){
            return "";
        }
        
        
        return this.nombres;
    }
    
    public void showFullName(){
        System.out.println(("Nombre Completo: "+this.nombres+" "+this.apellidos).trim());
    }
}
