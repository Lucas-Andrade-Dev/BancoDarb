package Testesdedados;


import java.util.Scanner;


public class TestandoListagem {
	
	private static Scanner ler;
	private static Scanner ler2;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
		
		ler2 = new Scanner(System.in);
		
		int op=0;
		
		String nome="";
		String cpf = "";
		String profissao="";
		
		
		while(op!=2) {
			
			System.out.println("Digite 1 para cadastrar ou 2 para sair");
			op= ler.nextInt();
			
			switch(op) {
			
			case 2: 
				System.out.println("Finalizando Sistema");
				break;
				
			case 1:
				
				System.out.println("Nome: ");
				nome = ler2.nextLine();
				
				System.out.println("CPF: ");
				cpf= ler.next();
				
				System.out.println("Profissao: ");
				profissao= ler.next();
							
				Clientes clientes = new Clientes();
				clientes.novosClientes(nome, cpf, profissao);
			    clientes.listarCliente(clientes);
			
				Contas conta = new Contas();
				conta.novasContas(clientes);
				conta.ListaConta(conta);
				
				System.out.println("Parabens! você recebeu R$100 de bonus por ter finalizado o cadastro");
				conta.deposito(100);
				
				break;
				
			}
			
		}
		
		for(Contas c: Contas.lista) {
			
			System.out.println("Agencia: "+c.getAgencia());
			System.out.println("Numero: "+c.getNumero());
			System.out.println("Titular: "+c.getTitular().getNome());
			System.out.println("CPF "+c.getTitular().getCpf());
			System.out.println("Profissao: "+c.getTitular().getProfissao());
			System.out.println("Saldo Atual: R$"+c.getSaldo());
			
		}
		
		
		
	}

}
