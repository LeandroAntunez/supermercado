package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.producto.alimento.Alimento;
import leandro.antunez.supermercado.producto.caracteristicas.UnidadDeVenta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static leandro.antunez.supermercado.producto.caracteristicas.UnidadDeVenta.KILOS;

public class AlimentoTest {

    private String nombreAlimento;
    private int precioAlimento;
    private UnidadDeVenta unidadDeVenta;
    private Alimento alimento;

    @Before
    public void setUp(){
        this.nombreAlimento = "Frutilla";
        this.precioAlimento = 64;
        this.unidadDeVenta = KILOS;
        this.alimento = new Alimento(nombreAlimento, precioAlimento, unidadDeVenta);
    }

    @Test
    public void test_3_A_seCreaUnAlimentoConUnidadDeVenta(){
        Assert.assertEquals(this.alimento.getUnidadDeVenta(), unidadDeVenta);
    }
}
