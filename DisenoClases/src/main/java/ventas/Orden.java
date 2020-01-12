/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.UUID;

/**
 *
 * @author fabricio
 */
public class Orden {

    private String id;
    private Producto productos[];
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.setId();
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    private void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    public void agregarProducto(Producto producto) {

        if (this.contadorProductos > MAX_PRODUCTOS) {
            System.out.println("Ha excedido el limite de productos");
            return;
        }

        this.productos[this.contadorProductos++] = producto;

    }

    public double calcularTotal() {
        
        double total = 0;
        
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            total += producto.getPrice();
        }

        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("ID ORDEN "+this.id);
        System.out.println("Total de la orden = $"+this.calcularTotal());
        System.out.println("Productos de la orden");
         for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }
}
