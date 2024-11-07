package Atividade02.exe04;

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

    public void imprimirInformacoes(){
        System.out.println("Modelo: " + getModelo() + ", Ano: " + getAno());
    }
}
