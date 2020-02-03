/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.nfp.com.co.mundopc;

import java.util.UUID;

/**
 *
 * @author fabricio
 */
public final class Teclado extends DispositivoEntrada {

    private String id;
    private static int contadroTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.setId();
        ++contadroTeclados;
    }

    private void setId() {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
    }

    @Override
    public String toString() {
        return "Teclado{" + "id=" + id + '}';
    }
    
    

}
