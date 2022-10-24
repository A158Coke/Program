import java.lang.module.FindException;
import java.sql.SQLOutput;
import java.util.Scanner;
//1pesetas=0.006euro
//1euro=166.386pesetas

public class EuroYPts {
     public static void main(String[]arg){
           int menu;
           Scanner sc=new Scanner(System.in);
           double pesetas, euros;
           System.out.println("Introduce convertir a euros pulsa 1 si quieres pesetas pulsa 2" );
           menu=sc.nextInt();
           if (menu==1){
               System.out.println("Introduce las pesetas a convertir");
               pesetas=sc.nextDouble();
               euros=pesetas/166.386;
               System.out.println("El total de euros son: "+euros+"");
           }
           else{
               System.out.println("Introduce los euros a convertir");
               euros=sc.nextDouble();
               pesetas=euros*166.386;
               System.out.println(" El total de pesetas son: "+pesetas+"pts");
           }
       }
}
