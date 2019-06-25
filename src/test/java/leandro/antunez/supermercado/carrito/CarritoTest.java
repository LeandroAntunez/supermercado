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
    private Alimento alimento;
    private Cosmetico cosmetico;

    @Before
    public void setUp(){
        this.alimento = new Alimento("Galletitas Pepas", 40, "kilo");
        this.cosmetico = new Cosmetico("Jabon Liquido Dove", 20, 40);
        this.bebida = new Bebida("Agua Villavicencio", 45, 1.5);
        this.carritoConUnProducto = new Carrito();
        this.carritoConVariosProductos = new Carrito();
        ArrayList<Producto> listaDeProductos = new ArrayList<>();
        listaDeProductos.add(bebida);
        listaDeProductos.add(alimento);
        listaDeProductos.add(cosmetico);
        this.carritoConUnProducto.agregarProducto(bebida);
        this.carritoConVariosProductos.agregarTodos(listaDeProductos);
    }

    @Test
    public void test5ASeCreaUnCarritoYSeAgregaUnProducto(){
        Assert.assertTrue(this.carritoConUnProducto.getProductos().contains(bebida));
    }

    @Test
    public void test5BSeCreaUnCarritoYSeAgreganVariosProductos(){
        Assert.assertTrue(this.carritoConVariosProductos.getProductos().contains(bebida));
        Assert.assertTrue(this.carritoConVariosProductos.getProductos().contains(alimento));
        Assert.assertTrue(this.carritoConVariosProductos.getProductos().contains(cosmetico));
    }

    @Test
    public void test5CSeImprimeEnPantallaLosProductosAgregadosAlCarrito(){
        Assert.assertEquals("Nombre: Agua Villavicencio /// Litros: 1.5 /// Precio: $45\n\n" +
                "Nombre: Galletitas Pepas /// Precio: $40 /// Unidad de venta: kilo\n\n" +
                "Nombre: Jabon Liquido Dove /// Contenido: 40ml /// Precio: $20",
                this.carritoConVariosProductos.imprimirTodosLosProductos());
    }

    @Test
    public void test5DSeBuscaElProductoMasCaroDelCarrito(){
        Assert.assertEquals(bebida, this.carritoConVariosProductos.productoMasCaro());
    }

    @Test
    public void test5ESeBuscaElProductoMasBaratoDelCarrito(){
        Assert.assertEquals(cosmetico, this.carritoConVariosProductos.productoMasBarato());
    }

    @Test
    public void test5FSeImprimeElProductoMasCaroDelCarrito(){
        Assert.assertEquals("Producto más caro: " + bebida.getNombre(), this.carritoConVariosProductos.imprimirNombreDeProductoMasCaro());
    }

    @Test
    public void test5GSeImprimeElProductoMasBaratoDelCarrito(){
        Assert.assertEquals("Producto más barato: " + cosmetico.getNombre(), this.carritoConVariosProductos.imprimirNombreDeProductoMasBarato());
    }

    @Test
    public void test5HSeImprimeTodosLosProductosLuegoElMasCaroYElMasBaratoDelCarrito(){
        Assert.assertEquals("Nombre: Agua Villavicencio /// Litros: 1.5 /// Precio: $45\n\n" +

                "Nombre: Galletitas Pepas /// Precio: $40 /// Unidad de venta: kilo\n\n" +

                "Nombre: Jabon Liquido Dove /// Contenido: 40ml /// Precio: $20\n\n" +

                "=============================\n\n" +

                "Producto más caro: Agua Villavicencio\n\n" +

                "Producto más barato: Jabon Liquido Dove",

                this.carritoConVariosProductos.toString());
    }
}
