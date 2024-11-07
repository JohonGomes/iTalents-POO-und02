package Atividade02.exe03;

public class ContaPoupanca extends ContaBancaria {
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
}
