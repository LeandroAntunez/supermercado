package leandro.antunez.supermercado.producto.alimento;

import leandro.antunez.supermercado.producto.Producto;

public class Alimento extends Producto {

    private String unidadDeVenta;

    public Alimento(String nombreAlimento, int precioAlimento, String unidadDeVenta) {
        super(nombreAlimento, precioAlimento);
        this.setUnidadDeVenta(unidadDeVenta);
    }

    private void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public String toString(){
        return "Nombre: " + this.getNombre() +
                " /// Precio: $" + this.getPrecio() +
                " /// Unidad de venta: " + this.getUnidadDeVenta();
    }
}
