
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
public class HolaMundo {
    public static void main(String[] args){
        boolean esAdulto;
        short edad = 19;
        
        esAdulto = edad >= 18;
        
        System.out.println("El joven que tiene "+edad+" Es adulto?:"+esAdulto);
        
        //Convertir 
        System.out.println("---------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad?");
        int edad2 = Integer.parseInt(scanner.nextLine());
        System.out.println("the humman with "+edad2+" is major?:"+(edad2 >= 18));
        
        
        System.out.println("---------------------------------------------------");
        char c = "hola".charAt(2);
        System.out.println("El caracter c es " +c);
        System.out.println("---------------------------------------------------");
        
        System.out.println("---------------------------------------------------");
    }
}
