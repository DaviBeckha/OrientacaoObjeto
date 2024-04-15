package tudo_de_vetores.exercicio_basicos;


import java.util.Locale;
import java.util.Scanner;

public class VetorMediadePares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números: ");
        int vezesRepetir = sc.nextInt();

        double [] vetor = new double[vezesRepetir];

        for (int i = 0; i < vezesRepetir; i++) {
            System.out.println("Números: ");
            vetor[i] = sc.nextDouble();

        }


        System.out.println();
        System.out.println("Média dos pares: ");

        double somaPares = 0;
        double numeroDePar = 0;


        for (int i = 0; i < vezesRepetir; i++) {
            if (vetor[i] % 2 == 0 ) {
              somaPares += vetor[i];
              numeroDePar++;
            }
        }
        if (numeroDePar == 0) {
            System.out.println("Não há nenhum número par.");
            System.exit(0);  // Encerra o programa imediatamente, descobri hoje 29/02/2024 hehe
        }

        double mediaPares = somaPares/numeroDePar;
         System.out.println("Media " + mediaPares);


    }
}
