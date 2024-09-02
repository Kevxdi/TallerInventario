package Base;

public class Producto {

    // Atributos claros y descriptivos
    private String productoId;
    private String productoNombre;
    private double productoPrecio;
    private int cantidadEnInventario;

    // Constructor
    public Producto(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario) {
        this.productoId = productoId;
        this.productoNombre = productoNombre;
        this.productoPrecio = productoPrecio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    // Getters y Setters
    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public double getProductoPrecio() {
        return productoPrecio;
    }

    public void setProductoPrecio(double productoPrecio) {
        this.productoPrecio = productoPrecio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("ID " + productoId + ": " + productoNombre + " cuesta un total de " + productoPrecio + ". Quedan disponibles: " + cantidadEnInventario);
    }
}
