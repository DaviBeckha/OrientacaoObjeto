package tudo_de_vetores.vetor_oo_dois;

public class Private {

    private String name;
    private double preco;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Private(String name, double preco) {
        this.name = name;
        this.preco = preco;


    }
}

