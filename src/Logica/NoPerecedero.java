package Logica;

import Base.Producto;

public class NoPerecedero extends Producto {

    
    private int mesesGarantia;

    public NoPerecedero(){
    }
    
    public NoPerecedero(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario, int mesesGarantia, Perecedero perecedero, NoPerecedero artNoPerecedero) {
        super(productoId, productoNombre, productoPrecio, cantidadEnInventario, perecedero, artNoPerecedero);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

   
    
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("La garantía de este producto es de " + mesesGarantia + " meses.");
    }
}
