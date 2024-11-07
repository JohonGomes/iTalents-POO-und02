package HerancasEInterfaces;

public class Exemplo {
    public static void main(String[] args) {
        Passaro passaro = new Passaro("Papagaio");
        Cachorro cachorro = new Cachorro("Fredrico");

        passaro.fazerBarulho();
        passaro.voar();

        cachorro.fazerBarulho();
    }

}
