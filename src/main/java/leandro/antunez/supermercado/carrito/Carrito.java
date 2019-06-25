package leandro.antunez.supermercado.carrito;

import leandro.antunez.supermercado.producto.Producto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

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

    public void agregarTodos(ArrayList<Producto> listaDeProductos) {
        this.getProductos().addAll(listaDeProductos);
    }

    public String imprimirTodosLosProductos() {
        return this.getProductos().stream().map(Producto::toString).collect(Collectors.joining("\n\n"));
    }

    public Producto productoMasCaro() {
        return this.getProductos()
                .stream()
                .max(Comparator.comparing(Producto::getPrecio))
                .orElseThrow(NoSuchElementException::new);
    }

    public Producto productoMasBarato() {
        return this.getProductos()
                .stream()
                .min(Comparator.comparing(Producto::getPrecio))
                .orElseThrow(NoSuchElementException::new);
    }

    public String imprimirNombreDeProductoMasCaro() {
        return "Producto más caro: " + this.productoMasCaro().getNombre();
    }

    public String imprimirNombreDeProductoMasBarato() {
        return "Producto más barato: " + this.productoMasBarato().getNombre();
    }

    public String toString(){
        return this.imprimirTodosLosProductos() +
                "\n\n=============================\n\n" +
                this.imprimirNombreDeProductoMasCaro() + "\n\n" +
                this.imprimirNombreDeProductoMasBarato();
    }
}
