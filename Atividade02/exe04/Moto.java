package Atividade02.exe04;

public class Moto extends Veiculo {
    private int cilindrada;
    private int potencia;

    public Moto(String modelo, String ano, int cilindrada, int potencia){
        super(modelo, ano);
        this.cilindrada = cilindrada;
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void desligar(){
        System.out.println("Desligou a moto");
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilidranda " + cilindrada + ", Potência " + potencia);
    }
}
