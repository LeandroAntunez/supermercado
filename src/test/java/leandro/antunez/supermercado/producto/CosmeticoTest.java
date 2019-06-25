package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.producto.cosmetico.Cosmetico;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CosmeticoTest {

    private int contenidoCosmetico;
    private Cosmetico cosmetico;

    @Before
    public void setUp(){
        this.contenidoCosmetico = 500;
        String nombreCosmetico = "Shampoo Sedal";
        int precioCosmetico = 19;
        this.cosmetico = new Cosmetico(nombreCosmetico, precioCosmetico, contenidoCosmetico);
    }

    @Test
    public void test4ASeCreaUnCosmeticoYTieneContenidoDe500Mililitros(){
        Assert.assertEquals(contenidoCosmetico, this.cosmetico.getContenido());
    }

    @Test
    public void test4BSeCreaUnCosmeticoYSeImprimeEnPantalla(){
        Assert.assertEquals("Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19", this.cosmetico.toString());
    }
}
