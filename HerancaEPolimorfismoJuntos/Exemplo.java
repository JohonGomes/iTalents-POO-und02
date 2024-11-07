package HerancaEPolimorfismoJuntos;

public class Exemplo {
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari", "F50", 2);

        carro.Acelerar();
        carro.Abastecer();
        carro.Abastecer(50);
    }
}
