import java.util.Scanner;

public class NumeroPantalla {
    public static void main (String [] args){
      int num1, num2;
        Scanner src=new Scanner(System.in);
        System.out.println("Introduce un número");
        num1=src.nextInt();
        System.out.println("Introduce otro número");
        num2=src.nextInt();
        System.out.println("Ha introducido los números "+num1+" y " +num2);

    }
}
