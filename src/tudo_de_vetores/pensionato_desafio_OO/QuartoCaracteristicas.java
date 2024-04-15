package tudo_de_vetores.pensionato_desafio_OO;

public class QuartoCaracteristicas {

    private String nome;
    private String email;


    public QuartoCaracteristicas(String nome, String email) {
        this.nome = nome;
        this.email = email;

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


    public String toString() {
        return "Nome: " + nome + ", Email: " + email ;
    }


}
