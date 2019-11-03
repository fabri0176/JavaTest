
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
public class SenteciasControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una nota calificación: ");
        short nota = Short.parseShort(scanner.nextLine());
        
        if(nota == 9 || nota == 10){
            System.out.println("A");
        }else if(nota == 8){
            System.out.println("B");
        }else if(nota == 7){
            System.out.println("C");
        }else if(nota == 6){
            System.out.println("D");
        }else if(nota >= 0 && nota < 6){
            System.out.println("F");
        }else{
            System.out.println("Error");
        }
    }
}
