package MyBack;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class sgraph extends JPanel{

	sgraph(int x1){
		this.add(new JLabel());
		this.setBounds(105,400-x1,35,x1);
		this.setBackground(Color.decode("#228b22"));
	}
	sgraph(int x2,int c){
		this.setBounds(165,400-x2,35,x2);
		this.setBackground(Color.decode("#00ff00"));
	}
	sgraph(int x3,int c,int d){
		this.add(new JLabel());
		this.setBounds(225,400-x3,35,x3);
		this.setBackground(Color.decode("#7fff00"));
	}
	sgraph(int x4,int c,int d,int f){
		this.setBounds(285,400-x4,35,x4);
		this.setBackground(Color.decode("#3fff00"));
	}
	sgraph(int x5,int c,int d,int e,int f){
		this.setBounds(345,400-x5,35,x5);
		this.setBackground(Color.decode("#3fff00"));
	}
	
}
