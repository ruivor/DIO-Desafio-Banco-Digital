
public abstract class Conta implements Iconta {

	// constantes

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	// atributos

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	// construtor

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	// getters and setters

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	// metodos

	@Override
	public void sacar(double valor) {
		saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	protected void infosComuns() {
		System.out.println("=========================================");
		System.out.println(String.format("Saldo: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println("=========================================");
		
	}


}
