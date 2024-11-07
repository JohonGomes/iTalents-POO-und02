package Atividade02.exe03;

public class ContaCorrente extends ContaBancaria{
    private double taxaDeManutencao;

    public ContaCorrente(double saldo, String numeroConta, double taxaDeManutencao){
        super(saldo, numeroConta);
        this.taxaDeManutencao = taxaDeManutencao;
    }

    public double getTaxaDeManutencao() {
        return taxaDeManutencao;
    }

    public void setTaxaDeManutencao(double taxaDeManutencao) {
        this.taxaDeManutencao = taxaDeManutencao;
    }

    public void descontarTaxaDeManutencao(){
        if(getSaldo() >= taxaDeManutencao){
            setSaldo(getSaldo() - taxaDeManutencao);
            System.out.println("Desconto da Taxa de Manutenção R$ -" + taxaDeManutencao);
            System.out.println("Seu saldo atual é de R$: " + getSaldo());
        } else {
            System.out.println("Você não saldo suficiente para pagar a taxa de manutenção!");
        }
    }
}
