package PKG_Grupo2;
import java.util.Scanner;
public class areadeuntriangulo {

    public static void areatriangulo(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base del triángulo: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area + " metros cuadrados");
    }
}
