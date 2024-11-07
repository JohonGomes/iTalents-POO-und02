package Atividade02.exe10;

public class Administrador implements Autenticavel{
    private String senhaAdmin;

    public Administrador(String senhaAdmin){
        this.senhaAdmin = senhaAdmin;
    }

    @Override
    public boolean autenticar(String senha) {
        return senhaAdmin.equals(senhaAdmin);
    }

}
