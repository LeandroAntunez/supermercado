package leandro.antunez.supermercado.producto.bebida;

import leandro.antunez.supermercado.producto.Producto;

public class Bebida extends Producto {

    private double litros;

    public Bebida(String nombreBebida, int precioBebida, double litrosBebida) {
        super(nombreBebida, precioBebida);
        this.setLitros(litrosBebida);
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
