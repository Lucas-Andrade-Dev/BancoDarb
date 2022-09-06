package MeusProjetos.BandoDarp;

public class Contas {
	
	double saldo;
	int agencia;
	int numero;
	Clientes titular;
	
	public void deposito(double valor) {
		this.saldo+=valor;
	}
	
	public boolean saque(double valor) {
		if(this.saldo>=valor) {
			this.saldo-=valor;
			System.out.println("Operação Realizada Com Sucesso");
	        return true;		
		}else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}
	
	public boolean transferir(double valor, Contas deposito) {
		if (this.saldo>=valor) {
			this.saldo-=valor;
			deposito.deposito(valor);
			System.out.println("Operação Realizada Com Sucesso");
			return true;
		}else {
			System.out.println("Saldo Insuficiente");
			return false;
		}
	}

}


