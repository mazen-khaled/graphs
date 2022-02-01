package MyBack;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	
	optionalPanel op;
	
	MyFrame (){
		super("Math 5");
		this.setSize(700,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.decode("#1B2727"));
		this.setLayout(null);
		
		op = new optionalPanel(this);
		
		this.setVisible(true);
	}
}
