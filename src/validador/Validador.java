package validador;

import java.util.HashMap;

public class Validador {

    HashMap<Integer,Character> listaEquivalencias ;
    public Validador() {
        listaEquivalencias = new HashMap<>();
    }

    public  boolean esValido(int opcionMenu){
        return (opcionMenu>0 && opcionMenu <7);
    }



    public  boolean validarNifNie(String nifnie){
        tablaEquivalencias();

        char letra = nifnie.charAt(8);
        String nuevoString = nifnie.substring(0,8);
        int stringANumero = Integer.parseInt(nuevoString);
        int resto = stringANumero%23;
        if (letra == listaEquivalencias.get(resto)) {
            return true;
        }
        else {
            return  false;
        }
        }








    public  void tablaEquivalencias(){


        listaEquivalencias.put(0,'T');
        listaEquivalencias.put(1,'R');
        listaEquivalencias.put(2,'W');
        listaEquivalencias.put(3,'A');
        listaEquivalencias.put(4,'G');
        listaEquivalencias.put(5,'M');
        listaEquivalencias.put(6,'Y');
        listaEquivalencias.put(7,'F');
        listaEquivalencias.put(8,'P');
        listaEquivalencias.put(9,'D');
        listaEquivalencias.put(10,'X');
        listaEquivalencias.put(11,'B');
        listaEquivalencias.put(12,'N');
        listaEquivalencias.put(13,'J');
        listaEquivalencias.put(14,'Z');
        listaEquivalencias.put(15,'S');
        listaEquivalencias.put(16,'Q');
        listaEquivalencias.put(17,'V');
        listaEquivalencias.put(18,'H');
        listaEquivalencias.put(19,'L');
        listaEquivalencias.put(20,'C');
        listaEquivalencias.put(21,'K');
        listaEquivalencias.put(22,'E');


    }

}
