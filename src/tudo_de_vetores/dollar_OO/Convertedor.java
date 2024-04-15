package tudo_de_vetores.dollar_OO;

public class Convertedor {

    public static double dolar = 0;
    public static double reais = 0;



    public static double converterReais (){  // Simples, ele converte o dollar.
        return reais * dolar;
    }

    public static double imposto() {      // como possuem imposto, criei essa função para cobrar o imposto :P
        double impostoCobrado = converterReais();
        return impostoCobrado + (impostoCobrado * 0.06);

    }

}
 /* public String ParaTexto () {
        return " Cotação atual: "+dolar+"\n" +
                "Quantos dólares deseja: "+reais+"\n" +
                "Quantos de imposto cobrado : "+ converterReais(dolar,reais);
    }
*/
