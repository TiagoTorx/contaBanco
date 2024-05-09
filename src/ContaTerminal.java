import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String agency;
        String client;
        double balance;


        System.out.println("Por favor, digite o número da Conta: ");
        number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        agency = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente: ");
        client = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da Conta: ");
        balance = scanner.nextDouble();

        System.out.println("Olá "+ client + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");
    }
}
