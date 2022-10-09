import java.util.Scanner;

public class EntrProcessSaida {
    public static void main(String[] args) {
        float num1 = 0;
        float num2 = 0;
        float num3 = 0;
            float resultadoSoma;
            float resultadoMedia;

            Scanner ler = new Scanner(System.in);
            System.out.printf("Informe o Primeiro número:\n");
            num1 = ler.nextInt();
            System.out.printf("Informe o Segundo número:\n");
            num2 = ler.nextInt();
            System.out.printf("Informe o Terceiro número:\n");
            num3 = ler.nextInt();

            resultadoSoma = num1 + num2 + num3;
            resultadoMedia = resultadoSoma / 3;

            System.out.println("Os números são: ");
            System.out.println("Primeiro");
            System.out.print(num1);
            System.out.println("Segundo: ");
            System.out.print(num2);
            System.out.println("Terceiro: ");
            System.out.print(num3);
            System.out.println("A soma dos números é: ");
            System.out.print(resultadoSoma);
            System.out.println("A média dos números é: ");
            System.out.print(resultadoMedia);
    }
}
