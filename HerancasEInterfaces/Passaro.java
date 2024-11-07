package HerancasEInterfaces;

public class Passaro extends Animal implements Voador {

    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " esta voando pelo céu!");
    }
}
