
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
public class MetodosArtimeticos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el alto: ");
        int alto = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Ingrese el ancho: ");
        int ancho = Integer.parseInt(scanner.nextLine());
        
        int perimetro =  (alto+ancho)*2;
        int area = alto*ancho;
        
        System.err.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
}
