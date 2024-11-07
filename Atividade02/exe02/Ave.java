package Atividade02.exe02;

public class Ave extends Animal{
    private boolean canta;

    public Ave(String tipo, String territorio, boolean canta){
        super(tipo, territorio);
        this.canta = canta;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    public void cantar(){
        if(canta){
            System.out.println("O pássaro está cantando");
        }else{
            System.out.println("Esse pássaro não canta!");

        }
    }
}
