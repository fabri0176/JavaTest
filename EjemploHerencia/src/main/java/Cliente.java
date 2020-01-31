
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fabricio
 */
public class Cliente extends Persona {

    private int id;
    private Date fechaRegistro;
    private boolean valid;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro) {

        this.fechaRegistro = fechaRegistro;
        this.valid = valid;
    }

    public Cliente(String nombre) {
        super(nombre);
        this.id = ++contadorCliente;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }

    @Override
    public String toString() {
        return super.toString() + " Cliente{" + "id=" + id + ", fechaRegistro=" + fechaRegistro + ", valid=" + valid + '}';
    }

}
