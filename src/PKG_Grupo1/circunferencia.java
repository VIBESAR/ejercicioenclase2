package PKG_Grupo1;
import java.util.Scanner;

public class circunferencia {

    public static void calcularCircunferencia() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia es: " + circunferencia);
    }

}

