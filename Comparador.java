import java.io.IOException;

public class Comparador {
    public static void main(String[] arg) throws IOException {
        char car1,car2;
        System.out.println("Introduce una letra");
        car1=(char)System.in.read();
        System.in.read();
        System.out.println("Introduce otra letra");
        car2=(char) System.in.read();
        if(car1==car2)
        System.out.println("Letra1 es igual que letra2");
        else System.out.println("Letra1 no es igual que letra2");
    }
}
