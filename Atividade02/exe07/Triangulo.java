package Atividade02.exe07;

public class Triangulo extends FormaGeometrica {
    private double lado01;
    private double lado02;
    private double lado03;

    public Triangulo(double lado01,double lado02, double lado03){
        this.lado01 = lado01;
        this.lado02 = lado02;
        this.lado03 = lado03;
    }

    @Override
    public double calcularArea() {
        double area = (lado01 + lado02 + lado03) / 2;
        return Math.sqrt(area * ( area - lado01) * ( area - lado02) * (area - lado03));
    }

    @Override
    public double calcularPerimetro() {
        return lado01 + lado02 + lado03;
    }
}
