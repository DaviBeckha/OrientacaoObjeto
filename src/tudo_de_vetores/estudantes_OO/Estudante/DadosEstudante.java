package tudo_de_vetores.estudantes_OO.Estudante;

public class DadosEstudante {
    public String nome;
    public int notaPS;  // Primeiro semestre
    public int notaSS;  // Segundo semestre
    public int notaTS;  // Terceiro semestre

    public int notaFinal() {
        return notaPS + notaSS + notaTS; // somatório dos pontos das notas
    }

    public double pontosFaltando() {  // Caso a nota do ser fique faltando pontos, aqui ele mostra quantos irão faltar
        if (notaFinal() < 60.0) {
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }

    public String DadosCompleto() {  // Formando a string completa, aqui eu tava aprendendo direito a fazer isso
        String resultado = nome + "\nNota final: " + notaFinal() + "\n";
        if (notaFinal() >= 60.0) {
            resultado += "Passou";
        } else {
            resultado += "Não passou e faltou: "+ pontosFaltando()+ " Para passar";
        }
        return resultado;
    }
}

