package Produtos;
import java.util.HashMap;

public class CarrinhoDeCompras {
    private HashMap<ProdutoComTamanho, Integer> produtosNoCarrinho;
    int quantidadeAtual;

    public CarrinhoDeCompras() {
        produtosNoCarrinho = new HashMap<>();
    }

    public void adicionaProduto(ProdutoComTamanho produto, int quantidade) {
        quantidadeAtual = produtosNoCarrinho.getOrDefault(produto, 0);
        produtosNoCarrinho.put(produto, quantidadeAtual + quantidade);
    }

    public void removeProduto(ProdutoComTamanho produto, int quantidade) {
        int quantidadeAtual = produtosNoCarrinho.getOrDefault(produto, 0);
        int novaQuantidade = quantidadeAtual - quantidade;
        if (novaQuantidade > 0) {
            produtosNoCarrinho.put(produto, novaQuantidade);
        } else {
            produtosNoCarrinho.remove(produto);
        }
    }
    public int getQuantidadeAtual() {
        return produtosNoCarrinho.size();
    }

    public double calculaValorTotal() {
        double valorTotal = 0;
        for (ProdutoComTamanho produto : produtosNoCarrinho.keySet()) {
            int quantidade = produtosNoCarrinho.get(produto);
            valorTotal += produto.getPreco() * quantidade;
        }
        return valorTotal;
    }
}
