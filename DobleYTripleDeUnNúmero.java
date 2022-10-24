import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class DobleYTripleDeUnNúmero {
    public static void main (String[] arg){
        int num1;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un número");
        num1=src.nextInt();
        int resultado1=num1*2;
        int resultado2=num1*3;
        System.out.println("El double es: "+resultado1+" y el triple es: "+resultado2);
    }


}
