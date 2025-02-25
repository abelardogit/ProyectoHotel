package gestionhabitaciones;
import java.util.Scanner;
public class Habitaciones {



        private char[][] hotel;


        public Habitaciones() {
            hotel = new char[5][4];


        }


        private void inicializarTablero() {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    hotel[i][j] = '-';
                }
            }
        }


        public void imprimirTablero() {

            inicializarTablero();
            for (int i = 0; i < 5; i++) {
                System.out.print(i + " ");
                for (int j = 0; j < 4; j++) {
                    System.out.print(hotel[i][j]);

                }
                System.out.println();

            }
        }

// cometario


        private boolean tableroLleno() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (hotel[i][j] == '-') {
                        return false;
                    }
                }
            }
            return true;
        }


        public void reservar() {
            Scanner scanner = new Scanner(System.in);
            boolean colocado = true;
            while (colocado) {
                imprimirTablero();
                System.out.println(  " Ingresa piso y habitacion (1-4):");
                int fila = scanner.nextInt();
                int columna = scanner.nextInt();

                if (fila < 0 || fila > 4 || columna < 0 || columna > 4 || hotel[fila-1][columna-1] != '-') {
                    System.out.println("Habitacion ya esta reservada");

                }

                hotel[fila-1][columna-1] = 'R';
                colocado= false;



    }

        }
}


