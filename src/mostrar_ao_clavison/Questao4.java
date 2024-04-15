package mostrar_ao_clavison;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Faça um programa que leia 20 números reais e armazene em um vetor.
Após faça um processamento onde os valores que sejam menores que a média dos
números serão trocados pela média calculada.*/

        System.out.println("Quantos números: ");
        int qntdnumeros = sc.nextInt();

        int[] numeros = new int[qntdnumeros];

        double somaNumeros = 0;
        for (int i = 0; i < qntdnumeros; i++) {
            System.out.println("Diga números");
            numeros[i] = sc.nextInt();
            somaNumeros += numeros[i];
        }

        double mediaDosNumeros = somaNumeros / qntdnumeros;
        for (int i = 0; i < qntdnumeros; i++) {
            if (mediaDosNumeros > numeros[i]) {
                numeros[i] = (int) mediaDosNumeros;
            }
        }

        System.out.println("Números alterados:");
        for (int i = 0; i < qntdnumeros;i++) {
            System.out.println(numeros[i]);
        }
    }
}