package tudo_de_vetores.vetor_exercicio_altura_OO;

public class Caracteristica {

    private String name;
    private int idade;
    private double altura;

    public Caracteristica(String name, int idade, double altura) {
        this.name = name;
        this.idade = idade;
        this.altura = altura;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
