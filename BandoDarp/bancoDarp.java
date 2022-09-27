package Testesdedados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class BancoDarbRascunho  {

	
	
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
					BancoDarbRascunho window = new BancoDarbRascunho();
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
	public BancoDarbRascunho() {
		initialize();
	}
	
	//public

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		String nome="";
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucas\\OneDrive\\Imagens\\icon2.png"));
		frame.setBounds(100, 100, 645, 471);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//frame.setBackground(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucas\\OneDrive\\Imagens\\BancoDarblogo.png"));
		
		JLabel lblNewLabel = new JLabel("Bem Vindo Ao Banco Darb! "+nome);
		lblNewLabel.setBounds(144, 57, 361, 57);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setToolTipText("");
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione Uma Opção:");
		lblNewLabel_1.setBounds(219, 137, 217, 31);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		       Cadastro.main(null);
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(213, 179, 168, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Entrar.main(null);
			}
		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEntrar.setBounds(213, 227, 168, 37);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnListarDados = new JButton("Listar Dados");
		btnListarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
			}
		});
		btnListarDados.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnListarDados.setBounds(213, 274, 168, 37);
		frame.getContentPane().add(btnListarDados);
		
		JLabel backGround = new JLabel("");
		backGround.setIcon(new ImageIcon("C:\\Users\\lucas\\OneDrive\\Imagens\\backgroundbancodarb.png"));
		backGround.setBounds(0, 0, 629, 432);
		frame.getContentPane().add(backGround);
		
	}
}
