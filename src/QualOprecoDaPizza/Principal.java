package QualOprecoDaPizza;
//criamos a Classe Principal
public class Principal {
    public static void main(String[] args) {
        //criando as pizzas
        Pizza pizza1 = new Pizza(new String[]{"Queijo", "Tomate"});
        Pizza pizza2 = new Pizza(new String[]{"Queijo", "Tomate", "Ovo", "Mussarela"});
        Pizza pizza3 = new Pizza(new String[]{"Bacon", "Milho", "Catupiry", "Molho de Tomate", "Azeitona", "Cebola"});
        //criando o carrinho de compra
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        //adicionando as pizzas criadas no carrinho
        carrinhoDeCompras.adicionaPizza(pizza1);
        carrinhoDeCompras.adicionaPizza(pizza2);
        carrinhoDeCompras.adicionaPizza(pizza3);

        //exibi o Valor total do Carrinho
        System.out.println("Valor total: R$ " + carrinhoDeCompras.getValorTotal());
        // exibi os ingridientes
        System.out.println("Ingredientes utilizados:");
        //exibi ingridientes e quantidade utilizados
        for (String ingrediente : Pizza.ingredientesUtilizados.keySet()) {
            System.out.println(ingrediente + ": " + Pizza.ingredientesUtilizados.get(ingrediente));
        }
    }
}
