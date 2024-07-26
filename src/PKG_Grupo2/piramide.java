package PKG_Grupo2;
import java.util.Scanner;
public class piramide {

    public static void Piramide(){

        Scanner entrada = new Scanner(System.in);


        System.out.print("Ingrese la longitud de la base de la pirámide: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura de la pirámide: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área de la pirámide cuadrada es: " + area + " metros cuadrados");
    }
}

