package ACD3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class FrameSquelette extends JFrame {

	private Border raisedbevel;
	private PanelModifier panneau;
	private int[][] t;
	private int x, y;

	public FrameSquelette(String titre) {
		super(titre);

		t = new int[10][25];
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 25; j++)
				t[i][j] = 0;
		t[0][0] = 1;
		x = 0;
		y = 0;

		raisedbevel = BorderFactory.createRaisedBevelBorder();
		panneau = new PanelModifier();
		panneau.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (x >= 20)
						x -= 20;
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if (x <= 460)
						x += 20;
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (y <= 160)
						y += 20;
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (y >= 20)
						y -= 20;
				}

				t[y / 20][x / 20] = 1;
				panneau.repaint();
			}
		});
		panneau.setFocusable(true);
		panneau.setPreferredSize(new Dimension(500, 210));
		add(panneau, BorderLayout.CENTER);
	}

	class PanelModifier extends JPanel {

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			setBackground(Color.BLUE);
			g.setColor(Color.YELLOW);
			g.fillOval(x, y, 19, 19);
			for (int i = 0; i < 10; i++){
				for (int j = 0; j < 25; j++){
					if (t[i][j] == 1)
						g.fillOval(20 * j + 7, 20 * i + 7, 5, 5);
				}
			}
		}

	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FrameSquelette f = new FrameSquelette("TP2 � compl�ter ");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.pack();
				f.setVisible(true);
			}
		});
	}
}
