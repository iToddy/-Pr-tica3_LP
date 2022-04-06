package pratica3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eleicao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eleicao frame = new Eleicao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Eleicao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Maria");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel.setBounds(165, 39, 61, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pedro");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(165, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nulo");
		lblNewLabel_2.setFont(new Font("Century", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(165, 111, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Branco");
		lblNewLabel_3.setFont(new Font("Century", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(165, 149, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("20");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(100, 43, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("30");
		lblNewLabel_5.setBounds(100, 74, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(100, 111, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("2");
		lblNewLabel_7.setFont(new Font("Century", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(100, 149, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(160, 174, 151, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Seu Voto ");
		lblNewLabel_8.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(79, 176, 67, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("SEU VOTO ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String voteDeclaration;
				int votesMaria=0; 
				int votesPedro=0;
				int votesBranco=0;
				int votesNulo=0;
				int votesTotal=0;
				
				voteDeclaration = textField.getText();
				Integer.parseInt(voteDeclaration);
				
				while (voteDeclaration == "20" ||voteDeclaration == "30" || voteDeclaration == "1" || voteDeclaration == "2" ) {
					if (voteDeclaration == "20") {
						votesMaria++;
						JOptionPane.showMessageDialog(null, "O seu voto foi finalizado para a candidata Maria" ,"VOTO FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
					} else if (voteDeclaration == "30") {
						votesPedro++;
						JOptionPane.showMessageDialog(null, "O seu voto foi finalizado para o candidato Pedro" ,"VOTO FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
				} else if (voteDeclaration == "2") {
					votesBranco++;
					JOptionPane.showMessageDialog(null, "O seu voto foi finalizado, computado Branco" ,"VOTO FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
			} else if (voteDeclaration == "1") {
				votesNulo++;
				JOptionPane.showMessageDialog(null, "O seu voto foi anulado" ,"VOTO FINALIZADO",JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Candidato nao existe, vote novamente","ERRO",JOptionPane.INFORMATION_MESSAGE);
			}
			if (voteDeclaration == "20" ||voteDeclaration == "30" || voteDeclaration == "1" || voteDeclaration == "2" )	{
				votesTotal++;
			}
			
			JOptionPane.showMessageDialog(null, "Vote novamente ou tecle -1 para terminar ","INFORMÇÃO",JOptionPane.INFORMATION_MESSAGE);

		}
				JOptionPane.showMessageDialog(null, "Resultado! ","RESULTADO",JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Número total de votos ="+votesTotal+"  --100%" ,"ATENÇÃO",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Número  de votos Maria ="+votesMaria +" " + (votesMaria*(votesTotal/100)+"%") ,"ATENÇÃO",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Número  de votos Pedro ="+votesPedro +" " + (votesPedro*(votesTotal/100)+"%") ,"ATENÇÃO",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Número  de votos em branco ="+votesBranco +" " + (votesBranco*(votesTotal/100)+"%") ,"ATENÇÃO",JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "Número  de votos nulos ="+votesNulo +" " + (votesNulo*(votesTotal/100)+"%") ,"ATENÇÃO",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnNewButton.setBounds(73, 227, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CANCELAR");
		btnNewButton_1.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(258, 227, 110, 23);
		contentPane.add(btnNewButton_1);
	}
}		
