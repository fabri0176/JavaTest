/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.*;

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

            Persona person = new Persona();
            person.setEmail(email);
            person.setFirstName(firstName);
            person.setTelefono(telefono);
            person.setLastLame(lastName);

            personaJDBC.insert(person);

            System.out.println("Exit (yes/no): ");
            captura = scanner.nextLine().trim();

        }
        System.out.println("**************************************************************************");
        List<Persona> personas = personaJDBC.select();

        for (Persona person : personas) {
            System.out.println(person);

            //Eliminar Persona
            System.out.println("Enter Delete person? yes/no");
            String delete = scanner.nextLine().trim();
            if(delete.equals("yes")){
                personaJDBC.update(person);
                System.out.println(person);
                personaJDBC.delete(person);
                System.out.println("Registro eliminado: "+person.getId());
                
                continue;
            }
            

            //Desea actualizar datos de persona
            System.out.println("Enter update person? yes/no");
            String update = scanner.nextLine().trim();
            if (update.equals("yes")) {
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
            }
        }
    }
}
