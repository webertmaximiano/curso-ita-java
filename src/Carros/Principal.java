package Carros;

public class Principal {
     public static void main(String[] args) {
        Corrida corridaDaMaluca = new Corrida(2000);
        corridaDaMaluca.AdicionaCarro(new CarroSoma("CarroA",10, 110));
        corridaDaMaluca.AdicionaCarro(new CarroSoma("CarroB",8, 140));
        corridaDaMaluca.AdicionaCarro(new CarroMult("CarroC",1.7, 100));
        corridaDaMaluca.AdicionaCarro(new CarroMult("CarroD",1.4, 100));
        corridaDaMaluca.umDoisTresEJa();
    }
}
