package Compras;

import java.text.DecimalFormat;

public class CompraParcelada extends Compra {
   private int numeroParcelas;
    private double jurosMensal;

    //construtor parcelado
    public CompraParcelada(double valor, int parcelas, double jurosMensal) {
        super(valor);
        this.numeroParcelas = parcelas;
        this.jurosMensal = jurosMensal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public double getValorParcela(){
        double valorParcela = valorTotal/numeroParcelas;
        return valorParcela;
    }

    @Override
    public double getValorTotal() {
        double valorTotal = super.getValorTotal();
        double juros = 1 + jurosMensal; // valor de juros é calculado adicionando 1 ao valor do juros mensal.
        double valorParcela = valorTotal / numeroParcelas; //calcula o valor da parcela
        for (int i = 0; i < numeroParcelas; i++) { // é aplicada a fórmula de juros compostos para cada parcela
            valorTotal *= juros;
        }
        return valorTotal;
    }

    @Override
    public String getValorTotalFormatado() {
        DecimalFormat formatador = new DecimalFormat("0.00");
        return formatador.format(getValorTotal());
    }
}
