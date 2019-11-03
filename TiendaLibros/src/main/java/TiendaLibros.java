
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kathe15ortega12
 */
public class TiendaLibros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la libreria! ");
        System.out.println("Ingresa el nombre del libro:");
        String libroName = scanner.nextLine();
        
        System.out.println("Ingresa el precio:");
        short precioLibro = Short.parseShort(scanner.nextLine());
        
        System.out.println("Ingresa la moneda $?");
        char moneda = scanner.nextLine().charAt(0);
        
        System.out.println("Envío gratuito?");
        boolean envioGratis = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println("Libro: "+libroName);
        System.out.println("Precio: "+moneda+""+precioLibro);
        System.out.println("Envío gratis?"+ String.valueOf(envioGratis));
        
        
    }
}
