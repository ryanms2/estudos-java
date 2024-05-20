import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, Sejam bem vindo! Por favor insira suas credenciais para continuar.");
        System.out.println("Qual o número da conta?");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual o número da agência?");
        String numeroAgencia = scanner.next();

        scanner.nextLine();
        System.out.println("Qual o nome do cliente?");
        String nomeCliente = scanner.nextLine();

        System.out.println("Quando de saldo gostaria de ser adicionado?");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", conta " + numeroConta + " e seu saldo "+ saldo +" já está disponível para saque");
        scanner.close();
    }
}
