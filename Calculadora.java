import jdk.javadoc.doclet.DocletEnvironment;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] arg){
        int calculos;
        double num1,num2,resultado;
        System.out.println("Introduce numero para hacer calculos.si quieres suma, pulsa 1; resta, pulsa 2; multiplicacion, 3; division, 4 , 5 para modulo, 6 para exponente");
        Scanner sc=new Scanner(System.in);
        calculos=sc.nextInt();
        switch (calculos){
            case 1 :
                System.out.println("Has elegido suma");
                System.out.println("Introduce un numero");
                num1= sc.nextDouble();
                System.out.println("Introduce otro numero");
                num2= sc.nextDouble();
                resultado=num1+num2;
                System.out.println("El resultado es "+resultado);
                break;
            case 2 :
                System.out.println("Has elegido resta");
                System.out.println("Introduce un numero");
                num1= sc.nextDouble();
                System.out.println("Introduce otro numero");
                num2= sc.nextDouble();
                resultado=num1-num2;
                System.out.println("El resultado es "+resultado);
                break;
            case 3 :
                System.out.println("Has elegido multiplacion");
                System.out.println("Introduce un numero");
                num1= sc.nextDouble();
                System.out.println("Introduce otro numero");
                num2= sc.nextDouble();
                resultado=num1*num2;
                System.out.println("El resultado es "+resultado);
                break;
            case 4 :
                System.out.println("Has elegido division");
                System.out.println("Introduce un numero");
                num1= sc.nextDouble();
                System.out.println("Introduce otro numero");
                num2= sc.nextDouble();
                resultado=num1/num2;
                System.out.println("El resultado es "+resultado);
                break;
            case 5:
                System.out.println("Modulo");
                System.out.println("Introduce un numero");
                num1= sc.nextDouble();
                System.out.println("Introduce otro numero");
                num2= sc.nextDouble();
                resultado=num1%num2;
                System.out.println("Resultado es "+resultado);
                break;
            case 6:
                System.out.println("Exponen6te");
                System.out.println("Introduce un numero");
                num1= sc.nextDouble();
                System.out.println("Introduce otro numero");
                num2= sc.nextDouble();
                resultado=(int)Math.pow(num1,num2);
                System.out.println("Resultado es "+resultado);
                break;
            default:
                System.out.println("Solo introduce un numero de 1 a 6 porfavor");
        }
    }
}
