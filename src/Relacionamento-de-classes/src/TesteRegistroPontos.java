import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteRegistroPontos {

    @Test //teste se a função de pontos por criar tópicos está funcionando
    public void pontosCriarTopicos() {
        Usuarios u = new Usuarios(); //cria um usuario
        u.nome = "Webert"; // nomeia o usuario
        CalculadoraBonus cb = new CalculadoraBonus(); //inicia a calculadora de bônus
        RegistroPontos rp = new RegistroPontos(cb); // inicia o registro de pontos
        rp.criarUmTopico(u); //registra os pontos do usuario após criar um tópico
        assertEquals(u.pontos, 5); // compara se o resultado dos pontos gerados foi 5
    }
    @Test //teste se a função de pontos para Usuarios VIP criar tópicos
    public void pontosCriarTopicosVIP() {
        Usuarios u = new Usuarios(); //cria um usuario
        u.nome = "Webert"; // nomeia o usuario
        u.vip = true;
        CalculadoraBonus cb = new CalculadoraBonus(); //inicia a calculadora de bônus
        RegistroPontos rp = new RegistroPontos(cb); // inicia o registro de pontos
        rp.criarUmTopico(u); //registra os pontos do usuario após criar um tópico
        assertEquals(u.pontos, 25); // compara se o resultado dos pontos gerados foi 25
    }
    @Test //teste Função Bonus do Dia
    public void pontosCriarTopicosBonusDoDia() {
        Usuarios u = new Usuarios(); //cria um usuario
        u.nome = "Webert"; // nomeia o usuario
        CalculadoraBonus cb = new CalculadoraBonus(); //inicia a calculadora de bônus
        cb.bonusDoDia = 3;
        RegistroPontos rp = new RegistroPontos(cb); // inicia o registro de pontos
        rp.criarUmTopico(u); //registra os pontos do usuario após criar um tópico
        assertEquals(u.pontos, 15); // compara se o resultado dos pontos gerados foi 5
    }
       @Test //teste Função Bonus do Dia
       public void pontosCriarTopicosBonusDoDiaVip() {
           Usuarios u = new Usuarios(); //cria um usuario
           u.nome = "Webert"; // nomeia o usuario
           u.vip = true;
           CalculadoraBonus cb = new CalculadoraBonus(); //inicia a calculadora de bônus
           cb.bonusDoDia=2;
           RegistroPontos rp = new RegistroPontos(cb); // inicia o registro de pontos
           rp.criarUmTopico(u); //registra os pontos do usuario após criar um tópico
           assertEquals(u.pontos, 50); // compara se o resultado dos pontos gerados foi 25
       }
}
