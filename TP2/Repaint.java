package ACD3;
import java.awt.*;      
 import javax.swing.*;
 import java.awt.event.*;      

 class Repaint extends JFrame implements ActionListener{
			private Dessin dess;
			private JButton b1,b2,b3,b4,b5,b6;
			private JPanel p,pad,pag,padb;
			private char f;
			

	public Repaint(){
	this.setTitle("exercice sur le repaint");
	dess=new Dessin();
	dess.setPreferredSize(new Dimension(400,200));
	
	b1=new JButton("cercle");
	b1.addActionListener(this);
	b2=new JButton("Carre jaune");
	b2.addActionListener(this);
	
	b3=new JButton("Rouge");
	b3.addActionListener(this);
	b4=new JButton("Vert");
	b4.addActionListener(this);
	b5=new JButton("Noir");
	b5.addActionListener(this);
	b6=new JButton("Rose");
	b6.addActionListener(this);
	
	
	p=new JPanel(new GridLayout(1,0,2,2));
	pad=new JPanel();
	pag=new JPanel();
	
	padb=new JPanel(new GridLayout(2,0,0,0));
	
	p.setBackground(Color.blue);
	pag.add(b1);
	pad.add(b2);
	p.setPreferredSize(new Dimension(400,100));
	p.add(pag);
	p.add(pad);
	
	
	this.add(p,BorderLayout.SOUTH);
	this.add(dess, BorderLayout.CENTER);
	this.setVisible(true);
	this.setLocationRelativeTo(null);
	this.pack();
	}

	public void actionPerformed(ActionEvent e){
	if((e.getSource()).equals(b1)){ 
		p.remove(pad);
		p.add(padb);
		padb.add(b3);
		padb.add(b4);
		padb.add(b5);
		padb.add(b6);
		p.validate();
		p.repaint();
		f='o';
	}
									
	if((e.getSource()).equals(b2)) f='c';
	
	if((e.getSource()).equals(b3)) {
		f='e'; 
		p.remove(padb);
		p.add(pad);
		p.validate();
		p.repaint();
	}
	if((e.getSource()).equals(b4)) {
		f='f'; 
		p.remove(padb);
		p.add(pad);
		p.validate();
		p.repaint();
	}
	if((e.getSource()).equals(b5)){
		f='g';
		p.remove(padb);
		p.add(pad);
		p.validate();
		p.repaint();
	}
	if((e.getSource()).equals(b6)){
		f='h'; 
		p.remove(padb);
		p.add(pad);
		p.validate();
		p.repaint();
	}
	dess.repaint();
	}
	
	
class Dessin extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.blue);
	
		switch(f){
			case 'o': 	g.setColor( Color.yellow);
						g.drawOval(150, 50, 100,100);
						
						break;
			
			case 'c':	g.setColor( Color.yellow);
						g.fillRect(150, 50, 100,100);
						break;
				
			case 'e': 	g.setColor( Color.red);
						g.fillOval(150, 50, 100,100);
						g.setColor( Color.yellow);
						g.drawOval(150, 50, 100,100);
			
						break;
		
			case 'f': 	g.setColor(Color.green);
						g.fillOval(150, 50, 100,100);
						g.setColor( Color.yellow);
						g.drawOval(150, 50, 100,100);
			
						break;
			
			case 'g': 	g.setColor( Color.black);
						g.fillOval(150, 50, 100,100);
						g.setColor( Color.yellow);
						g.drawOval(150, 50, 100,100);
			
						break;
			
			case 'h': 	g.setColor( Color.pink);
						g.fillOval(150, 50, 100,100);
						g.setColor( Color.yellow);
						g.drawOval(150, 50, 100,100);
			
						break;
			
			default: break;
		}		
  	}
}


}
     