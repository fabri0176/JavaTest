package enumeraciones;

public enum Dias {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;

    public static void indicarDia(Dias dia) {


        switch (dia) {
            case LUNES: {
                System.out.print("Primer día de la semana");
                break;
            }
            case MARTES: {
                System.out.print("Segundo día de la semana");
                break;
            }
            case MIERCOLES: {
                System.out.print("Tercer día de la semana");
                break;
            }
            case JUEVES: {
                System.out.print("Cuarto día de la semana");
                break;
            }
            case VIERNES: {
                System.out.print("Quinto día de la semana");
                break;
            }
            case SABADO: {
                System.out.print("Sexto día de la semana");
                break;
            }
            case DOMINGO: {
                System.out.print("Septimo día de la semana");
                break;
            }
        }
    }
}
