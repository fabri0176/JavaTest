/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kathe15ortega12
 */
public class Aritmetica {

    private int a;
    private int b;

    public Aritmetica() {
        this.a = 0;
        this.b = 0;
    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sumar() {
        int resultado = this.a + this.b;
        return resultado;
    }

    int multiplicar() {
        return this.a * this.b;
    }

    String getMultiplicar() {

        return Integer.toString(this.multiplicar());
    }
    
    String getDivison(){
        float resultadoDivision = (float)this.a/this.b;
        
        return Float.toString(resultadoDivision);
    }
}
