package PKG_Grupo3;
import java.util.Scanner;

public class VolumenCilindro {

    public static void Volucili(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el radio de la base del cilindro: ");
        double radio = entrada.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = entrada.nextDouble();


        double areaBase = Math.PI * radio * radio;

        double volumen = areaBase * altura;

        System.out.println("El volumen del cilindro es: " + volumen + " metros cúbicos");
    }
}

