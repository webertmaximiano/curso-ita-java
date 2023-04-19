package TestesProdutos;

import Produtos.CarrinhoDeCompras;
import Produtos.ProdutoComTamanho;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteCarrinhoDeCompras {

    ProdutoComTamanho produto1, produto2;
    CarrinhoDeCompras carrinho;
    @Before
    public void inicializarCarrinhoDeCompras() {

        produto1 = new ProdutoComTamanho("Blusa", 2, 40.00,"M");
        produto2 = new ProdutoComTamanho("Short", 3, 30.00,"P");

        carrinho = new CarrinhoDeCompras();
    }
    @Test
    public void testeCriandoCarrinho() {
       assertTrue(carrinho.equals(carrinho)); //verifica se o carrinho foi criado
    }
    @Test
    public void testeAdicionarProdutoNoCarrinho() {
         carrinho.adicionaProduto(produto1, 1);
        assertEquals(1, carrinho.getQuantidadeAtual()); // um produto no carrinho
    }
    @Test
    public void testeRemoverProdutoNoCarrinho() {
        carrinho.removeProduto(produto1, 1);
        assertEquals(0, carrinho.getQuantidadeAtual());// carrinho vazio

    }
    @Test
    public void testeCalculaOvalorTotal() {
        carrinho.adicionaProduto(produto1,1);
        carrinho.adicionaProduto(produto2, 2);
        assertEquals(100.00, carrinho.calculaValorTotal());

    }

}
