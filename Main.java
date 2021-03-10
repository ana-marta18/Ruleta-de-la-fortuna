import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ana = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        //menú de opciones
        while (!salir) {
        System.out.println("------------------------------------");
        System.out.println("Bienvenido a la Ruleta de la Fortuna");
        System.out.println("------------------------------------");
        System.out.println("Elige una de estas opciones: ");
        System.out.println("1. Girar la ruleta");
        System.out.println("2. Salir");

            opcion = ana.nextInt();

            switch (opcion) {
                //Función de girar la ruleta
                case 1 -> {
                    System.out.println("Los premios del día son: ");
                    System.out.println("- Salud ");
                    System.out.println("- Dinero ");
                    System.out.println("- Amor ");
                    System.out.println("- Felicidad ");
                    System.out.println("- Inteligencia");

                    String[] x = {"Salud", "Dinero", "Amor", "Felicidad", "Inteligencia"};
                    Random rand = new Random();

                    int n = rand.nextInt(5);
                    String z = x [n];

                    System.out.println("Su premio es: " + z);
                }
                //Función de salida
                case 2 -> salir = true;
                default -> System.out.println("Solo hay dos opciones, selecciona una de ellas.");
            }
        }
        //Mensaje de salida
        System.out.println("Este es el fin del programa, hasta pronto");
    }
}
