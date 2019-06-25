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

    private Carrito carritoConUnProducto;
    private Carrito carritoConVariosProductos;
    private Bebida bebida;
    private ArrayList<Producto> listaDeProductos;
    private Alimento alimento;
    private Cosmetico cosmetico;

    @Before
    public void setUp(){
        this.alimento = new Alimento("Galletitas Pepas", 40, "kilo");
        this.cosmetico = new Cosmetico("Jabon Liquido Dove", 20, 40);
        this.bebida = new Bebida("Agua Villavicencio", 45, 1.5);
        this.carritoConUnProducto = new Carrito();
        this.carritoConVariosProductos = new Carrito();
        this.listaDeProductos = new ArrayList<>();
        this.listaDeProductos.add(bebida);
        this.listaDeProductos.add(alimento);
        this.listaDeProductos.add(cosmetico);
        this.carritoConUnProducto.agregarProducto(bebida);
        this.carritoConVariosProductos.agregarTodos(listaDeProductos);
    }

    @Test
    public void test_5_A_seCreaUnCarritoYSeAgregaUnProducto(){
        Assert.assertTrue(this.carritoConUnProducto.getProductos().contains(bebida));
    }

    @Test
    public void test_5_B_seCreaUnCarritoYSeAgreganVariosProductos(){
        Assert.assertTrue(this.carritoConVariosProductos.getProductos().contains(bebida));
        Assert.assertTrue(this.carritoConVariosProductos.getProductos().contains(alimento));
        Assert.assertTrue(this.carritoConVariosProductos.getProductos().contains(cosmetico));
    }

    @Test
    public void test_5_C_seImprimeEnPantallaLosProductosAgregadosAlCarrito(){
        Assert.assertEquals("Nombre: Agua Villavicencio /// Litros: 1.5 /// Precio: $45\n\n" +
                "Nombre: Galletitas Pepas /// Precio: $40 /// Unidad de venta: kilo\n\n" +
                "Nombre: Jabon Liquido Dove /// Contenido: 40ml /// Precio: $20",
                this.carritoConVariosProductos.imprimirTodosLosProductos());
    }

    @Test
    public void test_5_D_seBuscaElProductoMasCaroDelCarrito(){
        Assert.assertEquals(bebida, this.carritoConVariosProductos.productoMasCaro());
    }

    @Test
    public void test_5_E_seBuscaElProductoMasBaratoDelCarrito(){
        Assert.assertEquals(cosmetico, this.carritoConVariosProductos.productoMasBarato());
    }

    @Test
    public void test_5_F_seImprimeElProductoMasCaroDelCarrito(){
        Assert.assertEquals(bebida.toString(), this.carritoConVariosProductos.imprimirProductoMasCaro());
    }

    @Test
    public void test_5_G_seImprimeElProductoMasBaratoDelCarrito(){
        Assert.assertEquals(cosmetico.toString(), this.carritoConVariosProductos.imprimirProductoMasBarato());
    }
}
