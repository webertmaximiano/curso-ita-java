package Escola;
public class MainEscola {
    public static void main(String[] args) {
        Aluno webert = new Aluno ();
        webert.bim1 = 70;
        webert.bim2 = 60;
        webert.bim3 = 80;
        webert.bim4 = 70;
        //Programação Estruturada
        System.out.println("Notas " + VerificadoraNotas.mediaAluno(webert));
        System.out.println("Notas " + VerificadoraNotas.passouDeAno(webert));
        //Programação Orientada a Objeto
        System.out.println("Notas " + webert.media());
        System.out.println("Notas " + webert.passouDeAno());
    }



}
