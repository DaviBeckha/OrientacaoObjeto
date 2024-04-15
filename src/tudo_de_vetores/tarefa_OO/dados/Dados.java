package tudo_de_vetores.tarefa_OO.dados;

public class Dados {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido() { // salário liquido
        return salarioBruto - taxa;
    }
    public void incrementarSalario(double incrementa ){ // aqui eu estou incrementando uma porcentagem no salário do homi
        salarioBruto += salarioBruto * incrementa / 100;

    }
    public String toString() { // aqui eu estava aprendendo a fazer strings
        return nome + ", $ " + String.format("%.2f", salarioLiquido());


    }

}
