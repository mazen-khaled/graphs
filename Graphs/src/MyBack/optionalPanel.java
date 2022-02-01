package MyBack;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class optionalPanel extends disFunctions implements ActionListener{
	int x;
	double p;
	int n;
	/*-------------------------------------------------------------------------------*/
	JPanel optionalPanel = new JPanel();
	/*-------------------------------------------------------------------------------*/
	JButton arryFun[]= {
						new JButton("Bernoulli Distribution"),new JButton("Binomial Distribution"),
						new JButton("Geometric Distribution"),
						new JButton("Negative-Binomial Distribution"),
						new JButton("Hypergeometric Distribution")
					   };
	/*-------------------------------------------------------------------------------*/
	JLabel arrylab[]= {
						new JLabel("Click and Choose an Equation"),
						new JLabel("Probablity of success:"),
						new JLabel("Probablity of success:"),new JLabel("number of times:"),
						new JLabel("Probablity of success:"),
						new JLabel("Probablity of success:"),new JLabel("number of success:"),
						new JLabel("Size of the population:"), 				/* N */
						new JLabel("No. of items in the sample:"), 			/* n */
						new JLabel("No. of successes in the population:") 	/* K */
		  			  };
	/*-------------------------------------------------------------------------------*/
	JTextField arryText[]= {
							new JTextField(),new JTextField(),
							new JTextField(),new JTextField(),
							new JTextField(),new JTextField(),
							new JTextField(),new JTextField(),
							new JTextField(/* N */),new JTextField(/* n */),new JTextField(/* K */),
						   };
	/*-------------------------------------------------------------------------------*/
	JButton arryEnter[]= {
							new JButton("Clear"),new JButton("✅"),
							new JButton("✅"),new JButton("✅"),new JButton("✅"),new JButton("✅")
		 				 };
	/*-------------------------------------------------------------------------------*/
	optionalPanel(JFrame myFrame){
		optionalPanel.setBounds(450,15,230,410);
		optionalPanel.setLayout(null);
		optionalPanel.setBackground(Color.decode("#12727"));
		/*---------------------------------------------------------------------------*/
		arryEnter[0].setBounds(350, 50, 66, 20);//clear
		/*---------------------------------------------------------------------------*/
		arrylab[0].setFont(new Font("Calibri",Font.ITALIC,16));//def
		arrylab[0].setBounds(15, 17, 190, 30);//def
		/*----------------------------Bernoulli--------------------------------------*/
		arryFun[0].setBounds(15, 75, 200, 30);//Bernoulli:
		arrylab[1].setBounds(15, 110, 130, 30);//Bernoulli label
		arryText[0].setBounds(15, 135, 50, 20);//Bernoulli input
		arryEnter[1].setBounds(70, 135, 50, 20);//Bernoulli enter
		/*----------------------------Binomial--------------------------------------*/
		arryFun[1].setBounds(15, 115, 200, 30);//Binomial:
		arrylab[2].setBounds(15, 157, 130, 30);//Binomial label1
		arryText[1].setBounds(150, 160, 50, 20);//Binomial input1
		arrylab[3].setBounds(15, 187, 120, 30);//Binomial label2
		arryText[2].setBounds(125, 190, 50, 20);//Binomial input2
		arryEnter[2].setBounds(70, 220, 70, 20);//Binomial enter
		/*----------------------------Geometric-------------------------------------*/
		arryFun[2].setBounds(15, 155, 200, 30);//Geometric:
		arrylab[4].setBounds(15, 190, 130, 30);//Geometric label1
		arryText[3].setBounds(15, 220, 50, 20);//Geometric input1
		arryEnter[3].setBounds(70, 220, 50, 20);//Geometric enter
		/*-------------------------negative-Binomial--------------------------------*/
		arryFun[3].setBounds(15, 195, 200, 30);//negative-Binomial:
		arrylab[5].setBounds(15, 237, 130, 30);//negative-Binomial label1
		arryText[4].setBounds(150, 240, 50, 20);//negative-Binomial input1
		arrylab[6].setBounds(15, 267, 120, 30);//negative-Binomial label2
		arryText[5].setBounds(135, 270, 50, 20);//negative-Binomial input2
		arryEnter[4].setBounds(70, 300, 70, 20);//negative-Binomial enter
		/*-------------------------Hypergeometric-Distribution--------------------------------*/
		arryFun[4].setBounds(15, 235, 200, 30);//negative-Binomial:
		arrylab[7].setBounds(15, 268, 140, 30);//negative-Binomial label1
		arryText[6].setBounds(156, 272, 50, 20);//negative-Binomial input1
		arrylab[8].setBounds(15, 300, 165, 30);//negative-Binomial label2
		arryText[7].setBounds(183, 303, 30, 20);//negative-Binomial input2
		arrylab[9].setBounds(11, 330, 210, 30);//negative-Binomial label2
		arryText[8].setBounds(95, 352, 50, 20);//negative-Binomial input2
		arryEnter[5].setBounds(80, 380, 80, 20);//negative-Binomial enter
		
		/*---------------------------------------------------------------------------*/
		//Distrubution methods
		for (int i =0 ; i<5 ; i++) {
			arryFun[i].setFocusable(false);
			arryFun[i].setBackground(Color.decode("#6B8E4F"));
			arryFun[i].setForeground(Color.WHITE);
			arryFun[i].addActionListener(this);
			optionalPanel.add(arryFun[i]);
		}
		/*---------------------------------------------------------------------------*/
		// labels of input
		for (int i =0 ; i<10 ; i++) {
			arrylab[i].setForeground(Color.WHITE);
			if(i>0) {
				arrylab[i].setFont(new Font("Calibri",Font.BOLD,14));
				arrylab[i].setVisible(false);
			}
			optionalPanel.add(arrylab[i]);
		}
		/*---------------------------------------------------------------------------*/
		//inputs of distrubution
		for (int i =0 ; i<9 ; i++) {			
			arryText[i].setVisible(false);
			optionalPanel.add(arryText[i]);
		}
		/*---------------------------------------------------------------------------*/
		//Conform the inputs
		for (int i =0; i<6 ; i++) {
			arryEnter[i].setFocusable(false);
			if(i>0) {
				arryEnter[i].setVisible(false);
				optionalPanel.add(arryEnter[i]);
			}
			arryEnter[i].setBackground(Color.decode("#6B8E4F"));
			arryEnter[i].setForeground(Color.WHITE);
		}
		
		/*---------------------------------------------------------------------------*/
		//Clear last graph
		arryEnter[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myFrame.getContentPane().removeAll();
				myFrame.repaint();
				//myFrame.dispose();
				new optionalPanel(myFrame);
				myFrame.getContentPane().setBackground(Color.decode("#1B2727"));
			}
		});
		/*---------------------------------------------------------------------------*/
		//Bernoulli graph
		arryEnter[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				p = Double.parseDouble(arryText[0].getText());
				if (p<=1 && p>=0) {
					x = Bernoulli(p);
					myFrame.add(new sgraph(x));
					myFrame.add(new sgraph(320-x,0));//3.2 y-axis factor
					
					myFrame.add(arryEnter[0]);
					myFrame.add(new graphPanel());
					
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
				else {
					myFrame.add(arryEnter[0]);
					myFrame.add(new errorHandel());
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
			}
		});
		/*---------------------------------------------------------------------------*/
		//Binomial Graph
		arryEnter[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				p = Double.parseDouble(arryText[1].getText());
				n = Integer.parseInt(arryText[2].getText());
				if (p<=1 && p>=0) {
					int x0 = (int) Binomial(n,0,p);
					int x1 = (int) Binomial(n,1,p);
					int x2 = (int) Binomial(n,2,p);
					int x3 = (int) Binomial(n,3,p);
					int x4 = (int) Binomial(n,4,p);
					
					myFrame.add(new sgraph(x0));
					myFrame.add(new sgraph(x1,0));
					myFrame.add(new sgraph(x2,0,0));
					myFrame.add(new sgraph(x3,0,0,0));
					myFrame.add(new sgraph(x4,0,0,0,0));
					
					myFrame.add(arryEnter[0]);
					myFrame.add(new graphPanel());
					
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
				else {
					myFrame.add(arryEnter[0]);
					myFrame.add(new errorHandel());
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
			}
		});
		/*---------------------------------------------------------------------------*/
		//Geometric Graph
		arryEnter[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				p = Double.parseDouble(arryText[3].getText());
				if (p<=1 && p>=0) {
					int x0 = (int) geometric(0,p);
					int x1 = (int) geometric(1,p);
					int x2 = (int) geometric(2,p);
					int x3 = (int) geometric(3,p);
					int x4 = (int) geometric(4,p);
	
					myFrame.add(new sgraph(x0));
					myFrame.add(new sgraph(x1,0));
					myFrame.add(new sgraph(x2,0,0));
					myFrame.add(new sgraph(x3,0,0,0));
					myFrame.add(new sgraph(x4,0,0,0,0));
					
					myFrame.add(arryEnter[0]);
					myFrame.add(new graphPanel());
	
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
				else {
					myFrame.add(arryEnter[0]);
					myFrame.add(new errorHandel());
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
			}
		});
		/*---------------------------------------------------------------------------*/
		//negativeBinomial Graph
		arryEnter[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				p = Double.parseDouble(arryText[4].getText());
				n = Integer.parseInt(arryText[5].getText());
				if (p<=1 && p>=0) {
					int x0 = (int) negativeBinomial(n,0,p);
					int x1 = (int) negativeBinomial(n,1,p);
					int x2 = (int) negativeBinomial(n,2,p);
					int x3 = (int) negativeBinomial(n,3,p);
					int x4 = (int) negativeBinomial(n,4,p);
					
					myFrame.add(new sgraph(x0));
					myFrame.add(new sgraph(x1,0));
					myFrame.add(new sgraph(x2,0,0));
					myFrame.add(new sgraph(x3,0,0,0));
					myFrame.add(new sgraph(x4,0,0,0,0));
					
					myFrame.add(arryEnter[0]);
					myFrame.add(new graphPanel());
	
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
				else {
					myFrame.add(arryEnter[0]);
					myFrame.add(new errorHandel());
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
			}
		});
		
		/*---------------------------------------------------------------------------*/
		//hypergeometric Graph
		arryEnter[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int N = Integer.parseInt(arryText[6].getText());
				n = Integer.parseInt(arryText[7].getText());
				int K = Integer.parseInt(arryText[8].getText());
				
				if (K<=N && N>=n) {
					int x0 = (int) hypergeometric(N,n,K,0);
					int x1 = (int) hypergeometric(N,n,K,1);
					int x2 = (int) hypergeometric(N,n,K,2);
					int x3 = (int) hypergeometric(N,n,K,3);
					int x4 = (int) hypergeometric(N,n,K,4);
					
					myFrame.add(new sgraph(x0));
					myFrame.add(new sgraph(x1,0));
					myFrame.add(new sgraph(x2,0,0));
					myFrame.add(new sgraph(x3,0,0,0));
					myFrame.add(new sgraph(x4,0,0,0,0));
					
					myFrame.add(arryEnter[0]);
					myFrame.add(new graphPanel());
	
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
				else {
					myFrame.add(arryEnter[0]);
					myFrame.add(new errorHandel());
					myFrame.getContentPane().setBackground(Color.decode("#1b2425"));
				}
			}
		});
		/*---------------------------------------------------------------------------*/
		myFrame.add(optionalPanel);
	}
	
	/*-------------------------------------------------------------------------------*/
	@Override
	public void actionPerformed(ActionEvent e) {
		/*---------------------------------------------------------------------------*/
		if(e.getSource()==arryFun[0]) {
			arryFun[1].setBounds(15, 165, 200, 30);
			arryFun[2].setBounds(15, 200, 200, 30);
			arryFun[3].setBounds(15, 235, 200, 30);
			arryFun[4].setBounds(15, 270, 200, 30);//negative-Binomial:
			//text
			for(int i=0;i<9;i++) {
				if(i==0) arryText[i].setVisible(true);
				else arryText[i].setVisible(false);
			}
			//lab
			for(int i=1;i<10;i++) {
				if(i==1) arrylab[i].setVisible(true);
				else arrylab[i].setVisible(false);
			}
			//enter
			for(int i=1;i<6;i++) {
				if(i==1) arryEnter[i].setVisible(true);
				else arryEnter[i].setVisible(false);
			}
			
		}
		/*----------------------------------------------------------------------------*/
		if(e.getSource()==arryFun[1]) {
			arryFun[1].setBounds(15, 110, 200, 30);
			arryFun[2].setBounds(15, 250, 200, 30);
			arryFun[3].setBounds(15, 285, 200, 30);
			arryFun[4].setBounds(15, 320, 200, 30);
			//text
			for(int i=0;i<9;i++) {
				if(i==1 || i==2) arryText[i].setVisible(true);
				else arryText[i].setVisible(false);
			}
			//lab
			for(int i=1;i<10;i++) {
				if(i==2 || i==3) arrylab[i].setVisible(true);
				else arrylab[i].setVisible(false);
			}
			//enter
			for(int i=1;i<6;i++) {
				if(i==2) arryEnter[i].setVisible(true);
				else arryEnter[i].setVisible(false);
			}
		}
		/*----------------------------------------------------------------------------*/
		if(e.getSource()==arryFun[2]) {
			arryFun[1].setBounds(15, 115, 200, 30);
			arryFun[2].setBounds(15, 155, 200, 30);
			arryFun[3].setBounds(15, 250, 200, 30);
			arryFun[4].setBounds(15, 290, 200, 30);

			//text
			for(int i=0;i<9;i++) {
				if(i==3) arryText[i].setVisible(true);
				else arryText[i].setVisible(false);
			}
			//lab
			for(int i=1;i<10;i++) {
				if(i==4) arrylab[i].setVisible(true);
				else arrylab[i].setVisible(false);
			}
			//enter
			for(int i=1;i<6;i++) {
				if(i==3) arryEnter[i].setVisible(true);
				else arryEnter[i].setVisible(false);
			}
		}
		/*----------------------------------------------------------------------------*/
		if(e.getSource()==arryFun[3]) {
			arryFun[1].setBounds(15, 115, 200, 30);
			arryFun[2].setBounds(15, 155, 200, 30);
			arryFun[3].setBounds(15, 195, 200, 30);
			arryFun[4].setBounds(15, 330, 200, 30);
			
			//text
			for(int i=0;i<9;i++) {
				if(i==4 || i==5) arryText[i].setVisible(true);
				else arryText[i].setVisible(false);
			}
			//lab
			for(int i=1;i<10;i++) {
				if(i==5 || i==6) arrylab[i].setVisible(true);
				else arrylab[i].setVisible(false);
			}
			//enter
			for(int i=1;i<6;i++) {
				if(i==4) arryEnter[i].setVisible(true);
				else arryEnter[i].setVisible(false);
			}
		}
		/*----------------------------------------------------------------------------*/
		if(e.getSource()==arryFun[4]) {
			arryFun[0].setBounds(15, 75, 200, 30);//Bernoulli:
			arryFun[1].setBounds(15, 115, 200, 30);//Binomial:
			arryFun[2].setBounds(15, 155, 200, 30);//Geometric:
			arryFun[3].setBounds(15, 195, 200, 30);//negative-Binomial:
			arryFun[4].setBounds(15, 235, 200, 30);//negative-Binomial:
			//text
			for(int i=0;i<9;i++) {
				if(i>=6) arryText[i].setVisible(true);
				else arryText[i].setVisible(false);
			}
			//lab
			for(int i=1;i<10;i++) {
				if(i>=7) arrylab[i].setVisible(true);
				else arrylab[i].setVisible(false);
			}
			//enter
			for(int i=1;i<6;i++) {
				if(i==5) arryEnter[i].setVisible(true);
				else arryEnter[i].setVisible(false);
			}
		}
	}
}
