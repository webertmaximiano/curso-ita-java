package Compras;

import java.text.DecimalFormat;

public class Compra {
    double valorTotal;


    // construtor a vista
    public Compra(double valor){
       this.valorTotal  = valor;
    }


    public double getValorTotal() {

        return  valorTotal;
    }
    public String getValorTotalFormatado() {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(valorTotal);
    }

}
