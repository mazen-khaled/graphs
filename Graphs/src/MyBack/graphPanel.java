package MyBack;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class graphPanel extends JPanel {
	JPanel x = new JPanel();
	JLabel xp= new JLabel("X");
	JLabel prec= new JLabel("%");
	
	JLabel numbX[]= {
					new JLabel("10  -"),new JLabel("20  -"),new JLabel("30  -"),new JLabel("40  -"),
					new JLabel("50  -"),new JLabel("60  -"),new JLabel("70  -"),new JLabel("80  -"),
					new JLabel("90  -"),new JLabel("100-")
					};
	
	JPanel y = new JPanel();
	JLabel numbY[] = { new JLabel("0") , new JLabel("1"), new JLabel("2"),
					   new JLabel("3") , new JLabel("4") };
	
	graphPanel(){
		this.setBounds(30,30 , 400, 400);
		this.setBackground(Color.decode("#1D1D1F"));
		this.setLayout(null);
		
		x.setBounds(30,30,3,340);
		y.setBounds(30,370,340,3);
		
		this.add(x);
		this.add(y);
		
		int sum =360;
		for(int i =0 ; i<10 ; i++) {
			sum -= 31;
			numbX[i].setBounds(8,sum,50,13);
			numbX[i].setForeground(Color.decode("#228b22"));
			this.add(numbX[i]);
		}
		sum=30;
		for(int i =0 ; i<5; i++) {
			sum += 60;
			numbY[i].setBounds(sum,380,10,13);
			numbY[i].setForeground(Color.decode("#228b22"));
			this.add(numbY[i]);
		}
		numbY[1].setForeground(Color.decode("#00ff00"));
		
		prec.setBounds(15,15,20,20);
		xp.setBounds(380,370,20,20);
		
		prec.setForeground(Color.WHITE);
		xp.setForeground(Color.WHITE);
		
		this.add(prec);
		this.add(xp);
	}
}
