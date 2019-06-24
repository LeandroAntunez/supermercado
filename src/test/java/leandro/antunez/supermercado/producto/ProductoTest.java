package leandro.antunez.supermercado.producto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductoTest {

    private Producto producto;
    private String nombreProducto;

    @Before
    public void setUp(){
        this.nombreProducto = "Plato";
        this.producto = new Producto(nombreProducto);
    }

    @Test
    public void seCreaUnProductoConNombreTest(){
        Assert.assertEquals(this.producto.getNombre(), nombreProducto);
    }

}
