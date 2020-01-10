
import com.google.gson.Gson;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabricio
 */
public class Persona {
    private int id; //Se asocia con el objeto
    private String nombre;
    private static int contadorPersonas; //Se asocia con la clase
    
    Persona(String nombre){
        
        this.id = ++contadorPersonas; //Suma y se asigna
        this.setNombre(nombre);
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }
    
    
    @Override
    public  String toString(){
        Gson gson = new Gson();
        String json = gson.toJson(this);
        return json;
    }
}
