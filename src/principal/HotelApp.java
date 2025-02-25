package principal;

import gestionhabitaciones.Habitaciones;
import input.Input;
import output.Output;
import recepcion.GestionChecks;
import validador.Validador;


public class HotelApp {

    public static final int EJECUTAR_MENU = 1;
    public static final int LISTAR = 2;
    public static final int IMPRIMIR = 3;
    public static final int SIE = 4;
    public static final int INFORME = 5;
    public static final int SALIR = 6;

    private static Output output;
    private static Input input;
    private static boolean quiereSeguir;
    private static int opcionMenu;
    private static  GestionChecks gChecks;
    private static Habitaciones gHabs;


    public static void main(String[] args) {
        gHabs = new Habitaciones();
        gChecks = new GestionChecks();
        input = new Input();
        output = new Output();
        quiereSeguir = true;


        do {
           do {
               mostrarMenu();
               recibirOpcionMenu();
           }while(!opcionValida());
            gestionhotel();

        }while (quiereSeguir);

    }

    private static boolean opcionValida() {

        Validador validador = new Validador();
       return validador.esValido(opcionMenu);
    }

    private static void mostrarMenu() {
        output.mostrarMenu();
    }

    private static int recibirOpcionMenu() {
        return opcionMenu = input.getInt();
    }

    private static void gestionhotel() {

        switch (opcionMenu){
            case EJECUTAR_MENU ->{
                gChecks.ejecutarMenuCheckin();

            }
            case LISTAR ->{gChecks.listarCheckout();}
            case IMPRIMIR ->{gHabs.imprimirTablero();}
            case SIE ->{System.out.println("SIE");}
            case INFORME ->{System.out.println("Informe");}
            case SALIR ->{quiereSeguir = false;}
        }
    }



}
