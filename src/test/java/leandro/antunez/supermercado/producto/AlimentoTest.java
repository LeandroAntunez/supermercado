package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.producto.alimento.Alimento;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlimentoTest {

    private String nombreAlimento;
    private int precioAlimento;
    private String unidadDeVenta;
    private Alimento alimento;

    @Before
    public void setUp(){
        this.nombreAlimento = "Frutillas";
        this.precioAlimento = 64;
        this.unidadDeVenta = "kilo";
        this.alimento = new Alimento(nombreAlimento, precioAlimento, unidadDeVenta);
    }

    @Test
    public void test_3_A_seCreaUnAlimentoConUnidadDeVenta(){
        Assert.assertEquals(this.alimento.getUnidadDeVenta(), unidadDeVenta);
    }

    @Test
    public void test_3_B_seCreaUnAlimentoYSeImprimeEnPantalla(){
        Assert.assertEquals("Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo", this.alimento.toString());
    }
}
