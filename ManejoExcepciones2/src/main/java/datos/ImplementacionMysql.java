package datos;

import excepciones.AccesoDatosEx;
import excepciones.EscrituraDatosEx;
import excepciones.LecturaDatosEx;

public class ImplementacionMysql implements AccesoDatos{
    private boolean simularError;
    @Override
    public void insertar() throws AccesoDatosEx{
        if(isSimularError()){
            throw new EscrituraDatosEx("Error escritura de datos");
        }else{
            System.out.println("Insertar desde Mysql");
        }
        
    }

    @Override
    public void listar() throws AccesoDatosEx{
         if(isSimularError()){
            throw new LecturaDatosEx("Error escritura de datos");
        }else{
            System.out.println("Listar desde Mysql");
        }
        
    }

    @Override
    public void simularError(boolean simularError) {
        this.simularError = simularError;
    }
    
    public boolean isSimularError(){
        return this.simularError;
    }
    
    
    
}
