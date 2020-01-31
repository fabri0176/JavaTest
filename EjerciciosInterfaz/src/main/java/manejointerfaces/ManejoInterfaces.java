/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejointerfaces;

import datos.AccesoDatos;
import datos.ImplementacionMysql;
import datos.ImplementacionOracle;

/**
 *
 * @author fabricio
 */
public class ManejoInterfaces {

    public static void main(String... args) {
        AccesoDatos oConOracle = new ImplementacionOracle();
        oConOracle.insertar();
        oConOracle.listar();
        System.out.println("-------------------------------------");
        AccesoDatos oConMysql = new ImplementacionMysql();
        oConMysql.insertar();
        oConMysql.listar();
        
        System.out.println(AccesoDatos.MAX_REGISTROS);
        System.out.println(AccesoDatos.MIN_REGISTROS);
    }
}
