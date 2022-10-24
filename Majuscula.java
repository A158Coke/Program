//import com.sun.source.tree.IfTree;

import java.io.IOException;
//import java.util.Scanner;

public class Majuscula {
    public static void main(String[] arg) throws IOException {
        char car1;
        System.out.println("Introduce una letra");
        car1=(char)System.in.read();
        if(Character.isUpperCase(car1))
        System.out.println("Es majúscula");
        else System.out.println("Es minúscula");


    }
}
