package MultiplasInterfaces;

public class Exemplo {
    public static void main(String[] args) {
        Pato pato = new Pato();
        Onca onca = new Onca();

        pato.fazerBarulho();
        pato.nadar();
        pato.voar();

        System.out.println("");
        onca.fazerBarulho();
        onca.nadar();

    }
}
