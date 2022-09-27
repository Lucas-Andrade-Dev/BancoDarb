package Testesdedados.Contascomsenha;



public class Clientes {
	
	private String nome;
	private String cpf;
	private String profissao;
	private static int total;
	
	public Clientes(String nome, String cpf) {
		
		Clientes.total++;
		this.nome=nome;
		this.cpf=cpf;
	
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public static int getTotal() {
		return Clientes.total;
	}

}
