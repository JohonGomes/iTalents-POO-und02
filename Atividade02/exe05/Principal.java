package Atividade02.exe05;
/*
5 - Adicione um metodo emitirSom à classe base Animal do exercício 2. Sobrescreva esse metodo nas
subclasses para emitir sons específicos de cada tipo de animal
*/

public class Principal {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Terrestre", "Caatinga", "Curta");
        Ave ave = new Ave("Voador", "Florestas", true);
        Peixe peixe = new Peixe("Aquático", "Rios", "Carnívoro");

        System.out.println("Gato é um animal" + mamifero.getTipo() + " seu território " + mamifero.getTerritorio() + " e sua pelagem é : " + mamifero.getTipoPelagem());
        mamifero.emitirSom();
        mamifero.amamentar();
        System.out.println("");

        System.out.println("Aves normalmente são do tipo " + ave.getTipo() + ", seu principal território são as " + ave.getTerritorio() + " e normalmente cantam");
        ave.emitirSom();
        ave.cantar();

        System.out.println("\nPeixe é um tipo " + peixe.getTipo() + " vivem em " + peixe.getTerritorio() + "  mares" + " e podem ser " + peixe.getTipoAlimentacao() + " ou carnívoros");
        peixe.emitirSom();
        peixe.nadar();

    }

}
