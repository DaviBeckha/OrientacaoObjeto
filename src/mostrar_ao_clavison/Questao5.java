package mostrar_ao_clavison;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu =
                "1- Mostrar produtos com menos de 10 unidades no estoque\n" +
                        "2- Mostrar produtos que custam mais de R$100,00 e têm mais de 10 unidades no estoque\n" +
                        "3- Mostrar o produto com o menor estoque\n" +
                        "4- Mostrar o estoque do produto com o maior preço\n" +
                        "5- Mostrar o percentual de produtos com estoque zerado\n" +
                        "6- Sair";

        int qntdMercadoria;
        System.out.println("Quantas mercadorias cadastrar: ");
        qntdMercadoria = sc.nextInt();

        String[] produto = new String[qntdMercadoria];
        int[] quantidade = new int[qntdMercadoria];
        double[] preco = new double[qntdMercadoria];

        for (int i = 0; i < qntdMercadoria; i++) {
            System.out.println("Qual o produto: ");
            produto[i] = sc.next();
            System.out.println("Qual a quantidade: ");
            quantidade[i] = sc.nextInt();
            System.out.println("Qual o preço: ");
            preco[i] = sc.nextDouble();
        }

        int resposta;

        do {
            System.out.println(menu);
            resposta = sc.nextInt();

            switch (resposta) {
                case 1:
                    for (int i = 0; i < qntdMercadoria; i++) {
                        if (quantidade[i] < 10) {
                            System.out.println(produto[i] + " quantidade: " + quantidade[i]);
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < qntdMercadoria; i++) {
                        if (preco[i] > 100 && quantidade[i] > 10) {
                            System.out.println(produto[i] + " quantidade: " + quantidade[i] + " preço: " + preco[i]);
                        }
                    }
                    break;
                case 3:
                    int menorEstoque = quantidade[0];
                    String produtoMenorEstoque = produto[0];
                    for (int i = 1; i < qntdMercadoria; i++) {
                        if (quantidade[i] < menorEstoque) {
                            menorEstoque = quantidade[i];
                            produtoMenorEstoque = produto[i];
                        }
                    }
                    System.out.println("Produto com o menor estoque: " + produtoMenorEstoque + ", Quantidade: " + menorEstoque);
                    break;
                case 4:
                    int maiorPrecoIndex = 0;
                    for (int i = 1; i < qntdMercadoria; i++) {
                        if (preco[i] > preco[maiorPrecoIndex]) {
                            maiorPrecoIndex = i;
                        }
                    }
                    System.out.println("Estoque do produto com maior preço: " + quantidade[maiorPrecoIndex]);
                    break;
                case 5:
                    int produtosEstoqueZero = 0;
                    for (int i = 0; i < qntdMercadoria; i++) {
                        if (quantidade[i] == 0) {
                            produtosEstoqueZero++;
                        }
                    }
                    double percentualEstoqueZero = ((double) produtosEstoqueZero / qntdMercadoria) * 100;
                    System.out.println("Percentual de produtos com estoque zerado: " + percentualEstoqueZero + "%");
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (resposta != 6);


    }
}