import java.util.Scanner;

public class LongitudYArea {
    public static void main(String[] arg){
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce radi d’una circumferència");
        double radi;
        radi=src.nextDouble();
        double longitut=Math.PI*2*radi;
        double area= Math.PI*(Math.pow(radi,2));
        System.out.println("Longitud es: "+longitut+" y area es:" +area);

    }

}
