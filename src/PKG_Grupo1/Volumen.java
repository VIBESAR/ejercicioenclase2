package PKG_Grupo1;
import java.util.Scanner;

public class Volumen {

    public static void volumen(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la arista del cubo: ");
        double arista = entrada.nextDouble();

        double volumen = Math.pow(arista, 3);

        System.out.println("El volumen del cubo es: " + volumen + " metros cúbicos");
    }
}
