package tudo_de_vetores.exercicio_basicos;

import java.util.Locale;
import java.util.Scanner;

public class VetoresSomados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números cada vetor vai ter");
        int vezesRepetir = sc.nextInt();

        double [] vetorA = new double[vezesRepetir];
        double [] vetorB = new double[vezesRepetir];
        double [] vetorResultadoAB = new double[vezesRepetir];


        for (int i = 0; i < vezesRepetir; i++) {
            System.out.println("Quais números do vetor A: ");
            vetorA[i] = sc.nextDouble();
        }
        for (int i =0; i<vezesRepetir ;i++){
            System.out.println("Quais números do vetor B: ");
            vetorB[i] = sc.nextDouble();
        }
        for (int i =0; i<vezesRepetir ;i++){
            vetorResultadoAB[i] = vetorA[i] + vetorB[i];
        }
        int mudarPosicao = 1;
        System.out.println("Resultado da soma dos vetores: ");

        for (int i=0; i<vezesRepetir; i++) {
            System.out.println("\n"+"Na posição "+ (mudarPosicao + i) + " valor: "+ vetorResultadoAB[i]);
        }
        sc.close();
    }
}
