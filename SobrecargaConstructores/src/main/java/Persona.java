/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
public class Persona {
    private int persona;
    private String nombre;
    private int edad;
    private int personaId;
    private static int contadorPersonas;
    
    private Persona(){
        this.personaId = ++contadorPersonas;
    }
    
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPersonaId() {
        return personaId;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "persona=" + persona + ", nombre=" + nombre + ", edad=" + edad + ", personaId=" + personaId + '}';
    }
    
    
}
