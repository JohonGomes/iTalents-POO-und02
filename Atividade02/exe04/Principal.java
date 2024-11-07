package Atividade02.exe04;
/*
4 - Utilizando as classes Carro e Moto do exercício 1, crie um metodo na classe base Veiculo chamado
imprimirInformacoes que seja sobrescrito nas subclasses para exibir informações específicas de cada
veículo.
 */
public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford Ka", "2000", 2, "prata");
        Moto moto = new Moto("Harley", "2021", 1746,93);

        System.out.println("Informações do carro");
        carro.imprimirInformacoes();

        System.out.println("\n Informações da Moto");
        moto.imprimirInformacoes();
    }
}
