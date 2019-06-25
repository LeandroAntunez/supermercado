package leandro.antunez.supermercado.producto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductoTest {

    private Producto producto;
    private String nombreProducto;
    private int precioProducto;

    @Before
    public void setUp(){
        this.nombreProducto = "Plato";
        this.precioProducto = 40;
        this.producto = new Producto(nombreProducto, precioProducto);
    }

    @Test
    public void test1ASeCreaUnProductoConNombre(){
        Assert.assertEquals(this.producto.getNombre(), nombreProducto);
    }

    @Test
    public void test1BSeCreaUnProductoConNombreYPrecio(){
        Assert.assertEquals(this.producto.getPrecio(), precioProducto);
    }

    @Test
    public void test1CSeCreaUnProductoYSeImprimeEnPantalla(){
        Assert.assertEquals("Nombre: Plato /// Precio: $40", this.producto.toString());
    }

}
