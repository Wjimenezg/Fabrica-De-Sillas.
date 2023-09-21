package FabricaDeSillas;

public class Producto {
    private int idProducto;
    private String tipoProducto;
    private double precio;

    public Producto(int idProducto, String tipoProducto, double precio) {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
    }
    public Producto() {
        this.idProducto = idProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
    }
    public int getIdProducto() {
        return idProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularCosto(double costoMaterial, double costoSillon, double costoManoDeObra) {
        return precio + costoMaterial + costoSillon + costoManoDeObra;
    }
}
