package Testesdedados.Contascomsenha;

import java.util.Scanner;

public class testeLogin {
	
	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		double saldo=0; int agencia=0; int numero=0;
		String cpf=""; String nome =""; String senha="";
		
		Clientes clientes = new Clientes(nome,cpf);
		
		Contas contas = new Contas(saldo,agencia,numero,senha,clientes);
		
		
		
		System.out.println("Insira seu cpf");
		cpf = ler.next();
		
		System.out.println("Senha: ");
		senha = ler.next();
		
		contas.setSenha("12345");
		contas.getTitular().setCpf("77777");
		
		if(cpf.equals(contas.getTitular().getCpf()) && senha.equals(contas.getSenha()) ) {
			
			System.out.println("Login Efetuado com sucesso");
			
			
		}else {
			
			System.out.println("Usuario não existente");
		}
		
		
		
		
	}

}
