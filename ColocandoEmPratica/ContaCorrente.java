package ColocandoEmPratica;

public class ContaCorrente extends ContaBancaria {
    private static final double TAXA_MANUTENCAO = 15.00;
    private static final double LIMITE_TOTAL = 1000.00;
    private double limite;

    public ContaCorrente(String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
        this.limite = LIMITE_TOTAL;
    }

    @Override
    public void sacar(double valor) {
        double saldoAtual = getSaldo();
        if(valor <= saldoAtual + limite){
            if(valor <= saldoAtual){
                setSaldo(saldoAtual -= valor);
                imprimirOperacao("Saque", valor);
            } else {
                limite -= (valor - saldoAtual);
                setSaldo(saldoAtual -= valor);
                imprimirOperacao("Saque", valor);
            }
        }else{
            System.out.println("Saldo + Limite Insuficiente para operação!");
            System.out.println("Saldo R$: " + saldoAtual + " Limite disponível : R$ " + limite);
        }
    }

    public void consultarLimite(){
        System.out.println("Seu limite atual é de : R$" + limite);
    }

    public void executarTaxa(){
        setSaldo(getSaldo()-TAXA_MANUTENCAO);
        System.out.println("Taxa de manutenção executada!");
    }


}
