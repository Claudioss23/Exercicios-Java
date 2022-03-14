package Praticando.Mediano.Login;

public class LoginException extends Exception{

    private final String login;

    public LoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }
}
