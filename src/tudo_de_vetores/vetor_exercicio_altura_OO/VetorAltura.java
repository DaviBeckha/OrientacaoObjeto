package tudo_de_vetores.vetor_exercicio_altura_OO;

import java.util.Locale;
import java.util.Scanner;



public class VetorAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas: ");
        int vezesrepetir = sc.nextInt();
        sc.nextLine();

        Caracteristica[] vetor = new Caracteristica[vezesrepetir];

        double somaAlturas = 0.0;
        double menorDe16 = 0;

        for (int i = 0; i < vezesrepetir; i++) {
            System.out.println("Nome da pessoa: ");
            String name = sc.nextLine();
            System.out.println("Idade da pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.println("Altura da pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            vetor[i] = new Caracteristica(name, idade, altura);

            somaAlturas += altura;

            if (idade < 16) {
                menorDe16++;
            }
        }                   // Essa chave fecha o for, eu to falando isso porque eu fui besta e não tava fechando direito antes kkk...
                            // Erro de iniciante acontece... 15 min tentando entender

            double mediaAlturas = somaAlturas / vezesrepetir;
            double porcentagemDezesseis = (menorDe16/vezesrepetir) * 100;

            System.out.println("Dados da pessoas ");
            for (Caracteristica pessoa : vetor) {
                if (pessoa != null) {
                    System.out.println("Nome: " + pessoa.getName());
                    System.out.println("Idade: " + pessoa.getIdade());
                    System.out.println("Altura: " + pessoa.getAltura());
                    System.out.println("");
                }
            }

            System.out.printf("A média de altura entre elas foi: %.2f.\n", mediaAlturas);
            System.out.printf("Pessoas com menos de 16 anos: %.0f%%\n", porcentagemDezesseis);



        sc.close();
    }

}
