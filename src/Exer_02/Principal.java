package Exer_02;

import java.awt.Color;

import javax.swing.JFrame;

public class Principal extends JFrame{
	
	public Principal(){
		super();
		Painel p = new Painel();
		p.setBackground(Color.white);
		this.setContentPane(p);
	}
	
	public static void main(String[] args) {
		Principal p = new Principal();
		p.setSize(800, 600);
		p.setLocationRelativeTo(null);
		p.setVisible(true);
	}
}