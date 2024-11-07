package Atividade02.exe09;

public class ContaBancaria {
    private double saldo;
    private String numeroConta;

    public ContaBancaria(double saldo, String numeroConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Você depositou R$: " + valor);
        System.out.println("Seu novo saldo é de R$: " + saldo);
    }

    public void sacar(double valor){
        if( valor <= saldo ){
            saldo -= valor;
            System.out.println("Você sacou R$: -" + valor);
            System.out.println("Seu saldo após o saque é de R$: " + saldo);
        }else{
            System.out.println("Não há saldo suficiente para o saque!");
        }
    }

    public void aplicarJuros(){
        System.out.println("Não há juros na conta base/pai");
    }
}
