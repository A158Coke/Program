import java.io.IOException;

public class ComparatorMinuscula {
    public static void main(String[] arg) throws IOException {
        char car1,car2;
        System.out.println("Introduce una letra");
        car1=(char)System.in.read();
        System.in.read();
        System.out.println("Introduce otra letra");
        car2=(char)System.in.read();
       if(Character.isLowerCase(car1)) {
           if (Character.isLowerCase(car2))
               System.out.println("Son minúsculas");
               else System.out.println("No son minúsculas");
           }
       else System.out.println("No son minúsculas");
       }
       // Tambien se puede hacer asi:
    // if(Character.isLowerCase(car1) && (character.isLowerCase(car2)){
    //System.out.println("Las dos letras son minusculas")}
    //else System.out.println("No son todas mayusculas")






    }

