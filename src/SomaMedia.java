public class SomaMedia {
    
    public static void main (String[] args) {
        // Declarando variáveis
        String nomeAlg;
        int resultadoSoma;
        float resultadoMedia;
        float resultadoMedia2;

        // Cálculos
        nomeAlg = "Soma e Média";
        resultadoSoma = 5 + 10 + 5;
        resultadoMedia = (5+10+5) / 3;
            // OU
        resultadoMedia2 = resultadoSoma / 3;

        // Saída para tela
        System.out.print("Nome do algoritmo: " + nomeAlg);
        System.out.print("Resultado da Soma: ");
        System.out.println(resultadoSoma);
        System.out.print("Resultado da Média: ");
        System.out.println(resultadoMedia);
        System.out.print("Resultado da Média usando a variável resultadoSoma: ");
        System.out.println(resultadoMedia2);
    }
}
