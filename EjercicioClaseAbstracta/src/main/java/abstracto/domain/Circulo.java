package abstracto.domain;

/**
 *
 * @author fabricio
 */
public class Circulo extends FiguraGeometrica{
    
    public Circulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Aquí deberia dibujar: "+this.getClass().getSimpleName());
    }
    
    
}
