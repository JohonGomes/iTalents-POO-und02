package Atividade02.exe09;

public class ContaPoupanca extends ContaBancaria {
    private static final double JUROS_CONTA_POUPANCA = 0.065;
    private double taxaDeRendimentos;

    public ContaPoupanca(double saldo, String numeroConta, double taxaDeRendimentos){
        super(saldo, numeroConta);
        this.taxaDeRendimentos = taxaDeRendimentos;
    }

    public double getTaxaDeRendimentos() {
        return taxaDeRendimentos;
    }

    public double calcularRendimentoMensal(){
        return getSaldo() * (taxaDeRendimentos / 100);
    }

    @Override
    public void aplicarJuros() {
        double juros = getSaldo() * JUROS_CONTA_POUPANCA;
        depositar(juros);
        System.out.println("Juros de " + (JUROS_CONTA_POUPANCA * 100) +  "% aplicados na Conta Poupança.");
    }
}
