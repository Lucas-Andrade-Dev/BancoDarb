
	package Testesdedados.Contascomsenha;

	

	
	public class Contas {
		
		private double saldo;
		private int agencia;
		private int numero;
		private String senha;
		private Clientes titular;
		private static int total;

		public  Contas(double saldo, int agencia, int numero,String senha,Clientes titular) {
			
			Contas.total++;
			this.saldo=saldo;
			this.agencia=agencia;
			this.numero=numero;
			this.titular=titular;
			this.senha=senha;
					
		
		}
		
		public void deposito(double valor) {
			this.saldo+=valor;			
		}
		
		public boolean saque(double valor) {
			if(saldo>=valor) {
				this.saldo-=valor;
				return true;
			}else {
				System.out.println("Saldo Insuficiente");
				return false;
			}
			
		}
		
		public boolean transferir(double valor, Contas transferir) {
			  if(saldo>=valor) {
				  this.saldo-=valor;
				  transferir.deposito(valor);
				  return true;
			  }else {
				  System.out.println("Saldo Insuficiente");
				  return false;
			  }
			
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public int getAgencia() {
			return agencia;
		}

		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public Clientes getTitular() {
			return titular;
		}

		public void setTitular(Clientes titular) {
			this.titular = titular;
		}
		
		public static int getTotal() {
			return Contas.total;
		}
		
		public String getSenha() {
			return this.senha;
		}
		
		public void setSenha(String senha) {
			this.senha=senha;
		}
		

		

}
