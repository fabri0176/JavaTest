package EjemploMatriz;

import EjemploMatriz.Personas;

/**
 *
 * @author fabricio
 */
public class EjemploMatriz {

    public static void main(String[] args) {
        Personas personas[][] = new Personas[2][2];
        personas[0][0] = new Personas("Katherine Lisseth", "Ortega");
        personas[0][1] = new Personas("Nestor Fabricio", "Parra");

        personas[1][0] = new Personas("Jose Jeison", "Parra");
        personas[1][1] = null;

        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("personas[" + i + "][" + j + "] = " + personas[i][j]);
            }
        }
        System.out.println("-------------------------------------------------------------");
        Personas personas2[][] = {
            {new Personas("Katherine Lisseth", "Ortega"), new Personas("Nestor Fabricio", "Parra")},
            {new Personas("Jose Jeison", "Parra"), null},
            {null, null},};

        for (int i = 0; i < personas2.length; i++) {
            for (int j = 0; j < personas2[i].length; j++) {
                if (personas2[i][j] == null) {
                    continue;
                }

                System.out.println("personas[" + i + "][" + j + "] = " + personas2[i][j]);
            }
        }
    }
}
