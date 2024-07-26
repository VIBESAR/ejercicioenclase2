import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("MENÚ");
            System.out.println("1. Área de un Círculo");
            System.out.println("2. Circunferencia");
            System.out.println("3. Volumen");
            System.out.println("4. Área de un Triángulo");
            System.out.println("5. Pirámide");
            System.out.println("6. Volumen de Pirámide");
            System.out.println("7. Área de Paralelogramo");
            System.out.println("8. Volumen de Cilindro");
            System.out.println("9. Volumen de Prisma");
            System.out.println("10. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    PKG_Grupo1.areadeuncirculo.areacirculo();
                    break;
                case 2:
                    PKG_Grupo1.circunferencia.calcularCircunferencia();
                    break;
                case 3:
                    PKG_Grupo1.Volumen.volumen();
                    break;
                case 4:
                    PKG_Grupo2.areadeuntriangulo.areatriangulo();
                    break;
                case 5:
                    PKG_Grupo2.piramide.Piramide();
                    break;
                case 6:
                    PKG_Grupo2.volumenpiramide.VolPiramide();
                    break;
                case 7:
                    PKG_Grupo3.AreaParalelogramo.areaparalelo();
                    break;
                case 8:
                    PKG_Grupo3.VolumenCilindro.Volucili();
                    break;
                case 9:
                    PKG_Grupo3.Volumenprisma.Volupris();
                    break;
                case 10:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 10);

        scanner.close();
    }

    // Métodos vacíos para evitar errores
    public static void areaCirculo() {}
    public static void circunferencia() {}
    public static void volumen() {}
    public static void areaTriangulo() {}
    public static void piramide() {}
    public static void volumenPiramide() {}
    public static void areaParalelogramo() {}
    public static void volumenCilindro() {}
    public static void volumenPrisma() {}
}

