import java.util.Scanner;

public class NotaValor {
    public static void main(String[] arg) {
        System.out.println("Introduce tu nota");
        int nota = 1-10;
        Scanner sc=new Scanner(System.in);
        nota= sc.nextInt();
        switch (nota) {
            case 0,1,2,3,4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("Tu nota es suficiente");
                break;
            case 6:
                System.out.println("Tu nota es bien");
                break;
            case 7:
                System.out.println("Tu nota es notable baja");
                break;
            case 8:
                System.out.println("Tu nota es notable alta");
                break;
            case 9:
                System.out.println("Tu nota es excelente");
                break;
            case 10:
                System.out.println("Tu nota es matricula de honor");
                break;

            default:
                System.out.println("No introduce numeros mayor que 10 o menor que 0");

        }
    }


}

