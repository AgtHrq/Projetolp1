
package social;

public class Cadastro {
    private String login;
    private String senha;
    private String nome;

    public Cadastro(String login, String senha, String nome) {
        
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
        
}
