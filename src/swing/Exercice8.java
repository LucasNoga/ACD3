package swing;

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;   

import javax.swing.border.*;

public class Exercice8 extends JFrame{
	
	private JLabel titre, nom, adresse, ville, code, pay; //Déclarations
	private JPanel p ;
	private JTextField nomField, adresseField, villeField, codeField;
	private JComboBox combo;
	
	private Exercice8(String t){

		super(t);
		JPanel p= new JPanel(new GridBagLayout()); 
		p.setBackground(Color.yellow);
		GridBagConstraints gbc = new GridBagConstraints();

		//titre
		titre = new JLabel("Achetez maintenant !");
		titre.setFont(new Font("Times-Roman",Font.BOLD + Font.ITALIC, 16));
		titre.setForeground(Color.green);

		//labels
		JLabel nom = new JLabel("Nom:");
		JLabel adresse = new JLabel("Adresse:");
		JLabel ville = new JLabel("Ville:");
		JLabel pay = new JLabel("Mode de paiement:");
		JLabel code = new JLabel("Code:");
		
		
		//Couleurs
		Font f = new Font("Times-Roman", Font.BOLD, 12);
		nom.setFont(f);
		adresse.setFont(f);
		ville.setFont(f);
		pay.setFont(f);
		code.setFont(f);
		
		titre.setForeground(Color.orange);
		nom.setForeground(Color.orange);
		ville.setForeground(Color.orange);
		adresse.setForeground(Color.orange);
		pay.setForeground(Color.orange);
		code.setForeground(Color.orange);
		

		//Textfields
		JTextField nomField = new JTextField(30); 
		JTextField adresseField = new JTextField(30);
		JTextField villeField = new JTextField(15); 
		JTextField codeField = new JTextField(5);
		
		//Combobox
		combo = new JComboBox();
		combo.addItem("Mastercard");
		combo.addItem("Visa");
		combo.addItem("Paypal");
		combo.addItem("Carte Bleue");
		
		//Contraintes
		gbc.gridwidth = GridBagConstraints.REMAINDER; 
		gbc.insets = new Insets(5,0,10,0); 
		p.add(titre, gbc);
		
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(0,5,0,5); //conservé pour la suite gbc.gridwidth = 1;
		
		//label nom
		gbc.gridx = GridBagConstraints.RELATIVE;
		gbc.gridx = 0;
		gbc.gridy = 1;
		p.add(nom,gbc);
		
		//field nom
		gbc.gridx = GridBagConstraints.RELATIVE;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		p.add(nomField,gbc);
		
		//label adresse
		gbc.gridwidth = 1;
		gbc.gridx = 0;
		gbc.gridy = 2;
		p.add(adresse, gbc);
		
		
		//field adresse
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		gbc.gridx = 1;
		gbc.gridy = 2;
		p.add(adresseField, gbc);
		
		//label ville
		gbc.gridwidth = 1;
		gbc.gridy = GridBagConstraints.RELATIVE; 
		gbc.gridy = 3;
		gbc.gridx = 0;
		p.add(ville, gbc);
		
		//field ville
		gbc.gridx = 1;
		gbc.gridy = 3;
		p.add(villeField, gbc);
		
		//label code
		gbc.gridx = 2;
		gbc.gridy = 3;
		p.add(code, gbc);
		
		//field code
		gbc.gridx = 3;
		gbc.gridy = 3;
		p.add(codeField, gbc);
		
		//label pay
		gbc.gridx = 0;
		gbc.gridy = 4;
		p.add(pay, gbc);
		
		//field pay
		gbc.gridx = 1;
		gbc.gridy = 4;
		p.add(combo, gbc);

		this.add(p);

	}

	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				 Exercice8 frame = new Exercice8("");
				 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 frame.pack();
				 frame.setLocationRelativeTo(null);
				 frame.setVisible(true);  
			}
		}); 
	}

}
