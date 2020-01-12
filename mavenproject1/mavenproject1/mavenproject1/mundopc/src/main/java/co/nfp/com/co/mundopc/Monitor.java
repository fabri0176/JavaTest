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
public class Monitor {
    private String id;
    private String marca;
    private float tamano;
    private static int contadorMonitores;
    
    private Monitor(){
        this.setId();
        ++contadorMonitores;
    }
    
    public Monitor(String marca, float tamano){
        this();
        this.marca = marca;
        this.tamano = tamano;
    }
    
    private void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "id=" + id + ", marca=" + marca + ", tamano=" + tamano + '}';
    }
    
}
