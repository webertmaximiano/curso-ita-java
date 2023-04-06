import java.text.DecimalFormat; //função para formatar o resultado em double
public class Principal {
    public static void main(String[] args) {
        Paciente Webert = new Paciente(100, 1.70);
        Paciente Erica = new Paciente(58, 1.60);
        Paciente Joao = new Paciente(55, 1.55);

        //Formatar o resultado do IMC do Paciente
        DecimalFormat imc=new DecimalFormat("##.##");


        System.out.println("O paciente Webert está com IMC: "+imc.format(Webert.calcularIMC())+". Seu diagnóstico é "+Webert.diagnostico());
        System.out.println("A paciente Erica está com IMC: "+imc.format(Erica.calcularIMC())+". Seu diagnóstico é "+Erica.diagnostico());
        System.out.println("O paciente João está com IMC: "+imc.format(Joao.calcularIMC())+". Seu diagnóstico é "+Joao.diagnostico());
    }
}
