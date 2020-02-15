/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author fabricio
 */
public class PersonaDto {

    private int id;
    private String firstName;
    private String lastLame;

    public PersonaDto() {

    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", firstName=" + firstName + ", lastLame=" + lastLame + ", email=" + email + ", telefono=" + telefono + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastLame() {
        return lastLame;
    }

    public void setLastLame(String lastLame) {
        this.lastLame = lastLame;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    private String email;
    private String telefono;
}
