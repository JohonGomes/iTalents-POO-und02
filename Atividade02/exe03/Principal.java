package Atividade02.exe03;
/*
3 - Implemente uma classe ContaBancaria com atributos como saldo e número da conta. Em seguida, crie
duas subclasses, ContaCorrente e ContaPoupanca, que herdam de ContaBancaria.
*/
public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.00, "0001", 5);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.00, "0002", 6);

        System.out.println("Conta Corrente - Número: " + contaCorrente.getNumeroConta() + ", com Saldo de R$:" + contaCorrente.getSaldo() + "\n");

        contaCorrente.depositar(1000);
        contaCorrente.descontarTaxaDeManutencao();
        contaCorrente.sacar(100);
    }
}