package tudo_de_vetores.tarefa_OO.funcionario;

import tudo_de_vetores.tarefa_OO.dados.Dados;

import java.util.Locale;
import java.util.Scanner;

public class funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Dados dados = new Dados();
        System.out.println("Nome do Funcionário");
        dados.nome = sc.nextLine();
        System.out.println("Salário bruto do Funcionário");
        dados.salarioBruto = sc.nextDouble();
        System.out.println("Quantos de imposto");
        dados.taxa = sc.nextDouble();


        System.out.println("Funcionário: " + dados.nome + " salário R$: " + dados.salarioBruto);

        System.out.println();
        System.out.println("Qual porcentagem devolver do salário");
        double incrementa = sc.nextDouble();
        dados.incrementarSalario(incrementa);

        System.out.println();
        System.out.println("Funcionário " +dados);
        sc.close();

    }


}
