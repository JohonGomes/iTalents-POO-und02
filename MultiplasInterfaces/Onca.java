package MultiplasInterfaces;

public class Onca implements Animal, Nadador{

    @Override
    public void fazerBarulho() {
        System.out.println("Onça fazendo barulho: Rawwwww...");
    }

    @Override
    public void nadar() {
        System.out.println("Onça nadando...");
    }
}
