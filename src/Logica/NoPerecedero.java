package Logica;

import Base.Producto;

public class NoPerecedero extends Producto {

   
    private int mesesGarantia;

    public NoPerecedero(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario, int mesesGarantia) {
        super(productoId, productoNombre, productoPrecio, cantidadEnInventario);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("La garantía de este producto es de " + mesesGarantia + " meses.");
    }
}
