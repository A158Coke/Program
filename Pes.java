import java.util.Scanner;

public class Pes {
    public static void main(String [] arg){
        double peso1,peso2;
        //peso1 es peso en tierra, peso2 es el peso en la lluna;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce el peso en la tierra en kg");
        peso1= src.nextDouble();
        peso2=peso1/9.81;
        System.out.println("El peso en luna es"+peso2+"kg");
    }
}
