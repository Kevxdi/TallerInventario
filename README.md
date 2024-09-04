# TallerInventario
Principalmente hicimos una clase padre la cual llamamos Producto. En esta declaramos todas nuestras variables que usaremos en un futuro en el proyecto. 
**productoId, productoNombre, productoPrecio, cantidadEnInventario:** Contendra lo que el usuario digite y se almacenara en las variables.
**articuloPerecedero, artNoPerecedero:** Contendran las variables de las clases derivadas para poder imprimir lo que el usuario necesita en un mismo metodo.

# Metodos 
En el metodo Main usamos todas nuestras clases, las cuales son:
**Agregar Producto:** Este método crea un nuevo producto usando los parámetros proporcionados y lo agrega a listaProductos.
**Mostrar Productos:** Recorre listaProductos y muestra la información de cada producto llamando al método mostrarInformacion() de la clase Producto.
**Buscar Producto por ID:** Busca un producto en la lista por su ID. Si lo encuentra, muestra su información y lo retorna; si no, muestra un mensaje de error y retorna null.
**Modificar Producto:** Permite modificar los atributos de un producto existente. Si el producto no se encuentra, muestra un mensaje de error.
**Eliminar Productos:** Permite eliminar producto por el ID ingresado.

# ¿Cómo se funciona?
Al ejecutar el metodo Main se abrira la terminal en la cual se le mostrara un menu en el cual tiene 6 opciones a escoger. Al ejecutar este programa podra agregar todo lo anteriormente mencionado como la ID de los productos, cuanto cuesta, cuantos hay en el inventario entre otros. Para salir del programa tendra que escribir 6 para que pueda salir del programa.

# ¿Cómo aplican los principios de POO?
# Gestión de Inventario de Productos

Este proyecto es una aplicación de consola para gestionar un inventario de productos, usando principios de Programación Orientada a Objetos (POO). Permite agregar, modificar, buscar, mostrar y eliminar productos, diferenciando entre perecederos y no perecederos.

## Estructura del Proyecto

El proyecto se organiza en varias clases:

- **`Producto`**: Clase base que define los atributos y métodos comunes para todos los productos.
- **`Perecedero`**: Extiende `Producto`, añadiendo características específicas como los días hasta caducidad y la temperatura de almacenamiento.
- **`NoPerecedero`**: Extiende `Producto`, añadiendo atributos específicos como la garantía en meses.
- **`GestorInventario`**: Gestiona el inventario, permitiendo agregar, modificar, eliminar y buscar productos.
- **`MetodoMain`**: Contiene el menú de usuario para interactuar con el sistema.

## Principios de Programación Orientada a Objetos Aplicados

### 1. Abstracción

**Qué es:** La abstracción consiste en simplificar un sistema al mostrar solo los detalles necesarios y ocultar la complejidad innecesaria.

**Aplicación en el Proyecto:**  
Las clases `Producto`, `Perecedero`, y `NoPerecedero` representan distintos tipos de productos. Cada clase expone solo los atributos y métodos necesarios para trabajar con productos sin entrar en detalles técnicos complejos.

### 2. Encapsulamiento
Los atributos de las clases (`productoId`, `productoNombre`, etc.) son privados y se acceden mediante métodos públicos (`getters` y `setters`). Esto asegura que los datos solo se modifiquen de formas controladas, evitando inconsistencias y errores.

### 3. Herencia
**Aplicación en el Proyecto:**  
La clase `Producto` es la clase padre para `Perecedero` y `NoPerecedero`. Esto permite que ambas clases hereden atributos y métodos de `Producto`. Perminiendonos usar sus atributos.

### 4. Polimorfismo

**Qué es:** El polimorfismo permite tratar objetos de diferentes clases derivadas de una misma clase base de forma uniforme.

**Aplicación en el Proyecto:**  
Aunque no se utiliza extensamente en el código actual, podrías usar objetos de tipo `Perecedero` y `NoPerecedero` como si fueran simplemente `Producto`. Esto facilita trabajar con colecciones de productos sin preocuparse por las diferencias específicas de cada tipo.


## Uso

Para ejecutar el programa, sigue estos pasos:

1. Compila todas las clases del proyecto.
2. Ejecuta la clase `MetodoMain` para iniciar el menú interactivo.
3. Usa las opciones del menú para gestionar el inventario de productos.

## Ejemplo de Uso

```plaintext
Menu:
1. Agregar Producto
2. Mostrar Productos
3. Buscar Producto por ID
4. Modificar Producto
5. Eliminar por ID
6. Salir

