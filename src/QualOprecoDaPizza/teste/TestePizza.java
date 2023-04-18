import QualOprecoDaPizza.CarrinhoDeCompras;
import QualOprecoDaPizza.Pizza;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestePizza {
    //verifica se o valor da Pizza está correto
    @Test
    public void testeValor() {
        Pizza pizza1 = new Pizza(new String[]{"Queijo", "Tomate"});
        //criando o carrinho de compra
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        //adicionando as pizzas criadas no carrinho
        carrinhoDeCompras.adicionaPizza(pizza1);
        assertEquals(15, carrinhoDeCompras.getValorPizza ());
    }

    // teste dos ingridientes
    @Test
    public void testeIngridientes(){
        //criando as pizzas
        Pizza pizza1 = new Pizza(new String[]{"Queijo", "Tomate"});
        //verificando se o array de ingredientes não está vazio
        assertNotEquals(null, pizza1.ingredientes);
        assertNotEquals(0, pizza1.ingredientes.length);
    }
    // teste invocando o metodo para zerar os igridientes
    @Test
    public void testeZerandoIngridientes() {

        Pizza pizza1 = new Pizza(new String[]{"Queijo", "Tomate"});
        Pizza.zerarIngredientes(pizza1.ingredientes);
    }

    //verificando se o preço das pizzas são somados corretamente
    @Test
    public void somaCorreta(){
        Pizza pizza1 = new Pizza(new String[]{"Queijo", "Tomate"});
        Pizza pizza2 = new Pizza(new String[]{"Calabresa", "Queijo"});
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        //adicionando as pizzas criadas no carrinho
        carrinhoDeCompras.adicionaPizza(pizza1);
        carrinhoDeCompras.adicionaPizza(pizza2);
        assertEquals (30, carrinhoDeCompras.getValorTotal());// 15 cada pizza soma correta
    }

    //verificando se o preço das pizzas são somados corretamente e se ele impede a adição de uma pizza sem ingredientes.
    @Test
    public void impedindoPizzaVazia(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Pizza pizza1 = new Pizza(new String[]{});
        });
    }
}
