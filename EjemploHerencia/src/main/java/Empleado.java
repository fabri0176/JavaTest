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
    private int id;
    private double salario;
    private static int contadorEmpleado;
    
    public Empleado(String nombre, double salario) {
        super(nombre);
        this.id = ++contadorEmpleado;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }

    @Override
    public String toString() {
        return super.toString()+ " Empleado{" + "id=" + id + ", salario=" + salario + '}';
    }
    
    
}
