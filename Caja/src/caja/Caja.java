/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja;

/**
 *
 * @author fabricio
 */
public class Caja {

    int alto;
    int largo;
    int profundo;
    float volumen;
    Caja(){
        
    }
    
    Caja(int alto, int largo, int profundo){
        this.alto = alto;
        this.largo = largo;
        this.profundo = profundo;
    }
    
    boolean setVolumen(){
        this.volumen = this.alto * this.largo * this.profundo;
        return true;
    }
    
    float getVolumen(){
        this.setVolumen();
        return this.volumen;
    }
}
