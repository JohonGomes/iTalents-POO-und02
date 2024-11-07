package PolimorfismoSobrescrita;

public class Retangulo extends FiguraGeometrica {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    //Sobrescrevendo (sobrescrita) os metodos de FiguraGeometrica

    @Override //indica que o metodo foi sobrescrito
    public double calcularArea() {
        return comprimento * largura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}
