package PKG_Grupo2;
import java.util.Scanner;
public class volumenpiramide {

    public static void VolPiramide(){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = entrada.nextDouble();
        double volumen = (base * altura) / 3;
        System.out.println("El volumen de la pirámide cuadrada es: " + volumen + " metros cúbicos");
    }
}

