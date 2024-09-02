package Principal;

import GestionDeLogica.GestorInventario;
import java.util.Scanner;

public class MetodoMain {
    GestorInventario gi = new GestorInventario();

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu: \n"
                    + "1. Agregar Producto \n"
                    + "2. Mostrar Productos \n"
                    + "3. Buscar Producto por ID \n"
                    + "4. Modificar Producto \n"
                    + "5. Eliminar por ID \n"
                    + "6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los detalles del producto:");

                    // Solicitando los datos al usuario
                    System.out.print("ID del Producto: ");
                    String productoId = scanner.next();

                    System.out.print("Nombre del Producto: ");
                    String productoNombre = scanner.next();

                    System.out.print("Precio del Producto: ");
                    double productoPrecio = scanner.nextDouble();

                    System.out.print("Cantidad en Inventario: ");
                    int cantidadEnInventario = scanner.nextInt();

                    // Llamando al método para agregar el producto
                    gi.agregarProducto(productoId, productoNombre, productoPrecio, cantidadEnInventario);
                    System.out.println("Producto agregado exitosamente.");
                    break;

                case 2:
                    gi.mostrarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese el ID del Producto a buscar: ");
                    String idBusqueda = scanner.next();
                    gi.buscarProductoPorID(idBusqueda);
                    break;

                case 4:
                    System.out.print("Ingrese el ID del Producto a modificar: ");
                    String idModificar = scanner.next();
                    gi.modificarProducto(idModificar);
                    break;

                case 5:
                    System.out.print("Ingrese el ID del Producto a eliminar: ");
                    String idEliminar = scanner.next();
                    gi.eliminarProducto(idEliminar);
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    return;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (true);
    }

    public static void main(String[] args) {
        MetodoMain metodoMain = new MetodoMain();
        metodoMain.menu();
    }
}
