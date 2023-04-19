package Carros;

public abstract class CarroDeCorrida {

    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    // Criando o Construtor
    //criando os métodos que alteram o comportamento de uma classe
    public CarroDeCorrida(String nome, int velocidadeMaxima) {
        //super();
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidade = 0;
    }
    public abstract void acelerar();
    public void frear() {
        velocidade = velocidade / 2;
    }
    //get e set
    public int getVelocidade() {
        return velocidade;
    }
    public String getNome() {
        return nome;
    }


}
