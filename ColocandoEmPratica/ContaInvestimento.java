package ColocandoEmPratica;

import java.sql.SQLOutput;

public class ContaInvestimento extends ContaBancaria {
    private static final double TAXA_ADMINISTRACAO = 20.00;
    private static final double TAXA_JUROS_MENSAL = 0.012;
    private double saldoInvestido;


    public ContaInvestimento(String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
        this.saldoInvestido = 0.0;
    }

    public void investir(double valor){
        if(valor <= getSaldo()){
            setSaldo(getSaldo()-valor);
            double valorInvestido = valor - TAXA_ADMINISTRACAO;
            saldoInvestido += valorInvestido;
            System.out.println("Investimento de R$ " + valorInvestido + " realizado!");
            System.out.println("Saldo investido atualizado: R$ " + saldoInvestido);
        }else{
            System.out.println("Saldo insuficiente para Investir");
        }
    }

    public void resgatar(double valor){
        if (valor <= saldoInvestido){
            saldoInvestido -= valor;
            setSaldo(getSaldo()+ valor);
            System.out.println("Saldo investido atualizado: R$ " + saldoInvestido);
            super.consultarSaldo();
        }else{
            System.out.println("Saldoinvestido insuficiente para operação");
        }
    }

    public double consultarSaldoInvestido(){
        System.out.println("Saldo Investido : R$ " + saldoInvestido);
        return saldoInvestido;
    }

    public void aplicarJurosMensal(){
        saldoInvestido += saldoInvestido * TAXA_JUROS_MENSAL;
        System.out.println("Saldo investido atualizado: R$ " + saldoInvestido);
    }
}
