import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o numero da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu saldo: R$");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já esta disponível para saque.");
        }
}