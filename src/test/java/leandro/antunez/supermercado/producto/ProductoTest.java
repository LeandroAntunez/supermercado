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
    public void test_1_A_seCreaUnProductoConNombre(){
        Assert.assertEquals(this.producto.getNombre(), nombreProducto);
    }

    @Test
    public void test_1_B_seCreaUnProductoConNombreYPrecio(){
        Assert.assertEquals(this.producto.getPrecio(), precioProducto);
    }

}
