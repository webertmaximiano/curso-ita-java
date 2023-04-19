package Produtos;

public class Produto {
    //Declarando as variáveis
    private String nome;
    private int codigo;
    private double preco;
    //criando o construtor
    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }
    // métodos para acessar os atributos da classe
    public String getNome() {
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    // Sobrescrevemos os métodos equals() e hashCode()
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Produto)) {
            return false;
        }

        Produto produto = (Produto) obj;

        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }
}

