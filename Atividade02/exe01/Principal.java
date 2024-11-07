package Atividade02.exe01;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro("Uno", "2000", 4, "Preto");
        Moto moto = new Moto("XR300", "2024", 291,25);

        System.out.println("Carro: " + carro.getModelo() + " ,número de portas: " + carro.getNumeroDePortas() +  " ,ano: " + carro.getAno() + ",cor:" + carro.getCor());
        System.out.println(carro.abastecer(20)+"\n");


        System.out.println("Carro: " + moto.getModelo() + " ,ano: " + moto.getAno() + " Cilindradas: " + moto.getCilindrada() + " Potência:" + moto.getPotencia());
        moto.ligar();
        moto.desligar();

    }
}
