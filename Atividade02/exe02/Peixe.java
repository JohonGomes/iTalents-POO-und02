package Atividade02.exe02;

public class Peixe extends Animal{
    private String tipoAlimentacao; // herbivoro, carnivoro

    public Peixe(String tipo, String territorio, String tipoAlimentacao){
        super(tipo, territorio);
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public void nadar(){
        System.out.println("Peixe nadando!");
    }
}
