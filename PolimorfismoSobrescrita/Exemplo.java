package PolimorfismoSobrescrita;

public class Exemplo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        Circulo circulo = new Circulo(4.0);

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retangulo" + retangulo.calcularPerimetro() +"\n");

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo" + circulo.calcularPerimetro());

    }
}
