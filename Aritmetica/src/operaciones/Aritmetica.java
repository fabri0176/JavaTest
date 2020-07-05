/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author fabricio
 */
public class Aritmetica {

    int a;
    int b;
    int resultado;

    public Aritmetica() {

    }

    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sumar() {
        this.resultado = this.a + this.b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getResultado() {
        return resultado;
    }

    public void showResultadoSuma() {
        this.sumar();
        int resultado = this.getResultado();
        System.out.println("resultado = " + resultado);
    }

}
