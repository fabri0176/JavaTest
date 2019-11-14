
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
public class PruebaAritmetica {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        
        
        for(int i=1;i<=2;i++){
            System.out.println(i+". Ingrese el valor : ");
            if(i==1){
                a = scanner.nextInt();
            }else if(i==2){
                b = scanner.nextInt();
            }
        
        }
        
        Aritmetica pruebaAritmetica1 = new Aritmetica(a,b);
        int resultado = pruebaAritmetica1.sumar();
        
        System.out.println("resultado Suma = "+resultado);
        System.out.println("resultado Multiplicación = "+pruebaAritmetica1.getMultiplicar());
        System.out.println("resultado División = "+pruebaAritmetica1.getDivison());
    }
    
}
