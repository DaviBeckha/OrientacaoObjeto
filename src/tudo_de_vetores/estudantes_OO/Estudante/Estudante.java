package tudo_de_vetores.estudantes_OO.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Estudante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       DadosEstudante dadosestudante = new DadosEstudante();

        System.out.println("Nome do aluno: ");
        dadosestudante.nome = sc.nextLine();
        System.out.println("Nota do primeiro semestre: ");
        dadosestudante.notaPS = sc.nextInt();
        System.out.println("Nota do segundo semestre: ");
        dadosestudante.notaSS = sc.nextInt();
        System.out.println("Nota do terceiro semestre: ");
        dadosestudante.notaTS = sc.nextInt();


        System.out.println(dadosestudante.DadosCompleto());




    }
}
