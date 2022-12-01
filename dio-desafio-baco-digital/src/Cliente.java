import java.time.LocalDateTime;

public class Cliente {
	private String nome;
	private String cpf;
	private LocalDateTime dataConta;

	// construtor

	public Cliente(String nome, String cpf, LocalDateTime dataConta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataConta = dataConta;
	}

	// getters and setters

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDateTime getDataConta() {
		return dataConta;
	}

	public void setDataConta(LocalDateTime dataConta) {
		this.dataConta = dataConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
