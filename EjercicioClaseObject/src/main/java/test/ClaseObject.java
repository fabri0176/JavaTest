package test;

import dominio.Empleado;

/**
 *
 * @author fabricio
 */
public class ClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Néstor", 1000);
        System.out.println(empleado1);
        
        Empleado empleado2 = new Empleado("Néstor", 1000);
        System.out.println(empleado2);
        
        System.out.println("Objetos iguales "+(empleado1 == empleado2));
        
        compararObjetos(empleado1,empleado2);
    }
    
    private static void compararObjetos(Empleado emp1, Empleado emp2){
        System.out.println("emp1 = "+emp1);
        System.out.println("emp2 = "+emp2);
        
        if(emp1 == emp2){
            System.out.println("Los objetos tienen la misma direccion de memoria");
        }else{
            System.out.println("Los objetos no tienen la misma dirección de memoria");
        }
        
        //Revisión metodo equals
        if(emp1.equals(emp2)){
            System.out.println("Los objetos tienen el mismo contenido");
        }else{
            System.out.println("Los objetos no tienen el mismo contenido");
        }
        
        //Revisión metodo hasCode
        
    }
}
