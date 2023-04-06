public class RegistroPontos {

    private CalculadoraBonus bonus;
    //construtor usando a classe CalculadoraBonus
    public RegistroPontos(CalculadoraBonus cb) {
        bonus = cb;
    }
    public void fazerUmComentario(Usuarios u) { //usando a classe Usuarios
        u.pontos += 3 * bonus.bonus(u);
    }

    public void criarUmTopico(Usuarios u) {
        u.pontos += 5 * bonus.bonus(u);
    }

    public void darUmLike(Usuarios u) {
        u.pontos += 1 * bonus.bonus(u);
    }
}
