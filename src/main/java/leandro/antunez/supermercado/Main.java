package leandro.antunez.supermercado;

import leandro.antunez.supermercado.carrito.Carrito;
import leandro.antunez.supermercado.producto.alimento.Alimento;
import leandro.antunez.supermercado.producto.bebida.Bebida;
import leandro.antunez.supermercado.producto.cosmetico.Cosmetico;

public class Main {

    private static Carrito carrito = new Carrito();
    private static Alimento frutillas = new Alimento("Frutillas", 64, "kilo");
    private static Cosmetico shampoo = new Cosmetico("Shampoo Sedal", 19, 500);
    private static Bebida cocaCola = new Bebida("Coca-Cola", 18, 1.5);
    private static Bebida cocaColaZero = new Bebida("Coca-Cola Zero", 20, 1.5);

    public static void main(String[] args) {
        carrito.agregarProducto(cocaColaZero);
        carrito.agregarProducto(cocaCola);
        carrito.agregarProducto(shampoo);
        carrito.agregarProducto(frutillas);
        System.out.println(carrito.toString());
    }
}
