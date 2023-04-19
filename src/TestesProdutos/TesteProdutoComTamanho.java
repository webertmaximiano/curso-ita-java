package TestesProdutos;

import Produtos.ProdutoComTamanho;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteProdutoComTamanho {
    ProdutoComTamanho produto;
    //inicializa o produto com tamanho
    @Before
    public void inicializarProdutoComTamanho() {
        produto = new ProdutoComTamanho("Blusa", 1, 50.00,"M");
    }
    @Test
    public void testeCriarProdutoComTamanhoPegaNome() {
        assertEquals("Blusa", produto.getNome());
    }
    @Test
    public void testeCriarProdutoComTamanhoPegaCodigo() {

        assertEquals(1, produto.getCodigo());
    }
    @Test
    public void testeCriarProdutoComTamanhoPegaPreco() {
        assertEquals(50.00, produto.getPreco());
    }
    @Test
    public void testeEquals() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Perfume", 10, 2.00, "G");
        assertTrue(produto.equals(produto));
        assertFalse(produto.equals(produto1));
    }
    @Test
    public void testHashCode() {
        assertTrue(produto.hashCode() == produto.hashCode());
        assertFalse(produto.hashCode() != produto.hashCode());
    }

}
