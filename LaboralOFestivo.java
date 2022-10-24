import java.util.Scanner;

public class LaboralOFestivo {
    public static void main(String[] arg){
        int dia;
        System.out.println("Introduce un numero 1-7 para saber el dia de semana y su estado");
        Scanner src=new Scanner(System.in);
        dia=src.nextInt();
        switch (dia){

            case 1 :
                System.out.println("Hoy es lunes, dia laboral");
                break;
            case 2 :
                System.out.println("Hoy es martes, dia laboral");
                break;
            case 3 :
                System.out.println("Hoy es miercoles, dia laboral");
                break;
            case 4 :
                System.out.println("Hoy es jueves, dia laboral");
                break;
            case 5 :
                System.out.println("Hoy es viernes, dia laboral");
                break;
            case 6 :
                System.out.println("Hoy es sabato, dia festivo");
                break;
            case 7 :
                System.out.println("Hoy es domingo, dia festivo");
                break;
            default:
                System.out.println("Solo introduce numero de 1 a 7");
        }
    }


}
