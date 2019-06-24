package leandro.antunez.supermercado.producto;

import leandro.antunez.supermercado.producto.bebida.Bebida;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BebidaTest {

    private double litrosBebida;
    private String nombreBebida;
    private int precioBebida;
    private Bebida bebida;

    @Before
    public void setUp(){
        this.litrosBebida = 1.5;
        this.nombreBebida = "Coca Cola";
        this.precioBebida = 20;
        this.bebida = new Bebida(nombreBebida, precioBebida, litrosBebida);
    }

    @Test
    public void seCreaBebidaConVolumen(){
        Assert.assertEquals(bebida.getLitros(), litrosBebida, 0.1);
    }
}
