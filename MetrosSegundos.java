import java.util.Scanner;

public class MetrosSegundos {
    public static void main(String[] arg){
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce velocidad en quilometros por hora");
        double velocidad1;
        velocidad1=src.nextDouble();
        double velocidad2=velocidad1*1000/3600;
        System.out.println("El velocidad con metros por segundo es:"+velocidad2+"m/s");


    }
}
