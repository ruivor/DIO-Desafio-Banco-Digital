import java.time.LocalDateTime;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Digite o nome do Cliente:  ");
		
		String nome =sc.nextLine();
		
		System.out.println("Digite o CPF do cliente: ");
		
		String cpf =sc.nextLine();
		
		LocalDateTime date = LocalDateTime.now();
		
		
		Cliente cliente =new Cliente(nome,cpf,date);
		
		Conta cc = new ContaCorrente(cliente);
		
		System.out.println("Digite o valor do deposito: ");
		double deposito =sc.nextDouble();
		
		cc.depositar(deposito);
		
		cc.imprimirExtrato();
		
		System.out.println("Digite o valor do saque: ");
		double saque =sc.nextDouble();
		
		cc.sacar(saque);
		
		cc.imprimirExtrato();
		
		Conta poupanca = new ContaPoupanca(cliente);
		
		System.out.println("Transferir para poupança: ");
		double transferencia =sc.nextDouble();
		
		cc.transferir(transferencia, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
				
		sc.close();		
				

	}

}
