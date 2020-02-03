
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Néstor Fabricio Parra", 3500000);
        empleado1.setEdad(28);
        System.out.println(empleado1);
        
        Cliente cliente1 = new Cliente(new Date() , true);
        System.out.println(cliente1);
    }
}
