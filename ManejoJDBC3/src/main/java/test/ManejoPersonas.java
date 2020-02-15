/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PersonaJDBC;
import dominio.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabricio
 */
public class ManejoPersonas {

    public static void main(String... args) {

        PersonaJDBC personaJDBC = new PersonaJDBC();
        String captura = "no";
        Scanner scanner = new Scanner(System.in);
        while ("no".equals(captura.toLowerCase().trim())) {
            System.out.println("**************************************************************************");
            System.out.println("Welcome!");

            System.out.println("Enter your First name: ");
            String firstName = scanner.nextLine().trim();

            System.out.println("Enter your Last name: ");
            String lastName = scanner.nextLine().trim();

            System.out.println("Enter your Phone: ");
            String telefono = scanner.nextLine().trim();

            System.out.println("Enter your Email: ");
            String email = scanner.nextLine().trim();

            PersonaDTO person = new PersonaDTO();
            person.setEmail(email);
            person.setFirstName(firstName);
            person.setTelefono(telefono);
            person.setLastLame(lastName);

            try {
                personaJDBC.insert(person);
            } catch (SQLException ex) {
                Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Exit (yes/no): ");
            captura = scanner.nextLine().trim();

        }
        System.out.println("**************************************************************************");
        List<PersonaDTO> personas = personaJDBC.select();

        for (PersonaDTO person : personas) {
            System.out.println(person);

            //Eliminar PersonaDTO
            System.out.println("Enter Delete person? yes/no");
            String delete = scanner.nextLine().trim();
            if(delete.equals("yes")){
                try {
                    personaJDBC.update(person);
                } catch (SQLException ex) {
                    Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(person);
                try {
                    personaJDBC.delete(person);
                } catch (SQLException ex) {
                    Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Registro eliminado: "+person.getId());
                
                continue;
            }
            

            //Desea actualizar datos de persona
            System.out.println("Enter update person? yes/no");
            String update = scanner.nextLine().trim();
            if (update.equals("yes")) {
                try {
                    System.out.println("Enter your First name: ");
                    String firstName = scanner.nextLine().trim();
                    
                    System.out.println("Enter your Last name: ");
                    String lastName = scanner.nextLine().trim();
                    
                    System.out.println("Enter your Phone: ");
                    String telefono = scanner.nextLine().trim();
                    
                    System.out.println("Enter your Email: ");
                    String email = scanner.nextLine().trim();
                    
                    person.setEmail(email);
                    person.setFirstName(firstName);
                    person.setTelefono(telefono);
                    person.setLastLame(lastName);
                    
                    personaJDBC.update(person);
                    System.out.println(person);
                } catch (SQLException ex) {
                    Logger.getLogger(ManejoPersonas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
