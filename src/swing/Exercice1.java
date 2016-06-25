package swing;
import javax.swing.*;
import java.awt.*;

public class Exercice1 extends JFrame {
	JLabel name, firstname, sexeLabel, hommeLabel, femmeLabel;
	JRadioButton femme;
	JRadioButton homme;
	JButton ok, cancel;
	JTextField textName, textFirstName;
	JCheckBox Tennis, Natation, Athletisme, Foot, Randonnee, Basket;
	JPanel MainPanel, namePanel, sexePanel, sportPanel, buttonPanel;

	public Exercice1(){
		setTitle("Questionnaire");

		//Déclarations et initialisations des JLabel
		name = new JLabel("Nom");
		firstname = new JLabel("Prenom");

		//Déclarations et initialisations des JButton
		ok = new JButton("OK");
		cancel = new JButton("Annuler");

		//TextField
		textName = new JTextField("" ,10);
		textFirstName = new JTextField("", 10);


		//ButtonPanel
		buttonPanel = new JPanel(new FlowLayout());
		buttonPanel.add(ok, BorderLayout.WEST);
		buttonPanel.add(cancel, BorderLayout.EAST);

		//CheckBox 
		Tennis = new JCheckBox("Tennis");
		Natation = new JCheckBox("Natation");
		Athletisme = new JCheckBox("Athlétisme");
		Foot = new JCheckBox("Foot");
		Randonnee = new JCheckBox("Randonnée");
		Basket = new JCheckBox("Basket");

		//panel des CheckBox
		sportPanel = new JPanel(new GridLayout(6,1));
		sportPanel.add(Tennis);
		sportPanel.add(Natation);
		sportPanel.add(Athletisme);
		sportPanel.add(Foot);
		sportPanel.add(Randonnee);
		sportPanel.add(Basket);

		//boutons Radios
		homme = new JRadioButton();
		femme = new JRadioButton();
		JLabel hommeLabel = new JLabel("homme");
		JLabel femmeLabel = new JLabel("femme");

		//panel des boutons radios
		sexePanel= new JPanel();
		sexeLabel = new JLabel("Sexe ");
		sexePanel.add(hommeLabel);
		sexePanel.add(homme);
		sexePanel.add(femmeLabel);
		sexePanel.add(femme);

		//NamePanel
		namePanel = new JPanel(new GridLayout(0,1));
		namePanel.add(name);
		namePanel.add(textName);
		namePanel.add(firstname);
		namePanel.add(textFirstName);
		namePanel.add(sexePanel);

		//Création du MainPanel
		MainPanel = new JPanel(new BorderLayout(25,0));
		MainPanel.add(buttonPanel , BorderLayout.SOUTH);
		MainPanel.add(namePanel, BorderLayout.WEST);
		MainPanel.add(sportPanel, BorderLayout.EAST);
		this.add(MainPanel);
	}
}

