/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;

import abstracto.domain.FiguraGeometrica;
import abstracto.domain.Triangulo;

/**
 *
 * @author fabricio
 */
public class EjemplosClasesAbstractas {

    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo("Triangulo");

        System.out.println(triangulo);
        triangulo.dibujar();
    }

}
