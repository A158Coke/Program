import java.util.Scanner;
//formulas:
//area de triangulo es (base*altura)/2
//de quadrat es base por altura
//de pentagono es (5*L*ap)/2

public class AreaDeTrianguloQuadratPentagono {

    public static void main(String[] arg){
        int opcion;
        Scanner sc=new Scanner(System.in);

        double Triangulo, Quadrat, Petagono, apotema, altura, base,area;
        System.out.println("Pulsa numero 1 para calcular area de triangulo, 2 para quadrat y 3 para pentagono");
        opcion=sc.nextInt();
        if (opcion==1) {
            System.out.println("Introduce el base");
            base = sc.nextDouble();
            System.out.println(" Introduce altura");
            altura = sc.nextDouble();
            area = (base * altura) / 2;
            System.out.println("El area de tu triangulo es: " + area);
        }
        else if(opcion==2) {
            System.out.println("Introduce el base ");
            base = sc.nextDouble();
            System.out.println("Introduce altura");
            altura = sc.nextDouble();
            area = base * altura;
            System.out.println("Area de tu quadrato es " + area + "");
        }
         else if(opcion==3){
            System.out.println("Introduce el base ");
            base = sc.nextDouble();
            System.out.println("Introduce apotema");
            apotema=sc.nextDouble();
            area = (base*5*apotema)/2;
            System.out.println("Area de tu pentagono3 es " + area + "");
        }
                                         }

                                               }

