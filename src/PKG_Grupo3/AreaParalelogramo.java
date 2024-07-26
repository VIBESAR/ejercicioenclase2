package PKG_Grupo3;
import java.util.Scanner;

public class AreaParalelogramo {
    public static void areaparalelo(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la base del paralelogramo: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura del paralelogramo: ");
        double altura = entrada.nextDouble();

        double area = base * altura;

        System.out.println("El área del paralelogramo es: " + area + " metros cuadrados");
    }
}

