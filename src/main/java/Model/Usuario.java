
package Model;

public class Usuario {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private String alergias;
    private String doencasCronicas;
    private String email;
    private String senha;

    public Usuario() {}

    public Usuario(int id, String nome, int idade, String sexo, String alergias, String doencasCronicas) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.alergias = alergias;
        this.doencasCronicas = doencasCronicas;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    
    public String getAlergias() { return alergias; }
    public void setAlergias(String alergias) { this.alergias = alergias; }
    
    public String getDoencasCronicas() { return doencasCronicas; }
    public void setDoencasCronicas(String doencasCronicas) { this.doencasCronicas = doencasCronicas; }

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}
    
}