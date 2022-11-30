
public class Application {

	public static void main(String[] args) {
		Cliente cliente =new Cliente();
		
		cliente.setNome("Rodrigo");
		
		
		
		Conta cc = new ContaCorrente(cliente);
		
		cc.depositar(100);
		cc.sacar(40);
		
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.transferir(20, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
				
				
				

	}

}
