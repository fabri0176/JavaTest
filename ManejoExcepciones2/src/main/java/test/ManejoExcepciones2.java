package test;

import datos.AccesoDatos;
import datos.ImplementacionMysql;
import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;

/**
 *
 * @author fabricio
 */
public class ManejoExcepciones2 {

    public static void main(String... args) {
        AccesoDatos datosMysql = new ImplementacionMysql();
        datosMysql.simularError(false);
        ejectuar(datosMysql, "listar");
    }

    private static void ejectuar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            try {
                datos.listar();
            } catch (LecturaDatosEx ex) {
                //Excepción menor gerarquia
                System.out.println("Error de lectura");
                ex.printStackTrace(System.out);//Excepción se manda a la consola
            } catch (AccesoDatosEx ex) {
                System.out.println("Error de acceso a datos");
                ex.printStackTrace(System.out);//Excepción se manda a la consola
            } catch (Exception ex) {
                System.out.println("Error general");
                ex.printStackTrace(System.out);//Excepción se manda a la consola
            } finally {
                System.out.println("Procesar Finally opcional");
                
            }
        } else if ("insertar".equals(accion)) {
            try {
                datos.insertar();
            } catch (AccesoDatosEx ex) {
                System.out.println("Excpeción de acceso a datos");
                ex.printStackTrace(System.out);//Excepción se manda a la consola
            }
        } else {
            System.out.println("No se tiene accion conocida");
            
        }
    }
}
