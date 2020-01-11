/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
public class Empleado extends Persona{
    private double sueldo;
    public Empleado(String nombre, int edad){
        super(nombre, edad);
    }
    
    public Empleado(String nombre, int edad, double sueldo){
        this(nombre, edad);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
