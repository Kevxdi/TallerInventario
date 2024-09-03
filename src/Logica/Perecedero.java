package Logica;

import Base.Producto;

public class Perecedero extends Producto {

    private int diasHastaCaducidad;
    private double temperaturaAlmacenamiento;

    public Perecedero() {}

    public Perecedero(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario, int mesesGarantia, Perecedero perecedero, NoPerecedero artNoPerecedero) {
        super(productoId, productoNombre, productoPrecio, cantidadEnInventario, perecedero, artNoPerecedero);
        this.diasHastaCaducidad = diasHastaCaducidad;
        this.temperaturaAlmacenamiento = temperaturaAlmacenamiento;
    }

    public int getDiasHastaCaducidad() {
        return diasHastaCaducidad;
    }

    public void setDiasHastaCaducidad(int diasHastaCaducidad) {
        this.diasHastaCaducidad = diasHastaCaducidad;
    }

    public double getTemperaturaAlmacenamiento() {
        return temperaturaAlmacenamiento;
    }

    public void setTemperaturaAlmacenamiento(double temperaturaAlmacenamiento) {
        this.temperaturaAlmacenamiento = temperaturaAlmacenamiento;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDías de caducidad del producto: " + diasHastaCaducidad + "\nTemperatura de almacenamiento: " + temperaturaAlmacenamiento;
    }
}
