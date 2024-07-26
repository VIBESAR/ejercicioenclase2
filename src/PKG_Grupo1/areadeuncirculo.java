package PKG_Grupo1;
import java.util.Scanner;

public class areadeuncirculo {


    public static void areacirculo(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = entrada.nextDouble();

        double area = Math.PI * (radio * radio);

        System.out.println("El área del círculo es: " + area + " metros cuadrados");
    }
}

