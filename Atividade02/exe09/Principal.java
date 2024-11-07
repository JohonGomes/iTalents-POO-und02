package Atividade02.exe09;
/*
9 - Expanda a classe ContaBancaria do exercício 3 adicionando um metodo chamado aplicarJuros, que é
implementado de maneira diferente nas subclasses ContaCorrente e ContaPoupanca, com valores de 15%
na conta corrente e de 6,5% na conta poupança.
 */
public class Principal {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000.00, "0001", 5);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.00, "0002", 6);

        System.out.println("Conta Corrente - Número: " + contaCorrente.getNumeroConta() + ", com Saldo de R$:" + contaCorrente.getSaldo() + "\n");
        System.out.println("Conta Poupança - Número: " + contaPoupanca.getNumeroConta() + ", com Saldo de R$:" + contaPoupanca.getSaldo() + "\n");

        contaCorrente.aplicarJuros();
        System.out.println("");
        contaPoupanca.aplicarJuros();

        System.out.println("\nSaldo após juros na Conta Corrente: R$" + contaCorrente.getSaldo());
        System.out.println("Saldo após juros na Conta Poupança: R$" + contaPoupanca.getSaldo());

    }
}