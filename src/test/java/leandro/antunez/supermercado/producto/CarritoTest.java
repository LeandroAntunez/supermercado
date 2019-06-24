package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.carrito.Carrito;
import leandro.antunez.supermercado.producto.bebida.Bebida;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarritoTest {

    private Carrito carrito;
    private Bebida bebida;

    @Before
    public void setUp(){
        this.bebida = new Bebida("Agua Villavicencio", 45, 1.5);
        this.carrito = new Carrito();
    }

    @Test
    public void test_5_A_seCreaUnCarritoYSeAgregaUnProducto(){
        this.carrito.agregarProducto(bebida);
        Assert.assertTrue(this.carrito.getProductos().contains(bebida));
    }
}
