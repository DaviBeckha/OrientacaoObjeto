package tudo_de_vetores.exercicio_basicos;

import java.util.Locale;
import java.util.Scanner;

public class VetordeNegativos {
    public static void main(String[] args) {

        // em teoria era para ter sido separado mas acabei fazendo tudo nesta mesma classe
        // a atividade dizia só para negativos,positivos,media e valores. Fiz tudo aqui
        // pois já tem uma parcela de coisas aqui.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai digitar: ");
        int vezesRepetir = sc.nextInt();


        double[]vetor = new double[vezesRepetir];                        // criei o vetor padrão


        for (int i = 0; i < vezesRepetir; i++) {
            System.out.println("Digite os números");                   // Aqui ele vai pegar quantas vezes irá repetir
            vetor[i] = sc.nextDouble();
        }
        System.out.println("\nValores digitados:");                   // Aqui eu pego todos os valores digitados
        for (int i = 0; i < vetor.length; i++) {                      // só fazer um novo for e taca-le aqui dentro e vrau
            System.out.println(vetor[i]);
        }
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {     //
            if (vetor[i] < 0)                                           // aqui o vetor tem que vir primeiro para a condição pegar os negativos
            System.out.println("Números negativos: "+ vetor[i]);       // vetor na posição de i porque ele vai separar os negativos de cima
        }
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0)
                System.out.println("Números positivos: " + vetor[i]);
        }
        System.out.println("");
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {              // aqui fiz as somas
               soma += vetor[i];
        }
        double media = soma / vezesRepetir;                        // Aqui só fiz a média
        System.out.println("");
        System.out.printf("Soma dos números : "+soma+ "\n"
                           +"\nMédia dos números: "+media);
    }

}
