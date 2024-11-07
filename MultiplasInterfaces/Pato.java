package MultiplasInterfaces;

public class Pato implements Animal, Voador, Nadador {

    @Override
    public void fazerBarulho() {
        System.out.println("Pato fazendo barulho : Quack");
    }

    @Override
    public void nadar() {
        System.out.println("Pato nadando...");
    }

    @Override
    public void voar() {
        System.out.println("Pato voando...");
    }
}
