package input;

import java.util.Scanner;

public class Input {

    int numero;
    String palabra;
    double numDouble;
    Scanner sc = new Scanner(System.in);


    private  void numero(){
        numero = Integer.parseInt(sc.nextLine());
    }

    private  void palabra(){
        palabra = sc.nextLine();
    }

    private  void numdouble(){
        numDouble = Double.parseDouble(sc.nextLine());
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
