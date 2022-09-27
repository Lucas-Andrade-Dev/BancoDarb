package Testesdedados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AreaCliente extends Entrar {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
		    for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
		    	if("Nimbus".equals(info.getName())) {
		    		javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    		break;
		    	}
		    }
		
	}catch(ClassNotFoundException | InstantiationException |IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex){
		System.err.println(ex);
	}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaCliente window = new AreaCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AreaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucas\\OneDrive\\Imagens\\icon2.png"));
		frame.setBounds(100, 100, 454, 345);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSaldo = new JLabel("Saldo: R$");
		lblSaldo.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblSaldo.setBounds(25, 141, 146, 66);
		frame.getContentPane().add(lblSaldo);
		
		//Logar();
		System.out.println(addagencia);
		System.out.println(addnumero);
		
	    for(Contas c: Contas.lista) {
			
	    	if(c.getAgencia()==addagencia && c.getNumero()==addnumero) {
			
	    		JLabel lblNewLabel = new JLabel("Olá! "+c.getTitular().getNome());
	    		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 14));
	    		lblNewLabel.setBounds(25, 68, 192, 47);
	    		frame.getContentPane().add(lblNewLabel);
	    		
	    		JLabel lblAgencia = new JLabel("Agencia:"+c.getAgencia());
	    		lblAgencia.setFont(new Font("Arial Black", Font.PLAIN, 14));
	    		lblAgencia.setBounds(25, 11, 204, 57);
	    		frame.getContentPane().add(lblAgencia);
	    		
	    		JLabel lblAgencia_1 = new JLabel("Numero:"+c.getNumero());
	    		lblAgencia_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
	    		lblAgencia_1.setBounds(25, 38, 204, 57);
	    		frame.getContentPane().add(lblAgencia_1);
	    		
	    		lblSaldo.setText("Saldo R$ "+c.getSaldo() );
	    		
	    		JButton btnDeposito = new JButton("Deposito");
	    		btnDeposito.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				
	    			double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor"));
	    			int res = JOptionPane.showConfirmDialog(null,"O valor digitado foi R$"+valor);
	    			if(res==0) {
	    				c.deposito(valor);
	    				
	    			    lblSaldo.setText("Saldo R$"+c.getSaldo());
	    				
	    				
	    			}
	    				
	    			}
	    		});
	    		btnDeposito.setFont(new Font("Arial Black", Font.PLAIN, 13));
	    		btnDeposito.setBounds(25, 230, 114, 47);
	    		frame.getContentPane().add(btnDeposito);
	    		
	    		JButton btnSaque = new JButton("Saque");
	    		btnSaque.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				
	    			double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor"));
	    			int res = JOptionPane.showConfirmDialog(null,"O valor digitado foi R$"+valor);
	    			if(res==0) {
	    				c.saque(valor);
	    				lblSaldo.setText("Saldo R$"+c.getSaldo());
	    			}
	    				
	    			}
	    		});
	    		btnSaque.setFont(new Font("Arial Black", Font.PLAIN, 13));
	    		btnSaque.setBounds(149, 230, 114, 47);
	    		frame.getContentPane().add(btnSaque);
	    		
	    		JButton btnTransferir = new JButton("Transferir");
	    		btnTransferir.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    				
	    			int agencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Agencia: "));
	    			int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero: "));
	    	 	    double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor"));
	    			
	    	 	    for(Contas c2: Contas.lista) {
	    	 	    	
	    	 	    	if(c2.getAgencia()==agencia && c2.getNumero()==numero) {
	    	 	    		
	    	 	    int res = JOptionPane.showConfirmDialog(null,"Transferir R$"+valor+" Para "+c2.getTitular().getNome());
	    			if(res==0) {
	    				c.transferir(valor, c2);
	    				lblSaldo.setText("Saldo R$"+c.getSaldo());
	    			}
	    	 	 }  				
	    	}
	    	 	    
	    }
	   });
	    		btnTransferir.setFont(new Font("Arial Black", Font.PLAIN, 13));
	    		btnTransferir.setBounds(273, 230, 114, 47);
	    		frame.getContentPane().add(btnTransferir);
	    		
	    		JLabel lblNewLabel_2 = new JLabel("");
	    		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lucas\\OneDrive\\Imagens\\fundoareacliente.png"));
	    		lblNewLabel_2.setBounds(0, 0, 438, 306);
	    		frame.getContentPane().add(lblNewLabel_2);
	    		
			
	    	}
		}
	    	
	}
}
 