/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author fabricio
 */
public class IntroduccionJDBC {

    public static void main(String[] args) {
        try {
            // configuración conexión
            String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC";

            Connection conexion = DriverManager.getConnection(url, "root", "root");

            //stage 3 
            Statement instruccion = conexion.createStatement();

            //stage 4
            String sql = "SELECT persona.id,persona.first_name,persona.last_name FROM persona";

            //Stage 5, execute query
            ResultSet resultado = instruccion.executeQuery(sql);

            //Stage 6 process
            while (resultado.next()) {
                System.out.println("------------------------------------------------------------------------");
                System.out.println("ID:\t\t" + resultado.getInt(1));
                System.out.println("First name:\t" + resultado.getString(2));
                System.out.println("Last name:\t" + resultado.getString(3));
            }

        } catch (SQLException ex) {

            ex.printStackTrace(System.out);
        }

    }
}
