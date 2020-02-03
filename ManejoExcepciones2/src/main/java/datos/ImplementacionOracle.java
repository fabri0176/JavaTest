package datos;

import excepciones.AccesoDatosEx;
import excepciones.LecturaDatosEx;

public class ImplementacionOracle implements AccesoDatos {

    private boolean simularError;

    @Override
    public void insertar() throws AccesoDatosEx {
        if (isSimularError()) {
            throw new LecturaDatosEx("Error escritura de datos");
        } else {
            System.out.println("Insertar desde Oracle");
        }

    }

    @Override
    public void listar() throws AccesoDatosEx {
        if (isSimularError()) {
            throw new LecturaDatosEx("Error escritura de datos");
        } else {
            System.out.println("Listar desde Oracle");
        }

    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }

    public boolean isSimularError() {
        return this.simularError;
    }

}
