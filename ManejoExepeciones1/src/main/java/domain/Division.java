/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author fabricio
 */
public class Division {
    private int numerador;
    private int denominador;
    
    public Division(int numerador, int denominador) throws OperacionExcepcion{
        if(this.denominador == 0){
            throw new OperacionExcepcion("Denominador igual a 0");
        }
        
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public void visualizarOperacion(){
        System.out.println("El resultado de la división es: "+(this.numerador/this.denominador));
    }
}
