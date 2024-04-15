package matrizes;

import java.util.Scanner;

public class DesafioSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contasMes [] [] = new int[4] [12];

        for (int i = 0; i < 4;i++){
            for (int j = 0; i<12;i++){
                System.out.println("Quantas contas");
                contasMes [i] [j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4;i++){
            for (int j = 0; i<12;i++){
                System.out.println();
            }
        }
    }
}
