package PilhaEncapsulada;

public class Principal {
    public static void main(String[] args) {
        Pilha p = new Pilha(10);
        p.empilhar("Webert");
        p.empilhar("Erica");
        p.empilhar("João");
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        Object[] arrayElementos = p.getElementos();
        System.out.println(arrayElementos.length);
        arrayElementos[1] = "OUTRO";

        // Desempilhando
        System.out.println("___________________");
        System.out.println(p.desempilhar());
        System.out.println(p.topo());
        System.out.println(p.tamanho());

        System.out.println(p.getElementos().length);
    }
}
