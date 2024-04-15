package tudo_de_vetores.vetor_maisvelhos_OO;

import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas cadastrar: ");
        int vezesRepetir = sc.nextInt();

        PessoasCaracteristicas [] pessoas = new PessoasCaracteristicas[vezesRepetir];

        double maiorIdade = 0;
        int indiceMaiorIdade = 0;

        for (int i = 0; i < vezesRepetir; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Idade do(a) " + nome + ":");
            int idade = sc.nextInt();
            pessoas[i] = new PessoasCaracteristicas(nome, idade);


            if (pessoas[i].getIdade() > maiorIdade) {
                maiorIdade = pessoas[i].getIdade();
                indiceMaiorIdade = i;
            }
        }


        System.out.println("A pessoa mais velha é: " + pessoas[indiceMaiorIdade].getNome() +
                " com " + pessoas[indiceMaiorIdade].getIdade() + " anos.");
    }
}