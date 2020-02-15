/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import dominio.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author fabricio
 */
public interface PersonaDAO {

    public List<PersonaDTO> select();

    public int insert(PersonaDTO persona) throws SQLException;

    public int update(PersonaDTO persona) throws SQLException;;

    public int delete(PersonaDTO persona) throws SQLException;;

}
