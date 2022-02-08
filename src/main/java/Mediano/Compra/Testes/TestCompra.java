package Mediano.Compra.Testes;

import Mediano.Compra.Classes.Compra;
import Mediano.Compra.Classes.CompraParcelada;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCompra {

    @Test
    public void compraUmaParcela() {
        Compra c = new Compra(150);

        System.out.println(c.total());

        Assertions.assertEquals(150, c.total());
    }

    @Test
    public void compraDuasParcelas() {
        Compra c = new CompraParcelada(500, 2, 10);

        System.out.println((int)c.total());

        Assertions.assertEquals(605, c.total(), 0.1);
    }

    @Test
    public void compraCincoParcelas() {
        Compra c = new CompraParcelada(1000, 5, 30);

        System.out.println((int)c.total());

        Assertions.assertEquals(3712.93, c.total(), 0.1);
    }

    @Test
    public void compraDezParcelas() {
        Compra c = new CompraParcelada(8000, 10, 2);

        System.out.println((int)c.total());

        Assertions.assertEquals(9751.96, c.total(), 0.1);
    }

}
