package matrizes;

import java.util.Scanner;

public class DiagonalPrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho coluna: ");
        int n = sc.nextInt();

        int [] [] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Diga os números: ");
                mat[i][j] = sc.nextInt();
            }
        }


        System.out.println("Diagonal :");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negativo = " + count);


        sc.close();
    }
}