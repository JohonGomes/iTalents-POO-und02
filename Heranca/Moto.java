package Heranca;

public class Moto extends Veiculo {
    private int cilindradas;

    //preciso trazer os atributos da classe extendida ( classe pai )!
    public Moto(String marca, String modelo, int cilindradas){
        super(marca, modelo); //o super refere-se aos atributos que vieram da classe pai.
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
