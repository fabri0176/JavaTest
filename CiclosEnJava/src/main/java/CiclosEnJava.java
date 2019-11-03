/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kathe15ortega12
 */
public class CiclosEnJava {
    public static void main(String[] args) {
        
        System.out.println("--------------------- CICLO WHILE ---------------------");
        short itter = 0;
        while (true) {    
            System.out.println("itter = "+itter);
            if(itter  == 100){  
                break;
            }
            itter++;
        }
        
        System.out.println("--------------------- CICLO FOR ---------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("--------------------- CICLO DO WHILE ---------------------");
        short itter2=0;
        do{
            System.out.println("itter2 = "+itter2);
            itter2++;
        }while(itter2 <= 10);
    }
    
    
    
}
