/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesgenericas;

import java.util.*;

/**
 *
 * @author fabricio
 */
public class ColeccionesGenericas {
    public static void main(String[] args) {
        List<String> listaString = new ArrayList();
        
        listaString.add("Elemento 1");
        listaString.add("Elemento 2");
        listaString.add("Elemento 3");
        listaString.add("Elemento 4");
        listaString.add("Elemento 3");
        System.out.println("Impresión List");
        print(listaString);
        
        
        Set<String> listaString2 = new HashSet();
        listaString2.add("Elemento 100");
        listaString2.add("Elemento 200");
        listaString2.add("Elemento 100");
        listaString2.add("Elemento 300");
        listaString2.add("Elemento 400");
        listaString2.add("Elemento 200");
        System.out.println("Impresión Set");
        print(listaString2);
        
        Map<String,String> listaString3 = new HashMap();
        listaString3.put("Llave 1", "Valor: 1000");
        listaString3.put("Llave 2", "Valor: 2000");
        listaString3.put("Llave 3", "Valor: 3000");
        listaString3.put("Llave 1", "Valor: 4000");
        listaString3.put("Llave 5", "Valor: 5000");
        System.out.println("Impresión Map");
        print(listaString3.keySet());
        print(listaString3.values());
    }
    
    private static void print(Collection<String> lista){
        for(String elemento: lista){
            System.out.println("Elemento: "+elemento);
            
        }
        System.out.println("");
    }
}
