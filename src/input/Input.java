package input;

import java.util.Scanner;

public class Input {

    int numero;
    String palabra;
    double numDouble;
    Scanner scannerValue = new Scanner(System.in);


    private  void numero(){
        numero = scannerValue.nextInt();
    }

    private  void palabra(){
        palabra = scannerValue.nextLine();
    }

    private  void numdouble(){
        numDouble = Double.parseDouble(scannerValue.nextLine());
    }


    public  int getInt(){
        numero();
        return numero;
    }

    public  String getString(){
        palabra();
        return palabra;
    }
    public  double getDouble(){
        numdouble();
        return numDouble;
    }
}
