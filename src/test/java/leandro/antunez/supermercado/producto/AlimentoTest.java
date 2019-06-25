package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.producto.alimento.Alimento;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlimentoTest {

    private String unidadDeVenta;
    private Alimento alimento;

    @Before
    public void setUp(){
        String nombreAlimento = "Frutillas";
        int precioAlimento = 64;
        this.unidadDeVenta = "kilo";
        this.alimento = new Alimento(nombreAlimento, precioAlimento, unidadDeVenta);
    }

    @Test
    public void test3ASeCreaUnAlimentoConUnidadDeVenta(){
        Assert.assertEquals(this.alimento.getUnidadDeVenta(), unidadDeVenta);
    }

    @Test
    public void test3BSeCreaUnAlimentoYSeImprimeEnPantalla(){
        Assert.assertEquals("Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo", this.alimento.toString());
    }
}
