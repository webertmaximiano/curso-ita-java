package ExperienciaAcesso.pacote;

public class OutraMesmoPacote {
    public void testeAcesso(){
        //somente o privado não foi possivel acessar no mesmo pacote
        Referencia r = new Referencia();
        r.modificadorDefault = 0;
        r.modificadorPublico = 0;
        //r.modificadorPrivado = 0;
        r.modificadorProtegido = 0;
    }
}
