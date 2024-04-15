package tudo_de_vetores.pensionato_desafio_OO;

import java.util.Scanner;

public class AlugaQuartos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas cadastrar: ");
        int vezesRepetir = sc.nextInt();

        QuartoCaracteristicas[] quartos = new QuartoCaracteristicas[10];

        for (int i = 1; i <= vezesRepetir; i++) {
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Email: ");
            String email = sc.next();
            System.out.println("Número do quarto: ");
            int numeroQuarto = sc.nextInt();

            quartos[numeroQuarto - 1] = new QuartoCaracteristicas(nome, email);
        }

        System.out.println("Quartos alugados");
        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println((i + 1) + ": " + quartos[i].toString());
            }
        }
        sc.close();
    }
}