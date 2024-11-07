package Atividade02.exe02;

public class Principal {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero("Terrestre", "Floresta", "Curto");
        Ave ave = new Ave("Voador", "Serrado", true);
        Peixe peixe = new Peixe("Aquatico", "Rios", "Herbivoro");

        System.out.println("Animal " + mamifero.getTipo() + " vive na " + mamifero.getTerritorio() + " e a Pelagem é " + mamifero.getTipoPelagem() + "\n");
        mamifero.amamentar();

        System.out.println("Animal " + ave.getTipo() + " vive na " + ave.getTerritorio() + " e ela " + ave.isCanta() + "\n");
        ave.cantar();

        System.out.println("Animal " + peixe.getTipo() + " vive na " + peixe.getTerritorio() + " e a alimentação é " + peixe.getTipoAlimentacao() + "\n");
        peixe.nadar();

    }
}
