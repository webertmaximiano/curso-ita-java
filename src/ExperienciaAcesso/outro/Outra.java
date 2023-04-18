package ExperienciaAcesso.outro;

import ExperienciaAcesso.pacote.Referencia;

public class Outra {
    public void testeAcesso(){
        //somente o publico foi possivel acessar
        Referencia r = new Referencia();
        //r.modificadorDefault = 0;
        r.modificadorPublico = 0;
        //r.modificadorPrivado = 0;
        //r.modificadorProtegido = 0;
    }
}
