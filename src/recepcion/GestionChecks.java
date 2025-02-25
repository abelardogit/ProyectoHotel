package recepcion;

import gestionhabitaciones.Habitaciones;
import input.Input;
import output.Output;
import validador.Validador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionChecks {


    public static List<CheckIn> listaClientesCheckin;
    public static List<CheckOut> listaClientesCheckout;
    public static Validador validador;
    public static Input input;
    public static int opcionmenu;

    public GestionChecks() {
        listaClientesCheckin = new ArrayList();
        listaClientesCheckout = new ArrayList();
        input = new Input();
        validador = new Validador();
    }




    public  void ejecutarMenuCheckin(){


        System.out.println("""
                1. agregar
                2. listar
                3. eliminar
                """);
        opcionmenu = input.getInt();

        if (opcionmenu==1){

            agregarCheckin();
        }
        else if(opcionmenu==2){
            listarClientesChekIn();
        }
        else {
            eliminarRegistro();
        }




    }

    public  void listarCheckout(){



        for (CheckOut lista:listaClientesCheckout){
            System.out.println(lista);
        }



    }





    public static void agregarCheckin(){

        Habitaciones gHab = new Habitaciones();
        gHab.reservar();

            System.out.println("ingrese  NIE o NIF");
            String nifnie = input.getString();
        if (validador.validarNifNie(nifnie)){
            System.out.println("ingrese nombre completo");
            String nombrecompleto = input.getString();
            System.out.println("ingrese nacionalidad");
            String nacionalidad = input.getString();
            System.out.println("tipo de habitacion  normal/premium");
            String tipoHabitacion = input.getString();
            System.out.println("ingrese numero de noches");
            int numNoches = input.getInt();
            listaClientesCheckin.add(new CheckIn(nifnie,nombrecompleto,nacionalidad,tipoHabitacion,numNoches,"20250224"));

        }
        else {
            System.out.println("el nie es incorrecto");
        }





    }

    public static void listarClientesChekIn(){


        for (CheckIn lista:listaClientesCheckin){
            System.out.println(lista);
        }



    }


    public static void eliminarRegistro(){


        for (CheckIn lista:listaClientesCheckin){
            System.out.println(lista);
        }

        boolean encontrado = false;
        Iterator<CheckIn> iCheking = listaClientesCheckin.iterator();
        System.out.println("ingrese  NIE o NIF");
        String nifnie = input.getString();
        while (iCheking.hasNext() && !encontrado ){

            if (iCheking.next().getDocumentoIdentidad().equals(nifnie)){
                CheckIn usuarioActual = iCheking.next();
                listaClientesCheckout.add(new CheckOut(usuarioActual.getDocumentoIdentidad(), usuarioActual.getNombreCompleto(), usuarioActual.getNacionalidad(), usuarioActual.getTipoHabitacion(), usuarioActual.getCantNoches(), "20250228"));

                iCheking.remove();
                encontrado = true;
            }


        }



    }


}
