package tudo_de_vetores.estudantes_OO.Entidades;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValorEmEstoque() {

        return preco * quantidade;
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }
    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString() {
        return nome
                +", $ "
                + String.format("%.2f", preco)
                +", "
                + quantidade
                +" unidade, Total: $ "
                + String.format("%.2f", totalValorEmEstoque());
    }
}
