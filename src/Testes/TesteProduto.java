package Testes;

import Produtos.Produto;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteProduto {
    Produto produto;
    //inicializa o produto antes de cada teste
    @Before
    public void inicializarProduto() {
        produto = new Produto("Celular", 001, 1.000);
    }
    // Testes da Classe Produto
    @Test
    public void testeCriarProdutoPegaNome() {
        assertEquals("Celular", produto.getNome());
    }
    @Test
    public void testeCriarProdutoPegaCodigo() {
        assertEquals(001, produto.getCodigo());
    }
    @Test
    public void testeCriarProdutoPegaPreco() {
        assertEquals(1.000, produto.getPreco());
    }
    @Test
    public void testeEquals() {
       Produto produto1 = new Produto("Perfume", 002, 2.000);
        assertTrue(produto.equals(produto));
        assertFalse(produto.equals(produto1));
    }
    @Test
    public void testHashCode() {
        assertTrue(produto.hashCode() == produto.hashCode());
        assertFalse(produto.hashCode() != produto.hashCode());
    }
}
