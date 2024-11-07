package Atividade02.exe01;

public class Carro extends Veiculo {
    private int numeroDePortas;
    private String cor;

    public Carro(String modelo, String ano, int portas, String cor){
        super(modelo, ano);
        this.numeroDePortas = portas;
        this.cor = cor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double abastecer(double litros){
        System.out.println("Abasteceu " + litros +" de gasolina");
        return litros;
    }
}
