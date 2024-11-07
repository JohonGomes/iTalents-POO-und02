package Heranca;

public class Exemplo {
    public static void main(String[] args) {
        //Instanciando os objetos
        Carro carro = new Carro("Toyota", "Corolla", 5);
        Moto moto = new Moto("Honda", "CBR", 600);

        //mudando os valores
        carro.setModelo("Toyota Super");
        carro.setPortas(3);

        moto.setModelo("CBR+");
        moto.setCilindradas(700);

        //Exibindo os valores dos objetos
        System.out.println("---Carro--- ");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Números de portas: " + carro.getPortas() +"\n");

        System.out.println("---Moto--- ");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Números de Cilindradas: " + moto.getCilindradas());
    }
}
