import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Digite a agência:");
        agencia = scanner.next();

        System.out.println("Digite o nome do cliente:");
        nomeCliente = scanner.next();

        System.out.println("Digite o saldo:");
        saldo = scanner.nextDouble();

        System.err.println("Olá, ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia).concat(" e o número da sua conta é ").concat(String.valueOf(numero)).concat(". Seu saldo atual é de R$").concat(String.valueOf(saldo)).concat("."));
    }
}
