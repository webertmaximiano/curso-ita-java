public class Paciente {

    public double peso; //em Kilos
    public double altura; //em Metros

    //Construtor
    public Paciente( double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }
    public double getAltura() {
        return altura * altura;
    }

    // Criando o método  calcularIMC()
    public double calcularIMC() {

        double calculoIMC = getPeso()/getAltura();

        return calculoIMC;
    }


    // Criando o método diagnóstico
    public String diagnostico() {
        double calculo = calcularIMC();
        String diagnostico = "";

        // analise do diagnóstico
        if (calculo <= 16) {
            diagnostico = "Baixo peso muito grave";
        }	else if(calculo > 16 && calculo <= 16.99){ //operador && as duas condições tem que ser verdadeiras
            diagnostico = "Baixo peso grave";

        }	else if(calculo >= 17 && calculo <= 18.49){
            diagnostico = "Baixo peso";

        }	else if(calculo >= 18.5 && calculo <= 24.99){
            diagnostico = "Peso normal";

        }	else if(calculo >= 25 && calculo <= 29.99){
            diagnostico = "Sobrepeso";

        }	else if(calculo >= 30 && calculo <= 34.99){
            diagnostico = "Obsidade grau I";

        }	else if(calculo>= 35 && calculo <= 39.99){
            diagnostico = "Obsidade grau III";

        }	else if(calculo >= 40){
            diagnostico = "Obsidade morbida";
        }
        return diagnostico;


    }
}
