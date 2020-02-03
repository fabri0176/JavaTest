/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MundoPc;
import co.nfp.com.co.mundopc.*;

/**
 *
 * @author fabricio
 */
public class MundoPc {
    public static void main(String[] args) {
        Orden orden = new Orden();
        
        Monitor monitor1 = new Monitor("LG", 17);
        Teclado teclado1 = new Teclado("USB", "GENIUS");
        
        Computadora pc1 = new Computadora("PC1 GENERIC ONE",teclado1, monitor1, 3400000);
        Computadora pc2 = new Computadora("PC2 GENERIC ONE",teclado1, monitor1, 3700000);
        Computadora pc3 = new Computadora("PC3 GENERIC ONE",teclado1, monitor1, 3600000);
        Computadora pc4 = new Computadora("PC4 GENERIC ONE",teclado1, monitor1, 3100000);
        
        orden.agregarComputadora(pc1);
        orden.agregarComputadora(pc2);
        
        orden.mostrarOrden();
        System.out.println("Total a pagar: "+orden.calcularTotal()); 
    }
}
