package ColocandoEmPratica;

public class ContaPoupanca extends ContaBancaria{
    private static final double JUROS_POUPANCA = 0.06;

    public ContaPoupanca(String agencia, String conta, double saldo) {
        super(agencia, conta, saldo);
    }

    @Override
    public double consultarSaldo() {
        double saldoAtual = getSaldo();
        System.out.println("Saldo Atual R$: " + saldoAtual);
        System.out.println("Rendendo a: " + JUROS_POUPANCA*100 + "% ao ano");
        return saldoAtual;
    }

    public void aplicarJurosMensal(){
        double jurosMensal = JUROS_POUPANCA/12;
        double juros = getSaldo()  * jurosMensal;
            setSaldo(getSaldo()+juros);
            super.consultarSaldo();
    }
}
