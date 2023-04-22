package Concurso;

public class Candidato implements Comparable <Candidato>{

    private int nota;
    private boolean deficiene;
    private int idade;

    public Candidato(int nota, boolean deficiene, int idade) {
        super();
        this.nota = nota;
        this.deficiene = deficiene;
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public boolean isDeficiene() {
        return deficiene;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Candidato outro) {
        if(nota == outro.getNota()) {
            if(deficiene == outro.isDeficiene()){
                return idade - outro.getIdade();
            }else {
                if (deficiene)
                    return 1;
                else
                    return -1;
            }
        }else {
            return nota - outro.getNota();
        }
    }

    @Override
    public String toString() {
        return nota+";"+deficiene+"+"+idade;
    }
}
