package tudo_de_vetores.vetor_oo_dois_main;

import tudo_de_vetores.vetor_oo_dois.Private;
import java.util.Locale;
import java.util.Scanner;


public class Principale {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos: ");
        int vezesRepetir = sc.nextInt();

        Private[] vetor = new Private[vezesRepetir];

        for (int i = 0; i< vetor.length; i++) {
            sc.nextLine();    // quebra de linha
            System.out.println("Nome produtos: ");
            String name = sc.nextLine();           // armazenando o nome deste produto
            System.out.println("Preço produto: ");
            double preco = sc.nextDouble();        // armazenando o preço deste produto
            vetor[i] = new Private(name,preco);    // instancie o armazenamento para este produto com seu construtor
                                                   // assim foi criado seu produto com nome e preco
        }
        double soma = 0.0;                       // guardar o valor da soma deles
        for (int i =0; i < vetor.length; i++) {  // vetor.length é para pegar todos os itens que estão dentro do vetor
            soma += vetor[i].getPreco();          // Eu acesso o vetor e quero somente somar o preço dele
                                                  // Então eu tenho que puxar somente o preco( get.preco) dele criado, se não
                                                  // Vou acabar puxando todas as informações como o nome exemplo
        }

        double media = soma/vezesRepetir;            // média
        System.out.printf("Média dos preços deles =  " + media);
        sc.close();
    }
}

