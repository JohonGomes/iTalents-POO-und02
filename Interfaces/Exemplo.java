package Interfaces;

public class Exemplo {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerBarulho();
        cachorro.comer();
        System.out.println("");
        gato.fazerBarulho();
        gato.comer();

        System.out.println(cachorro.TIPO_ANIMAL);

    }
}
