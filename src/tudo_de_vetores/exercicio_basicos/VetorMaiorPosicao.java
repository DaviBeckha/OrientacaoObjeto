package tudo_de_vetores.exercicio_basicos;

import java.util.Locale;
import java.util.Scanner;

public class VetorMaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números colocar: ");
        int vezesRepetir = sc.nextInt();

        double [] vetor = new double[vezesRepetir] ;

        for (int i = 0; i < vezesRepetir;i++) {
            System.out.println("Números: ");
            vetor[i] = sc.nextDouble();
        }
        double maior = 0;
        int maiorPosicao = 0;

        for (int i =1; i<vezesRepetir;i++) {
            if (vetor[i] > maior) {           // se o vetor for maior que a variável "maior"
                maior = vetor[i];             // a "maior" vai receber o valor atual de vetor[i] que é o tudo
                maiorPosicao = i;             // e a "MaiorPosição" vai receber a posição de i para somar;
            }

        }
        System.out.printf("Maior valor = %.1f\n", maior);
        System.out.println("Posição do maior valor: " + (maiorPosicao+1)); // eu botei mais 1 para começar da posição 1.
    }
}
