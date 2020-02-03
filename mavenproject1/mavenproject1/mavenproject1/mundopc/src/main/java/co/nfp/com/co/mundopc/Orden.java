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
public class Orden {

    private String id;
    Computadora computadoras[];
    private int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    private void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public Orden() {
        this.setId();
        ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        
        if (contadorComputadoras > MAX_COMPUTADORAS) {
            System.out.println("Ha excedido el número de computadoras permitidos para la orden");
            return;
        }
        this.computadoras[contadorComputadoras] = computadora;
        contadorComputadoras++;
    }

    public float calcularTotal() {
        float total = 0;
        for (int i = 0; i < contadorComputadoras; i++) {
            total += this.computadoras[i].getCosto();
        }

        return total;
    }

    public void mostrarOrden() {
        for (int i = 0; i < contadorComputadoras; i++) {
            Computadora computadora = this.computadoras[i];
            
            System.out.println("Item "+i+" = "+computadora);
        }
    }


    
    
}
