/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoColecciones;

import java.util.*;

/**
 *
 * @author fabricio
 */
public class ManejoColecciones {

    public static void main(String[] args) {

        List miLista = new ArrayList();
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(3);
        
        System.out.println("miLista");
        imprimir(miLista);

        //Tipo set
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");

        //Agregar elemento duplicado, con set no se agrega el elemento duplicado
        miSet.add("300");
        
        System.out.println("miSet");
        imprimir(miSet);
        
        //Maneja el concepto llave valor
        Map miMapa = new HashMap();
        miMapa.put("1e9838ce-1b39-4800-b891-0729ad37b412", "Néstor");
        miMapa.put("6e5fc5e7-4fc4-4917-85a1-07da3838460c", "Fabricio");
        miMapa.put("db37326b-1c9e-4502-87a3-bc0a31d06cbd", "Katherine");
        miMapa.put("d4c87a69-56bc-4c62-9b6f-932f3d820355", "Lisset");
        
        //Duplicamos un registro, elemento duplicado remplaza el registro original
        miMapa.put("6e5fc5e7-4fc4-4917-85a1-07da3838460c", "Fabricio 2");
        
        System.out.println("<--- miMapa --->");
        System.out.println("Imprimir llaves");
        imprimir(miMapa.keySet());
        
        System.out.println("Imprimir valores");
        imprimir(miMapa.values());
        
        System.out.println("Imprimir valores buscando por llave");
        System.out.println(miMapa.get("6e5fc5e7-4fc4-4917-85a1-07da3838460c"));
        
    }

    static private void imprimir(Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.println("Elemento: " + elemento);
        }
        System.out.println("");
    }
}
