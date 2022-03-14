package Praticando.Mediano.Login;

public class Autenticador {

    public Usuario logar(String login, String senha) throws LoginException{
        if(login.equals("claudio") && senha.equals("123")) {
            return new Usuario(login);
        }
        throw new LoginException("O usuário e a senha não batem.", login);
    }
}
