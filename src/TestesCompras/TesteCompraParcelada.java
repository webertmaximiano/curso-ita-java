package TestesCompras;

import Compras.CompraParcelada;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCompraParcelada {
    @Test
    public void testTotalCompra1Parcela() {
        // cria uma compra parcelada com valor de R$ 1000, com juros de 1% ao mês
        CompraParcelada compraParcelada = new CompraParcelada(1000.0, 1, 0.01);

        // verifica se o total da compra parcelada é igual a R$ 1010,00
        assertEquals("1010,00", compraParcelada.getValorTotalFormatado());
    }
    @Test
    public void testTotalCompra2Parcelas() {
        // cria uma compra parcelada com valor de R$ 1000, em 5 parcelas com juros de 1% ao mês
        CompraParcelada compraParcelada = new CompraParcelada(1000.0, 2, 0.01);

        // verifica se o total da compra parcelada é igual a R$ 1020,10
        assertEquals("1020,10", compraParcelada.getValorTotalFormatado());
    }
    @Test
    public void testTotalCompra5Parcelas() {
        // cria uma compra parcelada com valor de R$ 1000, em 5 parcelas com juros de 1% ao mês
        CompraParcelada compraParcelada = new CompraParcelada(1000.0, 5, 0.01);

        // verifica se o total da compra parcelada é igual a R$ 1051,01
        assertEquals("1051,01", compraParcelada.getValorTotalFormatado());
    }
    @Test
    public void testTotalCompra10Parcelas() {
        // cria uma compra parcelada com valor de R$ 1000, em 5 parcelas com juros de 1% ao mês
        CompraParcelada compraParcelada = new CompraParcelada(1000.0, 10, 0.01);

        // verifica se o total da compra parcelada é igual a R$ 1104,62
        assertEquals("1104,62", compraParcelada.getValorTotalFormatado());
    }
}
