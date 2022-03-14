package Praticando.Mediano.Login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAutenticador {

    @Test
    public void loginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("claudio", "123");

        Assertions.assertEquals("claudio", u.getLogin());
    }

    @Test
    public void loginfalho() {
        LoginException le = Assertions.assertThrows(LoginException.class, () -> {
            Autenticador a = new Autenticador();
            Usuario u = a.logar("claudido", "1234");
        });

        Assertions.assertEquals("O usuário e a senha não batem.", le.getMessage());
    }

    @Test
    public void informacaoDoErro() {
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("claudido", "1234");
            Assertions.fail();
        } catch (LoginException e) {
            Assertions.assertEquals("claudido", e.getLogin());
        }

    }
}
