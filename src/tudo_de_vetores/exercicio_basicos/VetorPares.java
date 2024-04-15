package tudo_de_vetores.exercicio_basicos;

import java.util.Locale;
import java.util.Scanner;

public class VetorPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos número repetir: ");
        int vezesrepetir = sc.nextInt();

        int[] vetor = new int[vezesrepetir];


        for (int i = 0; i < vezesrepetir; i++) {
            System.out.println("Números: ");
            vetor[i] = sc.nextInt();

        }
        int qntdPar = 0;
        for (int i = 0; i < vezesrepetir;i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println("Número par: " + vetor[i]);     // Aqui o meu intuito é pegar a quatindade de pares
                qntdPar++;
            }

        }
        System.out.println("Números de pares : "+qntdPar);
    }
}





