package Atividade02.exe01;
/*
1 - Crie uma classe Veiculo com atributos como modelo e ano. Em seguida, crie duas subclasses, Carro e
Moto, que herdam de Veiculo, cada um deve possuir pelo menos 2 atributos e um metodo a mais.
*/

public class Veiculo {
    private String modelo;
    private String ano;

    public Veiculo(String modelo, String ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("Ligou o veículo");
    }
}
