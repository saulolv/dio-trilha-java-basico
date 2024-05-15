import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametro2 = terminal.nextInt();

        try {
            contar(parametro1, parametro2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser menor que o segundo.");
        }

        int contagem = parametro2 - parametro1;

        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + (1 + i));
        }
    }
}
