# TallerInventario
Principalmente hicimos una clase padre la cual llamamos Producto. En esta declaramos todas nuestras variables que usaremos en un futuro en el proyecto. 
productoId, productoNombre, productoPrecio, cantidadEnInventario: Contendra lo que el usuario digite y se almacenara en las variables.
articuloPerecedero, artNoPerecedero: Contendran las variables de las clases derivadas para poder imprimir lo que el usuario necesita en un mismo metodo.

# Metodos 
En el metodo Main usamos todas nuestras clases, las cuales son:
Agregar Producto: Este método crea un nuevo producto usando los parámetros proporcionados y lo agrega a listaProductos.
Mostrar Productos: Recorre listaProductos y muestra la información de cada producto llamando al método mostrarInformacion() de la clase Producto.
Buscar Producto por ID: Busca un producto en la lista por su ID. Si lo encuentra, muestra su información y lo retorna; si no, muestra un mensaje de error y retorna null.
Modificar Producto: Permite modificar los atributos de un producto existente. Si el producto no se encuentra, muestra un mensaje de error.

# ¿Cómo se funciona?
Al ejecutar el metodo Main se abrira la terminal en la cual se le mostrara un menu en el cual tiene 6 opciones a escoger. Al ejecutar este programa podra agregar todo lo anteriormente mencionado como la ID de los productos, cuanto cuesta, cuantos hay en el inventario entre otros. Para salir del programa tendra que escribir 6 para que pueda salir del programa.
