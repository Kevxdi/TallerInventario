package Base;

import Logica.NoPerecedero;
import Logica.Perecedero;

public class Producto {

    // Atributos 
    private String productoId;
    private String productoNombre;
    private double productoPrecio;
    private int cantidadEnInventario;
    private Perecedero articuloPerecedero;
    private NoPerecedero artNoPerecedero;

    public Producto() {

    }

    public Producto(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario, Perecedero articuloPerecedero, NoPerecedero artNoPerecedero) {
        this.productoId = productoId;
        this.productoNombre = productoNombre;
        this.productoPrecio = productoPrecio;
        this.cantidadEnInventario = cantidadEnInventario;
        this.articuloPerecedero = articuloPerecedero;
        this.artNoPerecedero = artNoPerecedero;
    }

    
    
    public NoPerecedero getArtNoPerecedero() {
        return artNoPerecedero;
    }

    public void setArtNoPerecedero(NoPerecedero artNoPerecedero) {
        this.artNoPerecedero = artNoPerecedero;
    }

    public Perecedero getArticuloPerecedero() {
        return articuloPerecedero;
    }

    public void setArticuloPerecedero(Perecedero articuloPerecedero) {
        this.articuloPerecedero = articuloPerecedero;
    }

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

    @Override
    public String toString() {
        return "Producto{" + "productoId=" + productoId + ", productoNombre=" + productoNombre + ", productoPrecio=" + productoPrecio + ", cantidadEnInventario=" + cantidadEnInventario + ", articuloPerecedero=" + articuloPerecedero + '}';
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("ID " + productoId + ": " +
                productoNombre +
                "\ncuesta un total de " + productoPrecio +
                "\nCantidad en inventario: " + cantidadEnInventario + 
                "\nDias de caducidad: " + articuloPerecedero.getDiasHastaCaducidad() +
                "\nTemperatura del producto: " + articuloPerecedero.getTemperaturaAlmacenamiento() +
                "\nGarantia: " + artNoPerecedero.getMesesGarantia());
        System.out.println("----------------------------------------");
    }
}
