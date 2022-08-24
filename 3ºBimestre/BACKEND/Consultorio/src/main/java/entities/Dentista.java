package entities;

public class Dentista {

    private int id;
    private String nome;
    private String email;
    private int cro;
    private boolean convenio;

    public Dentista() {
    }

    public Dentista(int id, String nome, String email, int cro, boolean convenio) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cro = cro;
        this.convenio = convenio;
    }

    public Dentista(String nome, String email, int cro, boolean convenio) {
        this.nome = nome;
        this.email = email;
        this.cro = cro;
        this.convenio = convenio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public boolean isConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cro=" + cro +
                ", convenio=" + convenio +
                '}';
    }
}
