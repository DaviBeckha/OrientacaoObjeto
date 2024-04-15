package tudo_de_vetores.exercicio_basicos;

import java.util.Locale;
import java.util.Scanner;

public class VetorAbaixoMedia {
    public static void main(String[] args) {



        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes repetir : ");
        int vezesRepetir = sc.nextInt();

        double [] vetor = new double[vezesRepetir];
        double somaNumeros = 0;

        for (int i =0; i<vezesRepetir;i++) {
            System.out.println("Diga números: ");
            vetor[i] = sc.nextDouble();
            somaNumeros += vetor[i];

        }
        double mediaVetor = somaNumeros/vezesRepetir;
        System.out.printf("A média do vetor é %.2f: ", mediaVetor);

        System.out.println();
        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vezesRepetir; i++) {
            if (vetor[i] < mediaVetor) {
                System.out.println(vetor[i]);
            }
        }

    }
}
