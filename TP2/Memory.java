package ACD3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;   
import javax.swing.border.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Memory extends JFrame {
	
	//panels
	private JPanel  mainpanel, memorypanel, scorepanel, panelTextCoup, panelTextPair, panelCoups, panelPairs;

	//pour les images
	private JLabel j1, j2, j3, j4, j5, j6, j7, j8, j9, j10; 
	private JLabel j11, j12, j13, j14, j15, j16, j17, j18, j19, j20;
	private ImageFond fond;
	
	//scorepanel
	private JLabel textCoup, textPair, coups, pairs ;
	
	//Bordures
	Border raisedbevel, loweredbevel, compound;

	//creer un tableau pour les images
	//Image[] images = new Image[20];
	
	private Memory(String titre){
		setTitle("Memory");

		//panel memory
		memorypanel = new JPanel(new GridLayout(5, 4, 25, 25));
		memorypanel.setPreferredSize(new Dimension (605, 485));

		//scorepanel
		textCoup = new JLabel("Nombre de coups: ");
		textPair = new JLabel("Nombre de paires d�couvertes: ");
		coups = new JLabel("0");
		pairs = new JLabel("0");
		
		panelTextCoup = new JPanel(new FlowLayout());
		panelTextPair = new JPanel(new FlowLayout());
		panelPairs = new JPanel();
		panelCoups = new JPanel();
		
		panelTextCoup.setPreferredSize(new Dimension(250, 30));
		panelTextPair.setPreferredSize(new Dimension(250, 30));
		
		panelPairs.setPreferredSize(new Dimension (30, 30));
		panelCoups.setPreferredSize(new Dimension(30, 30));
		
		panelTextCoup.add(textCoup, FlowLayout.LEFT);
		panelTextPair.add(textPair, FlowLayout.LEFT);
		panelPairs.add(pairs);
		panelCoups.add(coups);
		
		scorepanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10, 10, 10, 10);
		
		scorepanel.add(panelTextCoup, c);
		
		c.gridy = 0;
		c.gridx = 1;
		scorepanel.add(panelCoups, c);
		
		c.gridy = 1;
		c.gridx = 0;  
		scorepanel.add(panelTextPair, c);
		
		c.gridx = 1;
		scorepanel.add(panelPairs, c);
	
		panelCoups.setBackground(Color.BLUE);
		panelPairs.setBackground(Color.BLUE);
		textCoup.setForeground(Color.blue);
		textPair.setForeground(Color.blue);
		coups.setForeground(Color.white);
		pairs.setForeground(Color.white);

		//panel principal
		mainpanel = new JPanel(new BorderLayout());

		//memorypanel.add(fond);
		j1 = new JLabel("image 1");
		j2 = new JLabel("image 2");
		j3 = new JLabel("image 3");
		j4 = new JLabel("image 4");
		j5 = new JLabel("image 5");
		j6 = new JLabel("image 6");
		j7 = new JLabel("image 7");
		j8 = new JLabel("image 8");
		j9 = new JLabel("image 9");
		j10 = new JLabel("image 10");
		j11 = new JLabel("image 11");
		j12 = new JLabel("image 12");
		j13 = new JLabel("image 13");
		j14 = new JLabel("image 14");
		j15 = new JLabel("image 15");
		j16 = new JLabel("image 16");
		j17 = new JLabel("image 17");
		j18 = new JLabel("image 18");
		j19 = new JLabel("image 19");
		j20 = new JLabel("image 20");
		memorypanel.add(j1);
		memorypanel.add(j2);
		memorypanel.add(j3);
		memorypanel.add(j4);
		memorypanel.add(j5);
		memorypanel.add(j6);
		memorypanel.add(j7);
		memorypanel.add(j8);
		memorypanel.add(j9);
		memorypanel.add(j10);
		memorypanel.add(j11);
		memorypanel.add(j12);
		memorypanel.add(j13);
		memorypanel.add(j14);
		memorypanel.add(j15);
		memorypanel.add(j16);
		memorypanel.add(j17);
		memorypanel.add(j18);
		memorypanel.add(j19);
		
		
		//mettre l'image de fond 20 fois
		
		//cela ne marche pas
		fond = new ImageFond();
		fond.repaint(); 
		memorypanel.add(fond);
		//jusqu'a la
		

		//Bordures
		raisedbevel = BorderFactory.createRaisedBevelBorder();
		loweredbevel = BorderFactory.createLoweredBevelBorder();
		compound = BorderFactory.createCompoundBorder(raisedbevel,loweredbevel);
		j1.setBorder(compound);
		j2.setBorder(compound);
		j3.setBorder(compound);
		j4.setBorder(compound);
		j5.setBorder(compound);
		j6.setBorder(compound);
		j7.setBorder(compound);
		j8.setBorder(compound);
		j9.setBorder(compound);
		j10.setBorder(compound);
		j11.setBorder(compound);
		j12.setBorder(compound);
		j13.setBorder(compound);
		j14.setBorder(compound);
		j15.setBorder(compound);
		j16.setBorder(compound);
		j17.setBorder(compound);
		j18.setBorder(compound);
		j19.setBorder(compound);
		j20.setBorder(compound);
		memorypanel.setBorder(compound);
		panelTextCoup.setBorder(compound);
		panelTextPair.setBorder(compound);
		panelCoups.setBorder(compound);
		panelPairs.setBorder(compound);
		
		//ajout des panels secondaires
		mainpanel.add(memorypanel, BorderLayout.NORTH);
		mainpanel.add(scorepanel, BorderLayout.SOUTH);

		//ajout du panel principal
		setContentPane(mainpanel);
	}
	
	//pour les images
	class ImageFond extends JPanel{
		Image img;
		ImageFond(){
			try {
				img = ImageIO.read(new File("fond.png"));
			} 
			catch (Exception e){
				System.out.println("pas afficher");
			};
		}

		public void paintComponent(Graphics g) { 
			super.paintComponent(g);
			if (img != null)
				g.drawImage (img, 0, 0, this); // Affichage de l'image (im chargee automatiquement)
		}
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { 
			public void run() {
				Memory frame = new Memory("");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//frame.setSize(800, 800);
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		}); 
	}

}

