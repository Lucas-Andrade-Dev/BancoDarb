package Testesdedados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;


import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;



import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Cadastro {

	private JFrame frame;
	private JTextField nome2;
	private JTextField cpf2;
	private JTextField profissao2;
	

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
					Cadastro window = new Cadastro();
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
	public Cadastro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucas\\OneDrive\\Imagens\\icon2.png"));
		frame.setBounds(100, 100, 272, 299);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Area De Cadastro");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 5, 235, 68);
		frame.getContentPane().add(lblNewLabel);
		
		nome2  = new JTextField();
		nome2.setBounds(10, 84, 199, 25);
		frame.getContentPane().add(nome2);
		nome2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 66, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CPF:");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(10, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		cpf2 = new JTextField();
		cpf2.setColumns(10);
		cpf2.setBounds(10, 131, 199, 25);
		frame.getContentPane().add(cpf2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Profissão:");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(10, 158, 127, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		profissao2 = new JTextField();
		profissao2.setColumns(10);
		profissao2.setBounds(10, 176, 199, 25);
		frame.getContentPane().add(profissao2);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			
	public void actionPerformed(ActionEvent e) {
				  
		  String nome = nome2.getText();
		  String cpf = cpf2.getText();
		  String profissao= profissao2.getText();
		  
		  Clientes clientes = new Clientes();
		  clientes.novosClientes(nome, cpf, profissao);
		  clientes.listarCliente(clientes);
		  
		  Contas contas = new Contas();
		  contas.novasContas(clientes);
		  contas.ListaConta(contas);
		  
		  JOptionPane.showMessageDialog(null,"Agencia: "+contas.getAgencia()+" Numero: "+contas.getNumero());
		  JOptionPane.showMessageDialog(null, "Conta Criada com sucesso!");
		  
		  limpaDisplay();
		
			}
	});
		
		btnNewButton.setBounds(120, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 BancoDarbRascunho.main(null);
		
			}
		});
		btnVoltar.setBounds(21, 228, 89, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\lucas\\OneDrive\\Imagens\\fundoBancodarb.png"));
		lblNewLabel_2.setBounds(0, 0, 256, 273);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
	public void limpaDisplay() {
		
		nome2.setText("");
		cpf2.setText("");
		profissao2.setText("");
		
	}
	

	
	
		
		
		
		
		
	
}
