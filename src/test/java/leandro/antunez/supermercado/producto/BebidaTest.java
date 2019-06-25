package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.producto.bebida.Bebida;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BebidaTest {

    private double litrosBebida;
    private Bebida bebida;

    @Before
    public void setUp(){
        this.litrosBebida = 1.5;
        String nombreBebida = "Coca-Cola";
        int precioBebida = 18;
        this.bebida = new Bebida(nombreBebida, precioBebida, litrosBebida);
    }

    @Test
    public void test2ASeCreaBebidaConVolumen(){
        Assert.assertEquals(this.bebida.getLitros(), litrosBebida, 0.1);
    }

    @Test
    public void test2BSeCreaBebidaYSeImprimePorPantalla(){
        Assert.assertEquals("Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18", bebida.toString());
    }
}
