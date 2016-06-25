package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Exercice3 extends JFrame{
	private JPanel MainPanel, CalculPanel;
	private JLabel ResultatLabel;
	private JButton calcul = new JButton("Calcul");
	private JTextField op1 , op2;
	private JComboBox operateur;
	
	
	public Exercice3(){
		
		setTitle("Exercice 1 JComboBox");
		// pour le resultat
		ResultatLabel = new JLabel("0");
		ResultatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ResultatLabel.setForeground(Color.black);
		
		//pour le calcul
		CalculPanel= new JPanel(new FlowLayout());
		op1 = new JTextField("0", 7);
		op2 = new JTextField("0", 7);
		operateur = new JComboBox();
		operateur.addItem("+");
		operateur.addItem("-");
		operateur.addItem("*");
		operateur.addItem("/");
		
		
		//listener de JComboBox
		operateur.setForeground(Color.black);
		
		//listener du JButton
		calcul.addActionListener(new BoutonListener());
		
		//l'ajout dans le CalculPanel
		CalculPanel.add(op1);
		CalculPanel.add(operateur);
		CalculPanel.add(op2);
		CalculPanel.add(calcul);
		
		//ajout dans le MainPanel
		MainPanel = new JPanel( new BorderLayout(4, 4));
		MainPanel.add(CalculPanel, BorderLayout.NORTH);
		MainPanel.add(ResultatLabel, BorderLayout.SOUTH);
		
		//propriete de la JFrame
		this.add(MainPanel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBackground(Color.DARK_GRAY);
	}

	//Pour les opérandes
	class BoutonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			//Conversion en String
            String a = op1.getText();
            String b = op2.getText();
            double c = new Double(a);
            double d = new Double(b);
            double f = 0;
            String x = (String) operateur.getSelectedItem();
            
            if ( x == "+")
            	f = c + d;
            
            if ( x == "-")
            	f = c - d;
            
            if ( x == "*")
            	f = c * d;
            
            if ( x == "/")
            	if(d == 0)
            		f = 0;
            else
            	f = c / d;
            ResultatLabel.setText("" + f);
		}
	}
}
	
