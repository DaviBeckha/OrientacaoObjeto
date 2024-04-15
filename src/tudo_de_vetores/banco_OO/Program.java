package tudo_de_vetores.banco_OO;


import java.util.Locale;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;   // puxando a classe conta para captar os valores

        System.out.print("Número da conta: ");
        int numero = sc.nextInt();
        System.out.print("Dono da conta: ");
        sc.nextLine();
        String donoConta = sc.nextLine();
        System.out.print("Seu primeiro depósito (y/n) ? ");
        char resposta = sc.next().charAt(0);
        if (resposta == 'y') {
            System.out.print("Entre com seu depósito inicial: ");
            double depositoIncial = sc.nextDouble();   // variável destacada na classe CONTA
            conta = new Conta(numero, donoConta, depositoIncial);  // caso ele queira tenho o construtor na classe conta
                                                                   // Que ele faz essa construção completa da conta
        }
        else {
            conta = new Conta(numero, donoConta);   // caso ele não queira fiz outro construtor somente para criação da conta e nome
        }

        System.out.println();
        System.out.println("Situação da conta: ");
        System.out.println(conta);       // aqui simplesmente pego os valores e mostro em tela

        System.out.println();
        System.out.print("Primeiro depósito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);         // eu instancio ela na variável acima, mas jogo seu valor para deposito em conta
        System.out.println("Situação pós depósito da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Sacar da conta: ");
        double valorSacado = sc.nextDouble();  // eu criei a variável para sacar da conta
        conta.sacar(valorSacado);              // aqui eu boto o valor dela na variável que criei para fazer o saque dela.
        System.out.println("Dados atualizados da conta ");
        System.out.println(conta);

        sc.close();

    }
}