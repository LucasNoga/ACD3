package ACD3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercice4 extends JFrame {
	private JPanel loginPanel;
	private JPanel buttonPanel;
	private JPanel mainPanel;
	private JLabel loginLabel;
	private JLabel mdpLabel;
	private JTextField loginField;
	private JPasswordField mdpField;
	private JButton okButton,cancelButton;

	
	public Exercice4 (String titre){
		super(titre);
		loginLabel = new JLabel("Login :");
		loginField = new JTextField(20);
		mdpLabel = new JLabel("Mot de passe :");
		mdpField = new JPasswordField(20);
		loginPanel = new JPanel(new GridLayout(2,2));
		okButton = new JButton("OK");
		
		okButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e){
				loginPanel.setBackground(Color.green);
				buttonPanel.setBackground(Color.green);
			}
		}
		);
		cancelButton = new JButton("Annuler");
		cancelButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				loginField.setText("");
				mdpField.setText("");
				loginPanel.setBackground(Color.white);
				buttonPanel.setBackground(Color.white);
			}
		});

		buttonPanel = new JPanel();
		loginPanel.add(loginLabel);
		loginPanel.add(loginField);
		loginPanel.add(mdpLabel);
		loginPanel.add(mdpField);
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		mainPanel = new JPanel(new BorderLayout());
		mainPanel.add(loginPanel, BorderLayout.CENTER);
		mainPanel.add(buttonPanel, BorderLayout.SOUTH);
		this.add(mainPanel);
	}

	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				Exercice4 f = new Exercice4("Exercice4");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(250,120);
				f.setVisible(true);  
				f.setLocationRelativeTo(null);
			}
		}); 
	}

}

