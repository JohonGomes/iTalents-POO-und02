package HerancasEInterfaces;

public class Cachorro extends Animal{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println("Auu auuuu");
    }
}
