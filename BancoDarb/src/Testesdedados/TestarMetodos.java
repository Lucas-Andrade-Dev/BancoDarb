package Testesdedados;

public class TestarMetodos {
	
	public static void main(String[] args) {
		
	
		
		Clientes clientes = new Clientes();
		Clientes clientes2 = new Clientes();
		Contas contas = new Contas();
		Contas contas2 = new Contas();
		
		contas.deposito(1600);
		contas.saque(900);
		contas.transferir(200, contas2);
		
		contas.setTitular(clientes);
		contas.getTitular().setNome("Lucas");
		
		contas2.setTitular(clientes2); 
		contas2.getTitular().setNome("Julia");
		
		System.out.println("Mostra saldo: R$"+contas.getSaldo());
		System.out.println("Mostra saldo 2: R$"+contas2.getSaldo());
		System.out.println(Contas.getTotal());
		System.out.println(contas.getTitular().getNome());
		System.out.println(contas2.getTitular().getNome());
		
		
	}

}
