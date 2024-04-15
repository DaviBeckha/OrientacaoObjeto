package tudo_de_vetores.exercicio_basicos;

import java.util.Locale;
import java.util.Scanner;

public class VetorBasico {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas vezes repetir");
        int vezesRepetir = sc.nextInt();        // quantas vezes vou querer repetir o vetor no FOR

      double[] vetorPadrao = new double[vezesRepetir];    // criei o vetor e denomimei dentro dele quantas posições ele vai ter

      for (int i=0; i<vezesRepetir; i++) {   // Aqui ele vai captar todos os valores que eu colocar no vetor
          System.out.println("Diga as alturas");
          vetorPadrao[i] = sc.nextDouble(); // aqui ele vai esperar eu digitar

      }
      double somaTotal = 0.0;
      for (int i=0;i<vezesRepetir;i++) {    // Aqui eu estou pegando os números que vieram do vetor acima e somando todos eles.
          somaTotal += vetorPadrao[i] ;     // Aqui ele está começando em 0 mas vai somando com os valores do vetor acima
      }
      double totalConta = somaTotal / vezesRepetir;   // estou divindo todos os valores

        System.out.printf("Total: %.2f", totalConta);  // somente imprindo os valores


    }
}
