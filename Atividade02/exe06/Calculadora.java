package Atividade02.exe06;

public class Calculadora {

    //Soma de Inteiros
    public int somar( int x , int y){
        return x + y;
    }

    //Soma de decimais
    public double somar( double x , double y){
        return x + y;
    }

    //Subtração de Inteiros
    public int subtrair( int x , int y){
        return x - y;
    }

    //Subtração de decimais
    public double subtrair( double x , double y){
        return x - y;
    }

    //Multiplicação de Inteiros
    public int multiplicar( int x , int y){
        return x * y;
    }

    //Multiplicação de decimais
    public double multiplicar( double x , double y){
        return x * y;
    }

    //Divisão de Inteiros
    public int dividir( int x , int y){
        if ( y == 0 ){
            throw new IllegalArgumentException("Divisão por zero não é possível");
        }
        return x / y;
    }

    //Divisão de Decimais
    public double dividir( double x , double y){
        if ( y == 0 ){
            throw new IllegalArgumentException("Divisão por zero não é possível");
        }
        return x / y;
    }
}
