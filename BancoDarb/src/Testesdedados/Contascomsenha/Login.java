package Testesdedados.Contascomsenha;

public class Login {
	
	private String cpf;
	private String senha;
	private Contas conta;
	private Clientes clientes;
	private static int total;
	
	public Login(String cpf,String senha, Contas conta, Clientes clientes) {
		
		Login.total++;
		this.cpf=cpf;
		this.senha=senha;
		this.conta=conta;
		this.clientes=clientes;
		
		
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Contas getConta() {
		return conta;
	}
	public void setConta(Contas conta) {
		this.conta = conta;
	}
	
	public static int getTotal() {
		return Login.total;
	}
	
	public Clientes getClientes() {
		return clientes;
	}
	
	public void setClientes(Clientes clientes) {
		this.clientes=clientes;
	}

	
	

}
