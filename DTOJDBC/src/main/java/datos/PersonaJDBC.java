/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.PersonaDto;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabricio
 */
public class PersonaJDBC {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona (first_name,last_name,telefono,email) VALUES(?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET first_name = ?, last_name = ?, telefono = ?, email = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id = ?";

    public PersonaJDBC() {

    }

    public PersonaJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<PersonaDto> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDto persona = null;
        List<PersonaDto> personas = new ArrayList<PersonaDto>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");

                //Crear objeto personas
                persona = new PersonaDto();
                persona.setId(id);
                persona.setFirstName(firstName);
                persona.setLastLame(lastName);
                persona.setTelefono(telefono);
                persona.setEmail(email);

                //Agregar a lista personas
                personas.add(persona);

            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            //Cerrar conexiones
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }

        }

        return personas;

    }

    public int insert(PersonaDto persona) {
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getFirstName());
            stmt.setString(2, persona.getLastLame());
            stmt.setString(3, persona.getTelefono());
            stmt.setString(4, persona.getEmail());

            System.out.println("Ejecutando INSERT " + SQL_INSERT);
            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            //Cerrar conexiones

            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        System.out.println("Registros Afectados: " + rows);
        return rows;

    }

    public int update(PersonaDto person) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            System.out.println("Ejecutando Query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, person.getFirstName());
            stmt.setString(2, person.getLastLame());
            stmt.setString(3, person.getTelefono());
            stmt.setString(4, person.getEmail());
            stmt.setInt(5, person.getId());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(System.out);
        } finally {
            //Cerrar conexiones

            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        System.out.println("Registros Afectados: " + rows);
        return rows;
    }

    public int delete(PersonaDto person) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            //Obtener la conexión
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConection();
            System.out.println("Ejecutando Query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, person.getId());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            //Cerrar conexiones

            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }
        System.out.println("Registros Afectados: " + rows);
        return rows;
    }
}
