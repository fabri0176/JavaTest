/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author fabricio
 */
public class Ventas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 75000);
        Producto producto2 = new Producto("Correa", 15000);
        Producto producto3 = new Producto("Pantalon", 95000);
        Producto producto4 = new Producto("Medias", 25000);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        
        orden1.mostrarOrden();
        
    }
}
