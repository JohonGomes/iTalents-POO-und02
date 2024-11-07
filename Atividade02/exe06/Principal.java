package Atividade02.exe06;
/*
- Crie um exemplo de polimorfismo por sobrecarga, criando uma classe Calculadora que tenha métodos
para as 4 operações básicas (soma, subtração, multiplicação, divisão) aceitando diferentes tipos de
parâmetros.
*/

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Somar Inteiros: "+ calculadora.somar(2,3));
        System.out.println("Somar Decimais: "+ calculadora.somar(2.6,3.4));

        System.out.println("\nSubtrair Inteiros: "+ calculadora.subtrair(5,3));
        System.out.println("Subtrair Decimais: "+ calculadora.subtrair(2.8,2.2));

        System.out.println("\nMultiplicar Inteiros: "+ calculadora.multiplicar(2,3));
        System.out.println("Multiplicar Decimais: "+ calculadora.multiplicar(2.8,3.7));

        System.out.println("\nDividir Inteiros(erro): "+ calculadora.multiplicar(2,0));
        System.out.println("Dividir Inteiros: "+ calculadora.multiplicar(3,3));
        System.out.println("Dividir Decimais(erro): "+ calculadora.multiplicar(2.0,0));
        System.out.println("Dividir Decimais: "+ calculadora.multiplicar(5.5,2.2));


    }
}
