package HerancaPolimorfismo;

public class Exemplo {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Johon",5000, "TI" );
        Analista analista = new Analista("Frederico", 3000, "Desenvolvimento");

        System.out.println("Bonus gerente " + gerente.getNome() + " : " + gerente.calcularBonus());
        System.out.println("Departamento do gerente " + gerente.getNome() + " : " + gerente.getDepartamento() +"\n");

        System.out.println("Bonus Analista " + analista.getNome() + " : " + analista.calcularBonus());
        System.out.println("Projeto do Analista " + analista.getNome() + " : " + analista.getProjeto());

    }
}
