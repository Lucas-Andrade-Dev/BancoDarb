package Testesdedados;

import java.util.Scanner;

public class TestandoCatch {

		
		private static Scanner ler;
		private static Scanner ler2;
		private static Contas SalvarConta;

		public static void main(String[]args) {
			
		    ler = new Scanner(System.in);
			
			ler2 = new Scanner(System.in);
			
			int op=0;
			String nome="";
			String cpf = "";
			String profissao="";
			
			System.out.println("---------------BancoDarb--------------");
	        System.out.println("Pressione (1) Para Realizar Cadastro");
	        System.out.println("Pressione (2) Para Listar Dados");
	        System.out.println("Pressione (3) Para Acessar Sua Conta");
	        System.out.println("Pressione (5) para Sair");
			System.out.println("--------------------------------------");
			
			while(op!=5) {
				
				Contas contas = new Contas();
				Clientes clientes = new Clientes();
				
				System.out.println("Escolha uma Opção (Ou Aperte 4 para voltar ao Menu)");
				op= ler.nextInt();
				
				switch(op) {
				
				case 5: 
					System.out.println("Finalizando Sistema");
					break;
					
				case 1:
					
					System.out.println("Nome: ");
					nome = ler2.nextLine();
					
					System.out.println("CPF: ");
					cpf= ler.next();
					
					System.out.println("Profissao: ");
					profissao= ler.next();
								
					clientes.novosClientes(nome, cpf, profissao);
					
					clientes.listarCliente(clientes);
					
					contas.novasContas(clientes);
					contas.ListaConta(contas);
					
					System.out.println("Parabens! você recebeu R$100 de bonus por ter finalizado o cadastro");
					contas.deposito(100);
					
					System.out.println("Cadastro Concluido Com Sucesso");
					
					break;
					
				case 2: 
					for(Contas c: Contas.lista) {
						
						System.out.println("---------------------CONTA----------------------\n");
						System.out.println("Agencia: "+c.getAgencia());
						System.out.println("Numero: "+c.getNumero());
						System.out.println("Titular: "+c.getTitular().getNome());
						System.out.println("CPF: "+c.getTitular().getCpf());
						System.out.println("Profissao: "+c.getTitular().getProfissao());
						System.out.println("Saldo Atual: R$"+c.getSaldo()+"\n");
						System.out.println("------------------------------------------------\n");
					}
					
					break;
					
				case 3:
					
					System.out.println("Agencia: ");
					int agencia2 = ler.nextInt();
					
					System.out.println("Numero: ");
					int numero2 = ler.nextInt();
					
					int op2=0;
					
					while(op2!=5) {
					
					for(Contas c3: Contas.lista) {
						
						if(agencia2 == c3.getAgencia() && numero2 == c3.getNumero() ) {
							
							SalvarConta=c3;
									
						}
						
					}
					
					 double deposito=0; double saque=0; int agenciatrans=0;
					 int numerotrans=0; double valor=0;

					System.out.println("---------------------CONTA----------------------\n");
					System.out.println("Agencia: "+SalvarConta.getAgencia());
					System.out.println("Numero: "+SalvarConta.getNumero());
					System.out.println("Titular: "+SalvarConta.getTitular().getNome());
					System.out.println("CPF: "+SalvarConta.getTitular().getCpf());
					System.out.println("Profissao: "+SalvarConta.getTitular().getProfissao());
					System.out.println("Saldo Atual: R$"+SalvarConta.getSaldo()+"\n");
					System.out.println("------------------------------------------------\n");
					
					System.out.println("Bem vindo ao Banco Darb! "+SalvarConta.getTitular().getNome()+"\n");
					System.out.println("Digite(1) para Depositos");
					System.out.println("Digite(2) para Saques");
					System.out.println("Digite(3) para Transferir");
					System.out.println("Digite(5) para Sair");
					System.out.println("----------------------------------------------------------");
					
											
						System.out.println("escolha uma opção (Ou digite 4 para Voltar ao Menu da sua conta)");
						op2 = ler.nextInt();
					
						switch(op2) {
						
						case 1: System.out.println("Digite o valor do Deposito:");
						        deposito=ler.nextDouble();
						        SalvarConta.deposito(deposito);
						        
						        break;
						        
					
						case 2: System.out.println("Digite o valor Do Saque: ");
						        saque = ler.nextDouble();
						        SalvarConta.saque(saque);
						        
						        break;
						        
						case 3: System.out.println("Agencia: ");
						        agenciatrans=ler2.nextInt();
						        
						        System.out.println("Numero:  ");
						        numerotrans=ler2.nextInt();
						        
						        System.out.println("Valor da transferencia: ");
						        valor = ler2.nextDouble();
						        
						       for(Contas c2:Contas.lista) {
						        
						        if(agenciatrans == c2.getAgencia() && numerotrans == c2.getNumero()) {
						        	
						        	SalvarConta.transferir(valor, c2);
						        	
						        	System.out.println("Transferencia para "+c2.getTitular().getNome()+" efetuada com sucesso");
						        }
						        
						       }
						        
						        break;
						        
						case 4:  
							
						System.out.println("---------------------CONTA----------------------\n");
						System.out.println("Agencia: "+SalvarConta.getAgencia());
						System.out.println("Numero: "+SalvarConta.getNumero());
						System.out.println("Titular: "+SalvarConta.getTitular().getNome());
						System.out.println("CPF: "+SalvarConta.getTitular().getCpf());
						System.out.println("Profissao: "+SalvarConta.getTitular().getProfissao());
						System.out.println("Saldo Atual: R$"+SalvarConta.getSaldo()+"\n");
						System.out.println("------------------------------------------------\n");
						
						System.out.println("Bem vindo ao Banco Darb! "+SalvarConta.getTitular().getNome()+"\n");
						System.out.println("Digite(1) para Depositos");
						System.out.println("Digite(2) para Saques");
						System.out.println("Digite(4) para sair");
						System.out.println("----------------------------------------------------------");
						
						break;
						
						case 5: System.out.println("Finalizando Sistema....");
						break;
						
   						
					}
					
						
					}
					
					
					
					break;
					
				case 4:
					
					System.out.println("---------------BancoDarb--------------");
			        System.out.println("Pressione (1) Para Realizar Cadastro");
			        System.out.println("Pressione (2) Para Listar Dados");
			        System.out.println("Pressione (3) Para Acessar Sua Conta");
			        System.out.println("Pressione (5) para Sair");
					System.out.println("--------------------------------------");
					
					break;
					
				}
				
				
				
			}
			
			
		
		}

	

}
