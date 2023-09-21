package FabricaDeSillas;
import java.util.*;

public class Inventario {
    private HashMap<String, HashMap<String, Integer>> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public void agregarMaterial(String tipo, String tamano, int cantidad) {
        if (!inventario.containsKey(tipo)) {
            inventario.put(tipo, new HashMap<>());
        }

        inventario.get(tipo).put(tamano, cantidad);
    }
    //Esta funcion nos enlista la cantidad de materiales en nuestro Stock
    public void imprimirInventario() {
        for (String tipo : inventario.keySet()) {
            HashMap<String, Integer> tamanos = inventario.get(tipo);
            for (String tamano : tamanos.keySet()) {
                int cantidad = tamanos.get(tamano);
                System.out.println("Tipo: " + tipo + ", Tamaño: " + tamano + ", Cantidad: " + cantidad);
            }
        }
    }
    public boolean validarExistencia(String tipo, String tamano, int cantidadNecesaria) {
        if (inventario.containsKey(tipo) && inventario.get(tipo).containsKey(tamano)) {
            int cantidadActual = inventario.get(tipo).get(tamano);
            inventario.get(tipo).put(tamano, cantidadActual - cantidadNecesaria);
            return cantidadActual >= cantidadNecesaria;
        }else{
            return false;
        }

    }
}