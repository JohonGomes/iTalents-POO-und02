package Atividade02.exe09;

public class ContaCorrente extends ContaBancaria {
    private double taxaDeManutencao;
    private static final double JUROS_CONTA_CORRENTE = 0.15;

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

    @Override
    public void aplicarJuros() {
        double juros = getSaldo() * JUROS_CONTA_CORRENTE;
        sacar(juros);
        System.out.println("Juros de " + (JUROS_CONTA_CORRENTE * 100) + "%, debitados da Conta Corrente");
    }
}
