package ExperienciaAcesso.outro;

import ExperienciaAcesso.pacote.Referencia;

public class Sub extends Referencia {
    public void testeDeAcesso(){
        //quando extends só os metodos publico ou protected tem acesso na subclasse
        //modificadorDefault = 0;
        modificadorPublico = 0;
        modificadorProtegido = 0;
        //modificadorPrivado = 0;
    }
}
