package tudo_de_vetores.estudantes_OO.Entidades;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        Produto produto = new Produto();
        System.out.println("Bote a quantidade do produto");
        System.out.println("Nome do produto");
        produto.nome = sc.nextLine();
        System.out.println("Preço do produto: ");
        produto.preco = sc.nextDouble();
        System.out.println("Quantidade em estoque: ");
        produto.quantidade = sc.nextInt();


        System.out.println();
        System.out.println("Produto escolhido: " +produto);

        System.out.println();
        System.out.println("Número de produtos para ser adicionado em estoque");
        int quantidade = sc.nextInt();
        produto.addProduto(quantidade);


        System.out.println();
        System.out.println("Estoque atualizado: " + produto);

        System.out.println();
        System.out.println("Número de produtos para serem removidos ");
        quantidade = sc.nextInt();
        produto.removeProduto(quantidade);

        System.out.println();
        System.out.println("Estoque atualizado: " + produto);


    }
}
