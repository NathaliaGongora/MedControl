
package Model;


public class Conta {

    private int id;
    private String email;
    private String senha;

    public Conta() {
    }

    public Conta(int id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean login(String email, String senha) {
        return this.email.equals(email)
                && this.senha.equals(senha);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
    
    
}