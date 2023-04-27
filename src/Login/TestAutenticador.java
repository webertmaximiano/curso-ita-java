package Login;

import org.junit.Test;



import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestAutenticador {
    @Test
    public void testLoginComSucesso() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("webert", "senhadowebert");
        assertEquals("webert", u.getLogin());

    }
    @Test(expected = LoginException.class) // quando se quer que uma exceção ocorra e a teste use o expected
    public void testLoginComFalha() throws LoginException {
        Autenticador a = new Autenticador();
        Usuario u = a.logar("webert", "senhaerradadowebert");
    }

    @Test
    public  void informacaoDoErro() {
        Autenticador a = new Autenticador();
        try {
            Usuario u = a.logar("webert", "senhaerradadowebert");
            fail();
        } catch (LoginException e) {
            assertEquals("webert", e.getLogin());
        }

    }
}
