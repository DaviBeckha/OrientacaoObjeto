package tudo_de_vetores.vetor_maisvelhos_OO;

public class PessoasCaracteristicas {

    public String nome;
    public int idade;

    public PessoasCaracteristicas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
