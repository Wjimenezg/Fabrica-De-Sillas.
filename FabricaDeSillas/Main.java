
package FabricaDeSillas;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inv=new Inventario();
        Proceso proceso = new Proceso();
        proceso.insertar();//con esta variable insertamos en el inventario todos nuestros materiales en Stock

        while (true) {
            System.out.println("-------------------------");
            System.out.println("|   Elija una opcion    |");
            System.out.println("|  1. Fabricar silla    |");
            System.out.println("|  2. Salir             |");
            System.out.println("-------------------------");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (opcion == 1) {
                System.out.println("------------------------------------");
                System.out.println("|      Ingrese el tipo de Silla    |");
                System.out.println("|  1. Silla Gamer                  |");
                System.out.println("|  2. Silla de Comedor             |");
                System.out.println("|  3. Silla de Patio               |");
                System.out.println("|  4. Silla de Oficina             |");
                System.out.println("|  5. Silla Sencilla               |");
                System.out.println("------------------------------------");
                opcion = scanner.nextInt();
                switch (opcion){
                    case 1:
                        proceso.Gamer();
                        break;
                    case 2:
                        proceso.Comedor();
                        break;
                    case 3:
                        proceso.Patio();
                        break;
                    case 4:
                        proceso.Oficina();
                        break;
                    case 5:
                        proceso.Sencilla();
                        break;
                    /*case 6:
                        inv.imprimirInventario();
                        break;*/
                    default:
                        System.out.println("Opcion no valida. Por favor, elija nuevamente.");
                        break;
                }
            } else if (opcion == 2) {
                break;
            } else {
                System.out.println("Opcion no valida. Por favor, elija nuevamente.");
            }
        }
        scanner.close();
    }
}