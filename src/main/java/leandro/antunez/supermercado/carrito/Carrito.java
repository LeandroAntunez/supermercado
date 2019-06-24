package leandro.antunez.supermercado.carrito;

import leandro.antunez.supermercado.producto.Producto;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;

    public Carrito(){
        this.setProductos(new ArrayList<>());
    }

    private void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) {
        this.getProductos().add(producto);
    }
}
