// A classe Pessoa deve ser apenas um modelo de dados (POJO)
public class Pessoa {

    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public Pessoa() {}

    public Pessoa(String nome, String fone, String email) {
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    public Pessoa(int codigo, String nome, String fone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }

    // Getters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Metodo toString para facilitar a visualização dos dados da pessoa
    @Override
    public String toString() {
        return String.format("Código: %d, Nome: %s, Fone: %s, Email: %s", codigo, nome, fone, email);
    }
}