import java.sql.SQLOutput;
import java.util.Scanner;

public class VelocitatDistancia {
    public static void main(String[] arg){
        Scanner src=new Scanner(System.in);
        double distancia, velocitat1, tiempo,velocitat2;
        //velocitat1 es m/s, velocotat2 es km/h

        System.out.println("Introduce la distancia en metros");
        distancia=src.nextDouble();
        System.out.println("Introduce el tiempo en segundos");
        tiempo= src.nextDouble();
        velocitat1=distancia/tiempo;
        velocitat2=3.6*velocitat1;
        System.out.println("Su velocitat es: "+velocitat2+"km/h");
    }
}
