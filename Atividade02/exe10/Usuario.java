package Atividade02.exe10;

public class Usuario implements Autenticavel{
    private String senha;

    public Usuario(String senha){
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senhaInserida) {
        return senha.equals(senhaInserida);
    }
}
