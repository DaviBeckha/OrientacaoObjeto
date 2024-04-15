package tudo_de_vetores.dollar_OO;

import java.util.Locale;
import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        /*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa
          em reias. Informar quantos  reias a pessoa vai pagar pelos dólares, considerando ainda que a pessoa tera
          tera que pagar 6% de IOF sobre o valor em dólar. Cria uma classe Convertedor para ser responsável pelos
          cálculos*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos está a cotação atual do dólar: ");
        Convertedor.dolar = sc.nextDouble();

        System.out.println("Quantos reais deseja converter para dólar: ");
        Convertedor.reais = sc.nextDouble();
        System.out.println("");
        System.out.println("Para lhe informar você deve pagar 6% de IOF ");
        System.out.println("");
        System.out.println
                ("Cotação atual do dólar: " + Convertedor.dolar +"\n" +
                 "Quantos dólares deseja: "+ Convertedor.reais + "\n" +
                        "Valor total a gastar : "+ Convertedor.converterReais()+ "\n" +
                        "Valor total a gastar com impostos : " +Convertedor.imposto());


    }
}
