package Exer_02;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Painel extends JPanel{
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		int w = getWidth();
		int h = getHeight();
		
		int x = (w / 2);
		int y = (h / 2);
		
		g2.drawLine(w / 2, 0, w / 2, h);
		g2.drawLine(0, 0, x - 10, h);
		g2.drawLine(x + 10, h, w, 0);
		g2.drawLine(w, y, 0, h);
		
		g2.dispose();
		
	}
}