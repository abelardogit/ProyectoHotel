package principal;

import gestionhabitaciones.Habitaciones;
import input.Input;
import output.Output;
import recepcion.GestionChecks;
import validador.Validador;


public class HotelApp {

    private static Output output;
    private static Input input;
    private static boolean usuarioQuiereSeguir;
    private static int opcionMenu;
    private static  GestionChecks gChecks;
    private static Habitaciones gHabs;


    public static void main(String[] args) {
        gHabs = new Habitaciones();
        gChecks = new GestionChecks();
        input = new Input();
        output = new Output();
        usuarioQuiereSeguir = true;


        do {
           do {
               mostrarMenu();
               recibirOpcionMenu();
           }while(!opcionValida());
            gestionhotel();

        }while (usuarioQuiereSeguir);



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
            case 1 ->{
                gChecks.ejecutarMenuCheckin();

            }
            case 2 ->{gChecks.listarCheckout();}
            case 3 ->{gHabs.imprimirTablero();}
            case 4 ->{System.out.println("SIE");}
            case 5 ->{System.out.println("Informe");}
            case 6 ->{
                usuarioQuiereSeguir = false;}
        }
    }



}
