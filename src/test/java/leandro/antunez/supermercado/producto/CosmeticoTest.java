package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.producto.cosmetico.Cosmetico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CosmeticoTest {

    private int contenidoCosmetico;
    private Cosmetico cosmetico;
    private String nombreCosmetico;
    private int precioCosmetico;

    @Before
    public void setUp(){
        this.contenidoCosmetico = 500;
        this.nombreCosmetico = "Shampoo Sedal";
        this.precioCosmetico = 19;
        this.cosmetico = new Cosmetico(nombreCosmetico, precioCosmetico, contenidoCosmetico);
    }

    @Test
    public void test_4_A_seCreaUnCosmeticoYTieneContenidoDe500Mililitros(){
        Assert.assertEquals(contenidoCosmetico, this.cosmetico.getContenido());
    }


}
