package Logica;

import Base.Producto;

public class Perecedero extends Producto {

  
    private int diasHastaCaducidad;
    private double temperaturaAlmacenamiento;

    public Perecedero(String productoId, String productoNombre, double productoPrecio, int cantidadEnInventario, int diasHastaCaducidad, double temperaturaAlmacenamiento) {
        super(productoId, productoNombre, productoPrecio, cantidadEnInventario);
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
        return "Perecedero{" + "diasHastaCaducidad=" + diasHastaCaducidad + ", temperaturaAlmacenamiento=" + temperaturaAlmacenamiento + '}';
    }

    
}
