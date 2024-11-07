package HerancaPolimorfismo;

public class Analista extends Funcionario {
    private String projeto;

    public Analista(String nome, double salario, String projeto){
        super(nome, salario);
        this.projeto = projeto;
    }

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.05;
    }
}
