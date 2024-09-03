package GestionDeLogica;

import Base.Producto;
import Logica.NoPerecedero;
import java.util.ArrayList;
import java.util.Scanner;
import Logica.Perecedero;

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
    public void agregarProducto(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario, Perecedero perecedero, NoPerecedero artNoPerecedero) {
        Producto agregar = new Producto(productoId, productoNombre, productoPrecio, cantidadEnInventario, perecedero, artNoPerecedero);
        listaProductos.add(agregar);
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
        Perecedero artPerecedero = new Perecedero();
                    NoPerecedero artNoPerecedero = new NoPerecedero();

        if (producto != null) {
            System.out.print("Producto encontrado. Ingrese los datos nuevos. \nNuevo nombre: ");
            String nuevoNombre = in.nextLine();
            producto.setProductoNombre(nuevoNombre);

            System.out.print("Nuevo precio: ");
            double nuevoPrecio = in.nextDouble();
            producto.setProductoPrecio(nuevoPrecio);

            System.out.print("Nueva cantidad en el inventario");
            int nuevaCantidad = in.nextInt();
            producto.setCantidadEnInventario(nuevaCantidad);
            
            System.out.print("Nueva fecha de dias de caducidad");
            int nuevaCaducidad = in.nextInt();
            artPerecedero.setDiasHastaCaducidad(nuevaCaducidad);
            
            System.out.print("Nueva temperatura del producto");
            double nuevaTemperatura = in.nextDouble();
            artPerecedero.setTemperaturaAlmacenamiento(nuevaTemperatura);
            
            System.out.println("Nueva garantia");
            int nuevaGarantia = in.nextInt();
            artNoPerecedero.setMesesGarantia(nuevaGarantia);
            
        } else {
            System.out.println("Producto no encontrado, intente de nuevo");
        }
    }

      public void eliminarProducto(String productoId) {
        Producto productoAEliminar = buscarProductoPorID(productoId);

        if (productoAEliminar != null) {
            listaProductos.remove(productoAEliminar);
            System.out.println("El producto fue eliminado exitosamente");
        } else {
            System.out.println("El ID del producto no fue encontrado");
        }
    }
}
