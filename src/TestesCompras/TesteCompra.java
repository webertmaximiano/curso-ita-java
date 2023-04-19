package TestesCompras;

import Compras.Compra;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCompra {
    Compra compra;

    @Test
    public void testeCompra() {
        compra = new Compra(50.00);
        assertEquals(50.00, compra.getValorTotal());
    }
    @Test
    public void testeValorTotalFormatado() {
        compra = new Compra(50.00);
        assertEquals("50,00", compra.getValorTotalFormatado());
    }
}
