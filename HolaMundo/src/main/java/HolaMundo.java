
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class HolaMundo {

    public static void main(String[] args) {
        boolean esAdulto;
        short edad = 19;

        esAdulto = edad >= 18;

        System.out.println("El joven que tiene " + edad + " Es adulto?:" + esAdulto);

        //Convertir
        System.out.println("---------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad?");
        int edad2 = Integer.parseInt(scanner.nextLine());

        System.out.println("La persona es mayor de edad?:" + (edad2 >= 18));

        System.out.println("---------------------------------------------------");
        char c = "hola".charAt(2);
        System.out.println("El caracter c es " + c);
        System.out.println("---------------------------------------------------");
        System.out.println("Cual es su edad?");
        char a = scanner.nextLine().charAt(0);
        System.out.println(a);
        System.out.println("---------------------------------------------------");
        System.out.println(String.valueOf(25));
        System.out.println(String.valueOf(true));

        var mivariable = "Texto";
        System.out.println("mivariable = " + mivariable);

        var doubleVar = 12d;
        System.out.println("doubleVar = " + doubleVar);

        var floatVar = 12.2f;
        System.out.println("floatVar = " + floatVar);

        //Concatenación
        var usuario = "Nestor";
        var titulo = "Ingeniero de Sistemas";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var num1 = 3;
        System.out.println("num1 = " + num1);

        var num2 = 4;
        System.out.println("num2 = " + num2);

        System.out.println(num1 + num2 + union);//7Ingeniero de Sistemas Nestor
        System.out.println(union + num1 + num2);//Ingeniero de Sistemas Nestor34
        System.out.println(union + (num1 + num2));//Ingeniero de Sistemas Nestor7


        
    }
}
