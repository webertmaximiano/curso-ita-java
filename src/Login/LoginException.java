package Login;

public class LoginException extends Exception{

    private String login;
    public LoginException(String message, String login) {
        super(message);
        this.login = this.login;
    }
    public String getLogin(){
        return login;
    }
}
