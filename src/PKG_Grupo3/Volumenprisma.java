package PKG_Grupo3;
import java.util.Scanner;

public class Volumenprisma {

    public static void Volupris(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base del prisma: ");
        double longitud = entrada.nextDouble();

        System.out.print("Ingrese el ancho de la base del prisma: ");
        double ancho = entrada.nextDouble();

        System.out.print("Ingrese la altura del prisma: ");
        double altura = entrada.nextDouble();

        double areaBase = longitud * ancho;

        double volumen = areaBase * altura;

        System.out.println("El volumen del prisma rectangular es: " + volumen + " metros cúbicos");
    }
}
