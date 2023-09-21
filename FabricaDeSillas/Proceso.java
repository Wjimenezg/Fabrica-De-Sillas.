package FabricaDeSillas;
import java.util.*;
public class Proceso {
    static Scanner scanner = new Scanner(System.in);
    public static String tamano;
    public static String color;
    public static int opcion;
    public static double costotamano;
    public static double costosillon;
    public static double costomaterial;
    public static double costomano;
    public static double costototal;
    public static String TipoSilla;
    public static Inventario inventario = new Inventario();
    public static Producto producto = new Producto();

    //esta funcion inserta en nuestro inventario el material por tipo, tamaño y Cantidad de unidades
    public void insertar(){
        inventario.agregarMaterial("Madera", "Grande", 100);
        inventario.agregarMaterial("Madera", "Mediano", 100);
        inventario.agregarMaterial("Madera", "Pequeño", 100);
        inventario.agregarMaterial("Plástico", "Grande", 100);
        inventario.agregarMaterial("Plástico", "Mediano", 100);
        inventario.agregarMaterial("Plástico", "Pequeño", 100);
    }

    public void espera(){
        System.out.println("Los materiales estan saliendo de bodega");
        System.out.println("          un momento por favor         ");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
            try {
                Thread.sleep(300); // Esperar 3 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\ntu silla "+ TipoSilla + " esta siendo acoplada por nuestros expertos");
        System.out.println("                     un momento por favor                ");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
            try {
                Thread.sleep(300); // Esperar 3 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nYa casi esta lista!, Se esta detallando");
        System.out.println("          un momento por favor         ");
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
            try {
                Thread.sleep(300); // Esperar 3 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("\nTu silla "+ TipoSilla +" esta lista para recoger");
        System.out.println("              FELICIDADES             ");
        scanner.nextLine();
    }

    public void Gamer(){
        TipoSilla = "GAMER";
        if(material()){
            costomaterial = 75.00+ costotamano;
            costomano = 100.00;
            costototal = producto.calcularCosto(costomaterial,costosillon,costomano);
            while (true){
            System.out.println("--------------------------------------");
            System.out.println("| Estos son los detalles de su orden |");
            System.out.println("| Una silla de tipo: "+ TipoSilla +" |");
            System.out.println("| En color: "+color+"                |");
            System.out.println("| Costo total de: "+ costototal+"    |");
            System.out.println("|          ¿Desea continuar?         |");
            System.out.println("|    1. SI                           |");
            System.out.println("|    2. NO                           |");
            System.out.println("--------------------------------------");
            opcion = scanner.nextInt();
            if(opcion == 1){
                espera();
                break;
            } else if (opcion == 2) {
                break;
            } else {
                System.out.println("Opcion no valida. Por favor, elija nuevamente.");
                }
            }
        }
    }

    public void Comedor(){
        TipoSilla = "COMEDOR";
        if(material()){
            costomaterial = 125.00 + costotamano;
            costomano = 150.00;
            costototal = producto.calcularCosto(costomaterial,costosillon,costomano);
            while (true){
                System.out.println("--------------------------------------");
                System.out.println("| Estos son los detalles de su orden |");
                System.out.println("| Una silla de tipo: "+ TipoSilla +" |");
                System.out.println("| En color: "+color+"                |");
                System.out.println("| Costo total de: "+ costototal+"    |");
                System.out.println("|          ¿Desea continuar?         |");
                System.out.println("|    1. SI                           |");
                System.out.println("|    2. NO                           |");
                System.out.println("--------------------------------------");
                opcion = scanner.nextInt();
                if(opcion == 1){
                    espera();
                    break;
                } else if (opcion == 2) {
                    break;
                } else {
                    System.out.println("Opcion no valida. Por favor, elija nuevamente.");
                }
            }
        }
    }
    public void Patio(){
        TipoSilla = "DE PATIO";
        if(material()){
            costomaterial = 55.00+ costotamano;
            costomano = 90.00;
            costototal = producto.calcularCosto(costomaterial,costosillon,costomano);
            while (true){
                System.out.println("--------------------------------------");
                System.out.println("| Estos son los detalles de su orden |");
                System.out.println("| Una silla de tipo: "+ TipoSilla +" |");
                System.out.println("| En color: "+color+"                |");
                System.out.println("| Costo total de: "+ costototal+"    |");
                System.out.println("|          ¿Desea continuar?         |");
                System.out.println("|    1. SI                           |");
                System.out.println("|    2. NO                           |");
                System.out.println("--------------------------------------");
                opcion = scanner.nextInt();
                if(opcion == 1){
                    espera();
                    break;
                } else if (opcion == 2) {
                    break;
                } else {
                    System.out.println("Opcion no valida. Por favor, elija nuevamente.");
                }
            }
        }
    }
    public void Oficina(){
        TipoSilla = "DE OFICINA";
        if(material()){
            costomaterial = 60.00+ costotamano;
            costomano = 150.00;
            costototal = producto.calcularCosto(costomaterial,costosillon,costomano);
            while (true){
                System.out.println("--------------------------------------");
                System.out.println("| Estos son los detalles de su orden |");
                System.out.println("| Una silla de tipo: "+ TipoSilla +" |");
                System.out.println("| En color: "+color+"                |");
                System.out.println("| Costo total de: "+ costototal+"    |");
                System.out.println("|          ¿Desea continuar?         |");
                System.out.println("|    1. SI                           |");
                System.out.println("|    2. NO                           |");
                System.out.println("--------------------------------------");
                opcion = scanner.nextInt();
                if(opcion == 1){
                    espera();
                    break;
                } else if (opcion == 2) {
                    break;
                } else {
                    System.out.println("Opcion no valida. Por favor, elija nuevamente.");
                }
            }
        }
    }
    public void Sencilla(){
        TipoSilla = "SENCILLA";
        if(material()){
            costomaterial = 45.00+ costotamano;
            costomano = 50.00;
            costototal = producto.calcularCosto(costomaterial,costosillon,costomano);
            while (true){
                System.out.println("--------------------------------------");
                System.out.println("| Estos son los detalles de su orden |");
                System.out.println("| Una silla de tipo: "+ TipoSilla +" |");
                System.out.println("| En color: "+color+"                |");
                System.out.println("| Costo total de: "+ costototal+"    |");
                System.out.println("|          ¿Desea continuar?         |");
                System.out.println("|    1. SI                           |");
                System.out.println("|    2. NO                           |");
                System.out.println("--------------------------------------");
                opcion = scanner.nextInt();
                if(opcion == 1){
                    espera();
                    break;
                } else if (opcion == 2) {
                    break;
                } else {
                    System.out.println("Opcion no válida. Por favor, elija nuevamente.");
                }
            }
        }
    }
    public static boolean material(){
        boolean retorno = false;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("| Por favor elija tipo  |");
            System.out.println("|  material a utilizar  |");
            System.out.println("|  1. Madera            |");
            System.out.println("|  2. Plastico          |");
            System.out.println("-------------------------");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("| ¿Cuantas unidades desea ordenar? |");
                    System.out.println("------------------------------------");
                    opcion = scanner.nextInt();
                    if(inventario.validarExistencia("Madera", tamano(), opcion)){//si me retorna false no ingresa a la funcion
                        color();
                        retorno = true;
                    }else{
                        System.out.println("Ya no se cuenta con unidades disponibles para este material.");
                    }
                    break;
                case 2:
                    System.out.println("------------------------------------");
                    System.out.println("| ¿Cuantas unidades desea ordenar? |");
                    System.out.println("------------------------------------");
                    opcion = scanner.nextInt();
                    if(inventario.validarExistencia("Plástico", tamano(), opcion)){//si me retorna false no ingresa a la funcion
                        color();
                        retorno = true;
                    }else{
                        System.out.println("Ya no se cuenta con unidades disponibles para este material.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija nuevamente.");
            }
            if (opcion != 1 || opcion != 2) {
                break; // Salir del bucle si se ha seleccionado un material
            }
        }
        return retorno;
    }


    public static String tamano(){
        while (true) {
            System.out.println("-------------------------");
            System.out.println("|     Por favor elija   |");
            System.out.println("|       el tamaño       |");
            System.out.println("|  1. Pequeño           |");
            System.out.println("|  2. Mediano           |");
            System.out.println("|  3. Grande            |");
            System.out.println("-------------------------");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    tamano = "Pequeño";
                    costotamano = 25.00;
                    break;
                case 2:
                    tamano = "Mediano";
                    costotamano = 30.00;
                    break;
                case 3:
                    tamano = "Grande";
                    costotamano = 50.00;
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija nuevamente.");
                    break;
            }
            if (!tamano.equals("")) {
                break; // Salir del bucle si se ha seleccionado un tamaño
            }
        }
        return tamano;
    }

    //funcion para seleccionar el color
    public static String color(){
        while (true) {
            System.out.println("-------------------------");
            System.out.println("|    Por favor elija    |");
            System.out.println("|        el color       |");
            System.out.println("|  1. Negro             |");
            System.out.println("|  2. Azul              |");
            System.out.println("|  3. Violeta           |");
            System.out.println("-------------------------");
            int opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    color = "Negro";
                    costosillon = 35.00;
                    break;
                case 2:
                    color = "Azul";
                    costosillon = 35.00;
                    break;
                case 3:
                    color = "Violeta";
                    costosillon = 40.00;
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, elija nuevamente.");
                    break;
            }
            if (!tamano.equals("")) {
                break; // Salir del bucle si se ha seleccionado un tamaño
            }
        }
        return color;
    }
    
}
