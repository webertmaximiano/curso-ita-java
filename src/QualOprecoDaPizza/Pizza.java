package QualOprecoDaPizza;
//importando o Hashmap da dica
import java.util.HashMap;

//criando a Classe Pizza
public class Pizza {
    // váriavel para contabilizar os ingridientes
    public static HashMap<String, Integer> ingredientesUtilizados = new HashMap<String, Integer>();

    // variável para receber os ingridientes
    public String[] ingredientes;

    //variável para o preço
    public int preco;


    // metodo para preparar a pizza
    public Pizza(String[] ingredientes) {
        // verifica se existe pelo menos 1 igridiente
        if (ingredientes.length == 0) {
            throw new IllegalArgumentException("A pizza precisa ter pelo menos um ingrediente.");
        }
        //pega os ingridientes e seta em igridientes
        this.ingredientes = ingredientes;
        // parte do método getPreco que retorna o valor calculado
        this.preco = calculaPreco(ingredientes);

        contabilizaIngredientes(ingredientes);

        zerarIngredientes (ingredientes);
    }

    //Metoto para zerar os igridientes
    public static void zerarIngredientes(String[] ingredientes) {
        ingredientes = new String[0];
    }

    //metodo getPreço retorna o resultado do calculo do preço
    public int getPreco() {
        return this.preco;
    }

    //metodo para contabilizar os ingridientes
    public static void contabilizaIngredientes(String[] ingredientes) {
        for (String ingrediente : ingredientes) {
            if (ingredientesUtilizados.containsKey(ingrediente)) {
                int quantidade = ingredientesUtilizados.get(ingrediente);
                ingredientesUtilizados.put(ingrediente, quantidade + 1);
            } else {
                ingredientesUtilizados.put(ingrediente, 1);
            }
        }
    }

    // metodo calculaPreco calcula e manda para variável this.preco
    private int calculaPreco(String[] ingredientes) {
        int quantidadeIngredientes = ingredientes.length;

        if (quantidadeIngredientes <= 2) {
            return 15;
        } else if (quantidadeIngredientes >= 3 && quantidadeIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }


}
