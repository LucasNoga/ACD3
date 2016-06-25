package swing;
/**
* @File: Paiment.java
* @Autor: Noga Lucas
* @Date: 07/05/2014
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;   
import javax.swing.border.*;

 
public class Paiement extends JFrame 
{   
    private JLabel acheter, nom, adresse, ville, code, paiment; //Déclarations
    private JPanel base;
    private JTextField Nom, Adresse, Ville, Code, Paiment;
    private GridBagConstraints c;

    public Paiement(String titre)
    {
        super(titre);
        base = new JPanel();
        base.setLayout(new GridBagLayout());
        base.setBorder(new EmptyBorder(15,15,15,15)); //création d'une marge de 15 pixel
        c = new GridBagConstraints();
        
        nom = new JLabel("Nom:");
        c.gridx = 1;
        c.gridy = 1;
        base.add(nom, c);
        
        Nom = new JTextField(30);
        c.gridx = 3;
        c.gridy = 1;
        base.add(Nom, c);
        
        adresse = new JLabel("Adresse:");
        c.gridx = 1;
        c.gridy = 2;
        base.add(adresse, c);
        
        Adresse = new JTextField(30);
        c.gridx = 3;
        c.gridy = 2;
        base.add(Adresse, c);
        
        ville = new JLabel("Ville:");
        c.gridx = 1;
        c.gridy = 3;
        base.add(ville, c);
        
        Ville = new JTextField(20);
        c.gridx = 3;
        c.gridy = 3;
        base.add(Ville, c);
        
        code = new JLabel("Code:");
        c.gridx = 4;
        c.gridy = 3;
        base.add(code, c);
        
        Code = new JTextField(10);
        c.gridx = 5;
        c.gridy = 3;
        base.add(Code, c);
        
        base.setBackground(Color.yellow);
        this.add(base);
    }
    
    public static void main(String[] args) 
    { 
        EventQueue.invokeLater(new Runnable() 
        { 
            public void run() 
            {
                 Paiement frame = new Paiement("Paiement");
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.pack();
                 frame.setVisible(true); 
                 frame.setLocationRelativeTo(null);
             }
         }); 
    }
}
