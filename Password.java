import java.util.Scanner;

public class Password {
    public static void main(String[] arg) {
        Scanner sc=new Scanner(System.in);
        String contraseña="abc123";
        final int INTENTOS=3;
        boolean acierto=false;
        String password;
        for (int i=0;i<INTENTOS && !acierto; i++){
            System.out.println("Introduce la contraseña");
            password=sc.next();
            if (password.equals(contraseña)){
                System.out.println("Enhorabuena");
                acierto=true;
            }else{
                System.out.println("Sigue intentando");
            }
        }
    }
}
