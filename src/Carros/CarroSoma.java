package Carros;

public class CarroSoma extends CarroDeCorrida {
    //declaramos os atributos da classe
    private int potencia;
    // Criando o Construtor
    //criando os métodos que alteram o comportamento de uma classe
    public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
        super(nome, velocidadeMaxima);
        this.potencia = potencia;
    }

    public void acelerar() {
        velocidade += potencia;
        if (velocidade > velocidadeMaxima)
            velocidade = velocidadeMaxima;
    }
}
