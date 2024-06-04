import java.util.Scanner;

public class Cliente {

	private String nome;

	private String numeroConta;
	private int agencia;

	public String getNome() {
		return nome;
	}

	public void setAll() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		this.nome = scanner.next();

		System.out.print("Digite seu agencia: ");
		this.agencia = scanner.nextInt();

		System.out.print("Digite o numero da sua conta: ");
		this.numeroConta = scanner.next();
	}
	
	public int getAgencia() {
		return agencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}
}
