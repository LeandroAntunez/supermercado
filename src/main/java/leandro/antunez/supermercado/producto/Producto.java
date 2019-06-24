package leandro.antunez.supermercado.producto;

public class Producto {

    private String nombre;

    public Producto(String nombreProducto) {
        this.setNombre(nombreProducto);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
