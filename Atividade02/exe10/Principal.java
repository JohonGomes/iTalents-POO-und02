package Atividade02.exe10;
/*
10 - Crie uma interface Autenticavel com um metodo autenticar. Implemente essa interface nas classes
Usuario e Administrador. Em seguida, crie uma lista de objetos que implementam Autenticavel e chame o
metodo autenticar para cada um.
*/

public class Principal {
    public static void main(String[] args) {
        // Criando objetos que implementam Autenticavel
        Usuario usuario = new Usuario("user123");
        Administrador administrador = new Administrador("admin123");

        // Testando autenticação
        System.out.println("Autenticação do Usuário: " + usuario.autenticar("user123"));
        System.out.println("Autenticação do Administrador: " + administrador.autenticar("admin123"));
    }
}
