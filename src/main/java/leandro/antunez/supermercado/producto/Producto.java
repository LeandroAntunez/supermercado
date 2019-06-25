package leandro.antunez.supermercado.producto;

public class Producto {

    private String nombre;
    private int precio;

    public Producto(String nombreProducto, int precioProducto) {
        this.setPrecio(precioProducto);
        this.setNombre(nombreProducto);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    private void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString(){
        return "Nombre: " + this.getNombre() +
                " /// Precio: $" + this.getPrecio();
    }
}
