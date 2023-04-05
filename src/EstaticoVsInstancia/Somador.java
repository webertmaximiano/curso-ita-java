package EstaticoVsInstancia;
// nesse exemplo podemos verificar o funcionamento das váriaveis instanciadas e estaticas
// as váriaveis estáticas ficam viziveis a todas as instanciais
public class Somador {
    String nome;
    int valorInstancia=0;
    static int valorEstatica=0;

    //método somar
    void somar() {
        valorInstancia++;
        valorEstatica++;
    }

    //metodo imprimir
    void imprimir() {
        System.out.println("O somador "+nome+": instancia= "+valorInstancia+" e estatica= "+valorEstatica);
    }
}
