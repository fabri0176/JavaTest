/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utileria;

import java.io.*;
import java.sql.Struct;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabricio
 */
public class Archivo {

    public static void crearArchivo(String fileName) {
        File archivo = new File(fileName);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se ha creado correctamente");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void writeFile(String filename) {
        File archivo = new File(filename);
        try {
            String conetenido = "Contenido a escribir en el archivo";
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(conetenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();

            System.out.println("Se ha escrito correctamente e archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void readFile(String fileName) {
        File archivo = new File(fileName);

        BufferedReader entrada;
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);;
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
    
    public static void anexarArchivo(String filename){
        File archivo = new File(filename);
        try{
            PrintWriter salida = new PrintWriter( new FileWriter(archivo) );
            String contenido = "Anexando información al archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de anexar");
            salida.close();
            
            System.out.println("Se ha anexado la información al archivo");
            
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
