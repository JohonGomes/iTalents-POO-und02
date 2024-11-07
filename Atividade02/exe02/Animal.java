package Atividade02.exe02;
/*
2 - Desenvolva uma hierarquia de classes representando animais, começando com uma classe base Animal
e subclasses como Mamifero, Ave e Peixe.
*/
public class Animal {
    private String tipo; // Terrestre, Aquatico , Voador
    private String territorio; // Floresta, Mar/Rio, Serrado

    public Animal(String tipo, String territorio){
        this.tipo = tipo;
        this.territorio = territorio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTerritorio() {
        return territorio;
    }

    public void setTerritorio(String territorio) {
        this.territorio = territorio;
    }

    public void emitirSom(){
        System.out.println("O animal emitiu um som");
    }
}
