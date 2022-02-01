package MyBack;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class errorHandel extends JPanel{
	JLabel lab = new JLabel("Error: p value from 0 to 1 Or ");
	JLabel lab2 = new JLabel("No. of successes in the population must be <= Size of the population");
	errorHandel(){
		this.setBounds(30,30 , 400, 400);
		this.setBackground(Color.decode("#1B2727"));
		this.setLayout(null);
		
		lab.setForeground(Color.WHITE);
		lab2.setForeground(Color.WHITE);
		lab.setBounds(5,50 , 200, 100);
		lab2.setBounds(5,100 , 400, 100);
		
		this.add(lab2);
		this.add(lab);
	}
}
