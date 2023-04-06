package Carros;

public class Carro {
    //declaramos os atributos da classe
    int potencia;
    int velocidade;
    String nome;

    //criando os métodos que alteram o comportamento de uma classe
    void acelerar() {
        velocidade += potencia; // é o mesmo que velocidade = velocidade
    }
    void frear(){
        velocidade = velocidade / 2;
    }
    int getVelocidade() {
        return velocidade;
    }

    void imprimir() {
        System.out.println("O carro "+nome+ "está a velocidade de "+getVelocidade()+" km/h");
    }
}
