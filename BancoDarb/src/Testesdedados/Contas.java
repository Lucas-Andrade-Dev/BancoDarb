
	package Testesdedados;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
	
	public class Contas {
		
		Random aleatorio = new Random();
		static List<Contas> lista = new ArrayList<>();
		private double saldo;
		private int agencia;
		private int numero;
		private Clientes titular;
		private static int total;

		public void novasContas(Clientes titular) {
			
			Contas.total++;
			//this.saldo=saldo;
			this.agencia=100;
			this.numero=aleatorio.nextInt(1,1000);
			this.titular=titular;
			
		
		}
		
		public boolean ListaConta(Contas conta) {
			return lista.add(conta);
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
		

		

}
