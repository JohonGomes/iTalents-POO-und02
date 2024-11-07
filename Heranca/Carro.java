package Heranca;

public class Carro extends Veiculo{ //usamos extends para sinalizar que temos referência de uma classe pai
    private int portas;

    //preciso trazer os atributos da classe extendida ( classe pai )!
    public Carro(String marca, String modelo, int portas){
        super(marca, modelo); //o super refere-se aos atributos que vieram da classe pai.
        this.portas = portas;
    }

    //Nos getters e setters nesse caso so usamos o interno ou seja o de PORTAS!
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
