/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.nfp.com.co.mundopc;

import java.util.UUID;

/**
 *
 * @author fabricio
 */
public class Computadora {

    private String id;
    private String nombre;
    private Teclado teclado;
    private Monitor monitor;
    private Raton raton;
    private float costo;
    

    public Computadora(String nombre, Teclado teclado, Monitor monitor, float costo) {
        this.nombre = nombre;
        this.teclado = teclado;
        this.monitor = monitor;
        this.costo = costo;
    }
 
    public String getId() {
        return id;
    }
    
    

    private void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Computadora{" + "id=" + id + ", nombre=" + nombre + ", teclado=" + teclado + ", monitor=" + monitor + ", raton=" + raton + ", costo=" + costo + '}';
    }
    
    
    
    

}
