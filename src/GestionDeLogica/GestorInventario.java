package GestionDeLogica;

import Base.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorInventario {

    private ArrayList<Producto> listaProductos;
    private Producto[] inventarioTemporal;
    private int indiceInventarioTemporal;
    Scanner in = new Scanner(System.in);

    public GestorInventario() {
        listaProductos = new ArrayList<>();
    }

    public GestorInventario(int tamanoInventarioTemporal) {
        listaProductos = new ArrayList<>();
        inventarioTemporal = new Producto[tamanoInventarioTemporal];
        indiceInventarioTemporal = 0;
    }

    // Método para agregar un producto a la lista
    public void agregarProducto(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario) {
        Producto agregar = new Producto(productoId, productoNombre, productoPrecio, cantidadEnInventario);
        listaProductos.add(agregar);  // Aquí es donde ocurría el error
    }

    // Método para mostrar todos los productos en la lista
    public void mostrarProductos() {
        for (Producto producto : listaProductos) {
            producto.mostrarInformacion();
           
           
        }
    }

    // Método para buscar un producto por su ID
    public Producto buscarProductoPorID(String productoId) {
        for (Producto producto : listaProductos) {
            if (producto.getProductoId().equals(productoId)) {
                System.out.println("Producto por ID encontrado: " + productoId);
                producto.mostrarInformacion();  // Muestra la información completa del producto
                return producto;
            }

        }
        System.out.println("Producto no encontrado, intente de nuevo");
        return null; // Devuelve null si no se encuentra
    }

    // Método para modificar un producto existente
    public void modificarProducto(String productoId) {
        Scanner in = new Scanner(System.in);
        Producto producto = buscarProductoPorID(productoId);

        if (producto != null) {
            System.out.println("Producto encontrado. Ingrese los datos nuevos datos. \nNuevo nombre: ");
            String nuevoNombre = in.nextLine();
            producto.setProductoNombre(nuevoNombre);

            System.out.println("Nuevo precio: ");
            double nuevoPrecio = in.nextDouble();
            producto.setProductoPrecio(nuevoPrecio);

            System.out.println("Nueva cantidad");
            int nuevaCantidad = in.nextInt();
            producto.setCantidadEnInventario(nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado, intente de nuevo");
        }
    }

    public void eliminarProducto(String productoId) {
        for (Producto delate : listaProductos) {
            System.out.println("Ingrese ID del producto a eliminar");
            if (productoId.equalsIgnoreCase(productoId)) {
                listaProductos.remove(delate);
                System.out.println("El producto fue eliminado exitosamente");
                break;
            } else {
                System.out.println("EL ID del producto no fue encontrado");
                break;
            }
        }
    }

}
