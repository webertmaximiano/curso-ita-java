package QualOprecoDaPizza;
// importa o ArrayList para ser usado no carrinho
import java.util.ArrayList;

//cria a Classe CarrinhoDeCompra
public class CarrinhoDeCompras {
    // instaciamos a nossa lista do carrinho
    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

    //metodo para adicionar a pizza usan a Classe Pizza
    public void adicionaPizza(Pizza pizza) {
        //verifica se a pizza tem pelo menos 1 ingrediente
        if (pizza.getPreco() == 0) {
            throw new IllegalArgumentException("A pizza precisa ter pelo menos um ingrediente.");
        }
        // adiciona a pizza no carrinho
        pizzas.add(pizza);
    }
    //metodo que calcula o valor total, ele percorre o array do carrinho, pega o preço de cada pizza e soma retornando o valor total
    public int getValorTotal() {
        int valorTotal = 0;

        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }

        return valorTotal;
    }
}
