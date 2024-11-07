package ColocandoEmPratica;
//classe pai
public class ContaBancaria implements OperacoesBancarias{
    //atributos
    private String agencia;
    private String conta;
    private double saldo;

    public ContaBancaria(String agencia, String conta, double saldo){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected void imprimirOperacao(String operacao, double valor){
        System.out.println("\n---Operação de "+ operacao +"---");
        System.out.println("Valor " + operacao.toLowerCase() + " R$: " + valor);
        System.out.println("Saldo atual R$: " + saldo + "\n");
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        imprimirOperacao("Depósito", valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo){
            saldo -= valor;
            imprimirOperacao("Saque", valor);
        } else {
            System.out.println("Saldo Insuficiente para a Operação");
        }
    }

    @Override
    public double consultarSaldo() {
        System.out.println("Saldo Atual R$: " + saldo);
        return saldo;
    }
}
