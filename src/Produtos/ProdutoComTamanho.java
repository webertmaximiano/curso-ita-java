package Produtos;

import java.util.Objects;

public class ProdutoComTamanho extends Produto {
    private String tamanho;
    // adicionando tamanho ao Produto
    public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
        super(nome, codigo, preco);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof ProdutoComTamanho)) {
            return false;
        }

        ProdutoComTamanho produto = (ProdutoComTamanho) obj;

        return getCodigo() == produto.getCodigo() && tamanho.equals(produto.getTamanho());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), tamanho);
    }
}
