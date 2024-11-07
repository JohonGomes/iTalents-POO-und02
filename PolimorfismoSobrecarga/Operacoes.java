package PolimorfismoSobrecarga;

public class Operacoes {
    //sem atributos

    //Metodos
    public int somar(int a, int b){
        return a + b;
    }

    public double somar(double a, double b){
        return a + b;
    }

    public double somar(double a, double b, double c){
        return a + b +c;
    }

    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();

        int resultado = operacoes.somar(3, 4);
        double resultado2 = operacoes.somar(3.5, 5.5);
        double resultado3 = operacoes.somar(resultado, resultado2, 5.3);

        System.out.println("Resultado da soma: " + resultado);
        System.out.println("Resultado2 da soma: " + resultado2);
        System.out.println("Resultado3 da soma: " + resultado3);
    }
}
