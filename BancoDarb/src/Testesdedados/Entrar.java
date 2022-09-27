package Testesdedados;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Entrar extends Contas {
    
	
	private JFrame frame;
	private JTextField Agencia;
	private JTextField Numero;
	public static int addagencia;
	public static int addnumero;
	
	//public void Logar() {
		//Entrar.addagencia=getAgencia();
		//Entrar.addnumero=getNumero();
		
		
//	}

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
					Entrar window = new Entrar();
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
	public Entrar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
			
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucas\\OneDrive\\Imagens\\icon2.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agencia");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel.setBounds(169, 34, 98, 59);
		frame.getContentPane().add(lblNewLabel);
		
		Agencia = new JTextField();
		Agencia.setBounds(96, 76, 225, 32);
		frame.getContentPane().add(Agencia);
		Agencia.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNumero.setBounds(169, 98, 98, 59);
		frame.getContentPane().add(lblNumero);
		
		Numero = new JTextField();
		Numero.setColumns(10);
		Numero.setBounds(96, 139, 225, 32);
		frame.getContentPane().add(Numero);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setAgencia(Integer.parseInt(Agencia.getText()));
				setNumero(Integer.parseInt(Numero.getText()));
				
				for(Contas c : Contas.lista) {
				
				if(getAgencia() == c.getAgencia() && getNumero() == c.getNumero()) {
					
					addagencia=c.getAgencia();
					addnumero=c.getNumero();
					
					AreaCliente.main(null);
					
				
					
				}
				
				
				}
				
				
				
				limpaDisplay();
			}
	});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 15));
		btnNewButton.setBounds(96, 192, 225, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon("C:\\Users\\lucas\\OneDrive\\Imagens\\fundoentrar22.png"));
		background.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(background);
		
		
	}
	
	public void limpaDisplay() {
		Agencia.setText("");
		Numero.setText("");
		
	}
	
	

}


