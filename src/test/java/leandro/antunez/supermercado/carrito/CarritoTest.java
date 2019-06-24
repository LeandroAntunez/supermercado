package leandro.antunez.supermercado.carrito;

import leandro.antunez.supermercado.producto.Producto;
import leandro.antunez.supermercado.producto.alimento.Alimento;
import leandro.antunez.supermercado.producto.bebida.Bebida;
import leandro.antunez.supermercado.producto.cosmetico.Cosmetico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CarritoTest {

    private Carrito carrito;
    private Bebida bebida;
    private ArrayList<Producto> listaDeProductos;
    private Alimento alimento;
    private Cosmetico cosmetico;

    @Before
    public void setUp(){
        this.alimento = new Alimento("Galletitas Pepas", 40, "kilo");
        this.cosmetico = new Cosmetico("Jabon Liquido Dove", 20, 40);
        this.bebida = new Bebida("Agua Villavicencio", 45, 1.5);
        this.carrito = new Carrito();
        this.listaDeProductos = new ArrayList<>();
        this.listaDeProductos.add(bebida);
        this.listaDeProductos.add(alimento);
        this.listaDeProductos.add(cosmetico);
    }

    @Test
    public void test_5_A_seCreaUnCarritoYSeAgregaUnProducto(){
        carrito.agregarProducto(bebida);
        Assert.assertTrue(this.carrito.getProductos().contains(bebida));
    }

    @Test
    public void test_5_B_seCreaUnCarritoYSeAgreganVariosProductos(){
        carrito.agregarTodos(listaDeProductos);
        Assert.assertTrue(this.carrito.getProductos().contains(bebida));
        Assert.assertTrue(this.carrito.getProductos().contains(alimento));
        Assert.assertTrue(this.carrito.getProductos().contains(cosmetico));
    }
}
