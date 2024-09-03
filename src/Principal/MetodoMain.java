package Principal;

import Logica.Perecedero;
import GestionDeLogica.GestorInventario;
import Logica.NoPerecedero;
import java.util.Scanner;

public class MetodoMain {
    GestorInventario gi = new GestorInventario();
    Perecedero np = new Perecedero();
    
    
    public void menu() {
        Scanner in = new Scanner(System.in);
        int opcion;
        try {
            do {
            System.out.println("Menu: \n"
                    + "1. Agregar Producto \n"
                    + "2. Mostrar Productos \n"
                    + "3. Buscar Producto por ID \n"
                    + "4. Modificar Producto \n"
                    + "5. Eliminar por ID \n"
                    + "6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    Perecedero artPerecedero = new Perecedero();
                    NoPerecedero artNoPerecedero = new NoPerecedero();
                    
                    System.out.println("Ingrese los detalles del producto:");

                    // Solicitando los datos al usuario
                    System.out.print("ID del Producto: ");
                    String productoId = in.next();

                    System.out.print("Nombre del Producto: ");
                    String productoNombre = in.next();

                    System.out.print("Precio del Producto: ");
                    double productoPrecio = in.nextDouble();

                    System.out.print("Cantidad en Inventario: ");
                    int cantidadEnInventario = in.nextInt();
                    
                    System.out.print("Dias de caducidad: ");
                    int diasHastaCaducidad = in.nextInt();
                    artPerecedero.setDiasHastaCaducidad(diasHastaCaducidad);
                     
                    System.out.print("Temperatura del producto: ");
                    double temperaturaAlmacenamiento = in.nextDouble();
                    artPerecedero.setTemperaturaAlmacenamiento(temperaturaAlmacenamiento);
                    
                    System.out.println("Garantia del producto: ");
                    int mesesGarantia = in.nextInt();
                    artNoPerecedero.setMesesGarantia(mesesGarantia);
                    
                    // Llamando al método para agregar el producto
                    gi.agregarProducto(productoId, productoNombre, productoPrecio, cantidadEnInventario, artPerecedero, artNoPerecedero);
                    
                    
                    System.out.println("Producto agregado exitosamente.");
                    break;

                case 2:
                    gi.mostrarProductos();
                    break;

                case 3:
                    System.out.print("Ingrese el ID del Producto a buscar: ");
                    String idBusqueda = in.next();
                    gi.buscarProductoPorID(idBusqueda);
                    break;

                case 4:
                    System.out.print("Ingrese el ID del Producto a modificar: ");
                    String idModificar = in.next();
                    gi.modificarProducto(idModificar);
                    break;

                case 5:
                    System.out.print("Ingrese el ID del Producto a eliminar: ");
                    String idEliminar = in.next();
                    gi.eliminarProducto(idEliminar);
                    break;

                case 6:
                    System.out.println("Saliendo del programa.");
                    return;
                    

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 6);
        } catch (Exception e) {
        }
        
    }

    public static void main(String[] args) {
        MetodoMain metodoMain = new MetodoMain();
        metodoMain.menu();
    }
}
