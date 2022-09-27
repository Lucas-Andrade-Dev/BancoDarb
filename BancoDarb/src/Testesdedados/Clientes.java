package Testesdedados;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
	
	static List<Clientes> lista = new ArrayList<>();
	private String nome;
	private String cpf;
	private String profissao;
	private static int total;
	
	public void novosClientes(String nome, String cpf, String profissao) {
		
		Clientes.total++;
		this.nome=nome;
		this.cpf=cpf;
		this.profissao = profissao;
		
	}
	
	public boolean listarCliente(Clientes clientes) {
		return lista.add(clientes);
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
