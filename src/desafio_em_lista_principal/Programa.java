package desafio_em_lista_principal;

import desafio_em_list_OO.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.println("Quantas pessoas registrar: ");
        int qntPessoas = sc.nextInt();

        for (int i = 0; i < qntPessoas;i++) {
            System.out.println("Funcionário #" + (i + 1) + " :");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (temID(list,id)){
                System.out.println("Já existe ! Tente outro ");
                id = sc.nextInt();
            }
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salário: ");
            Double salario = sc.nextDouble();

            Funcionario func = new Funcionario(id,nome,salario);

            list.add(func);
        }
        System.out.println();
        System.out.println("Qual ID de funcionário tem que ter seu salário incrementado: ");
        int idSalario = sc.nextInt();

        Funcionario func = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);

        //Integer pos = temID(list,idSalario);

        if(func == null) {
            System.out.println("Esse ID não existe! ");
        }
        else {
            System.out.println("Diga a porcentagem: ");
            double porcentagem = sc.nextDouble();
            func.IncrementoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionário: ");
        for (Funcionario funci : list) {
            System.out.println(funci);
        }



        sc.close();
    }
    public static boolean temID(List<Funcionario> list,int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func !=null;
    }


    /* public static Integer temID (List<Funcionario> list, int id) {
        for ( int i = 0; i < list.size();i++) {               // Para procurar exatamente
            if (list.get(i).getId() == id) {                 // o ID da pessoa, peguei na live do Nélio Alves
                return i;
            }
        }
        return null;
    } */
}
