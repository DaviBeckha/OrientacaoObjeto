package tudo_de_vetores.banco_OO;


public class Conta {

    private int numero;
    private String donoConta;
    private double balanca;

    public Conta(int numero, String donoConta) {  // construtor caso a resposta seja N
        this.numero = numero;
        this.donoConta = donoConta;
    }

    public Conta(int numero, String donoConta, double depositoIncial) {   // construtor se a resposta for Y
        this.numero = numero;
        this.donoConta = donoConta;
        deposito(depositoIncial);   // eu pego o valor do depósito inicial, crio uma função com nome dela
    }                               // e faço o a inserção desse valor na função

    public int getNumero() {      // mema porra de tudo abaixo escrevi de baixo pra cima kkkk
        return numero;
    }

    public String getDonoConta() {       // pega o nome pelo gets
        return donoConta;
    }

    public void setDonoConta(String donoConta) {   // Setar o nome do dono da conta puxado do main
        this.donoConta = donoConta;
    }

    public double getBalanca() {          // pegar o valor
        return balanca;
    }

    public void deposito(double total) {    // balança se refere ao dinheiro total da conta
        balanca += total;
    }

    public void sacar(double total) {  // eles possuem taxa para sacar o dinheiro
        balanca -= total + 5.0;
    }

    public String toString() {
        return "Conta : "
                + numero
                + ", Dono : "
                + donoConta
                + ", Balança : $ "
                + String.format("%.2f", balanca);
    }
}