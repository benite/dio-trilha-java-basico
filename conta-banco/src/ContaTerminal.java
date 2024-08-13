import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é " + agencia + ", conta " + numero);
        System.out.println("Seu saldo " + saldo + " já está disponível");
    }
}
