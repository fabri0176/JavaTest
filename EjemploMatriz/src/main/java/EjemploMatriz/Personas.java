/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploMatriz;

import java.util.UUID;

/**
 *
 * @author fabricio
 */
public class Personas {
    private String id;
    private String nombres;
    private String apellidos;

    public Personas(String nombres, String apellidos) {
        this.setId();
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    
    private void setId(){
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public String getId() {
        return id;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Personas{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + '}';
    }
    
    
    
}
