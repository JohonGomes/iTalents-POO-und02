package Atividade02.exe02;

public class Mamifero extends Animal {
    private String tipoPelagem;

    public Mamifero(String tipo, String territorio, String tipoPelagem){
        super(tipo, territorio);
        this.tipoPelagem = tipoPelagem;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }

    public void amamentar(){
        System.out.println("O Animal mamífero amamentando seus filhotes");
    }
}
