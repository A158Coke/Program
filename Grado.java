import java.util.Scanner;

public class Grado {
    public static void main(String[] arg){
        double centigrado;
        double farenheit;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce temperatura con centígrado");
        centigrado=src.nextDouble();
        farenheit=(centigrado*9/5)+32;
        System.out.println("El temperatura centígrado es: "+centigrado+" y temperatura Farenheit es: "+farenheit+"F");

    }
}
