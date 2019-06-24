package leandro.antunez.supermercado.producto.cosmetico;

import leandro.antunez.supermercado.producto.Producto;

public class Cosmetico extends Producto {

    private int contenido;

    public Cosmetico(String nombreProducto, int precioProducto, int contenidoProducto) {
        super(nombreProducto, precioProducto);
        this.setContenido(contenidoProducto);
    }

    public int getContenido() {
        return contenido;
    }

    private void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public String toString(){
        return "Nombre: " + this.getNombre() +
                " /// Contenido: " + this.getContenido() + "ml" +
                " /// Precio: $" + this.getPrecio();
    }
}
