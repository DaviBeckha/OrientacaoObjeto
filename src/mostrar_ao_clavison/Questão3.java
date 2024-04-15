package mostrar_ao_clavison;

import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários cadastrar: ");
        int qntsFuncionarios = sc.nextInt();

        String[] nome = new String[qntsFuncionarios];
        double[] salario = new double[qntsFuncionarios];
        double[] novoSalario = new double[qntsFuncionarios];

        for (int i = 0; i < qntsFuncionarios; i++) {
            System.out.println("Nome do funcionário: ");
            nome[i] = sc.next();
            System.out.println("Salário funcionário: ");
            salario[i] = sc.nextDouble();
        }
        System.out.println("Salário atual de todos os funcionários");
        for (int i = 0; i < qntsFuncionarios; i++) {
            System.out.println(nome[i] + " salário: " + salario[i]);
        }
        System.out.println("Salário atualizados dos funcionários: ");
        for (int i = 0; i < qntsFuncionarios; i++) {
            if (salario[i] <= 400) {
                novoSalario[i] = salario[i]+(salario[i] * 0.25);
            } else if (salario[i] <= 600) {
                novoSalario[i] = salario[i]+(salario[i] * 0.20);
            } else if (salario[i] <= 800) {
                novoSalario[i] = salario[i]+(salario[i] * 0.15);
            } else {
                novoSalario[i] = salario[i]+(salario[i] * 0.10);
            }
        }
        for (int i = 0; i < qntsFuncionarios; i++) {
            System.out.println(nome[i] + " novo salário: " + novoSalario[i]);
        }
    }
}
