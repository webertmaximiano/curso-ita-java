package Login;

public class Autenticador {

    public Usuario logar(String login, String senha) throws LoginException{
        if (login.equals("webert") && senha.equals("senhadowebert")) {
            return new Usuario(login);
        }
        throw new LoginException("Usuario ou Senha Inválidos", login);
    }
}
