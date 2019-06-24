package leandro.antunez.supermercado.producto.alimento;

import leandro.antunez.supermercado.producto.Producto;
import leandro.antunez.supermercado.producto.caracteristicas.UnidadDeVenta;

public class Alimento extends Producto {

    private UnidadDeVenta unidadDeVenta;

    public Alimento(String nombreAlimento, int precioAlimento, UnidadDeVenta unidadDeVenta) {
        super(nombreAlimento, precioAlimento);
        this.setUnidadDeVenta(unidadDeVenta);
    }

    private void setUnidadDeVenta(UnidadDeVenta unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public UnidadDeVenta getUnidadDeVenta() {
        return unidadDeVenta;
    }
}
