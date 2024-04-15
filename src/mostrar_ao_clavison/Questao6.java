package mostrar_ao_clavison;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = "\nMENU:\n" +
                "1 - Cadastrar contato\n" +
                "2 - Buscar contato por nome\n" +
                "3 - Buscar contato por telefone\n" +
                "4 - Sair\n" +
                "Escolha uma opção:";

        String[] nomes = new String[100];
        String[] telefones = new String[100];
        int totalContatos = 0;

        int opcao;
        do {
            System.out.println(menu);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (totalContatos < 100) {
                        System.out.println("Digite o nome do contato:");
                        String nome = sc.next();
                        System.out.println("Digite o telefone do contato:");
                        String telefone = sc.next();

                        nomes[totalContatos] = nome;
                        telefones[totalContatos] = telefone;
                        totalContatos++;

                        System.out.println("Contato cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de contatos atingido (100 contatos).");
                    }
                    break;
                case 2:
                    System.out.println("Digite o nome do contato a ser buscado:");
                    String nomeBusca = sc.next();
                    boolean encontradoNome = false;
                    for (int i = 0; i < totalContatos; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Nome: " + nomes[i] + ", Telefone: " + telefones[i]);
                            encontradoNome = true;
                        }
                    }
                    if (!encontradoNome) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o telefone do contato a ser buscado:");
                    String telefoneBusca = sc.next();
                    boolean encontradoTelefone = false;
                    for (int i = 0; i < totalContatos; i++) {
                        if (telefones[i].equals(telefoneBusca)) {
                            System.out.println("Nome: " + nomes[i] + ", Telefone: " + telefones[i]);
                            encontradoTelefone = true;
                        }
                    }
                    if (!encontradoTelefone) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 4);

        sc.close();
    }
}

