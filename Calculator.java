import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	// class variables aka instance variables aka field varibales
	JFrame frame;
	JTextField textField;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdec, badd, bsub, bmul, bdiv, beq, bclr, bksp, bsqr, bcbe, bsqt,
			blog;
	double firstNumber, secondNumber, result;
	int operator;
	

	// constructor

	public Calculator() {
		frame = new JFrame("Calculator, Created by Luke Warner");
		frame.setBounds(500, 100, 500, 0);
		frame.setLayout(null);

		textField = new JTextField();
		textField.setBounds(30, 40, 410, 30);
		textField.setBackground(Color.cyan);
		frame.add(textField);

		b1 = new JButton("1");
		b1.setBounds(40, 240, 50, 40);
		b1.setBackground(Color.cyan);
		frame.add(b1);

		b4 = new JButton("4");
		b4.setBounds(40, 170, 50, 40);
		b4.setBackground(Color.cyan);
		frame.add(b4);

		b7 = new JButton("7");
		b7.setBounds(40, 100, 50, 40);
		b7.setBackground(Color.cyan);
		frame.add(b7);

		b8 = new JButton("8");
		b8.setBounds(110, 100, 50, 40);
		b8.setBackground(Color.cyan);
		frame.add(b8);

		b5 = new JButton("5");
		b5.setBounds(110, 170, 50, 40);
		b5.setBackground(Color.cyan);
		frame.add(b5);

		b2 = new JButton("2");
		b2.setBounds(110, 240, 50, 40);
		b2.setBackground(Color.cyan);
		frame.add(b2);

		b9 = new JButton("9");
		b9.setBounds(180, 100, 50, 40);
		b9.setBackground(Color.cyan);
		frame.add(b9);

		b6 = new JButton("6");
		b6.setBounds(180, 170, 50, 40);
		b6.setBackground(Color.cyan);
		frame.add(b6);

		b3 = new JButton("3");
		b3.setBounds(180, 240, 50, 40);
		b3.setBackground(Color.cyan);
		frame.add(b3);

		bdec = new JButton(".");
		bdec.setBounds(40, 310, 50, 40);
		bdec.setBackground(Color.cyan);
		frame.add(bdec);

		b0 = new JButton("0");
		b0.setBounds(110, 310, 50, 40);
		b0.setBackground(Color.cyan);
		frame.add(b0);

		beq = new JButton("=");
		beq.setBounds(180, 310, 50, 40);
		beq.setBackground(new Color(0, 180, 231));
		frame.add(beq);

		bdiv = new JButton("/");
		bdiv.setBounds(250, 100, 50, 40);
		bdiv.setBackground(Color.cyan);
		frame.add(bdiv);

		bmul = new JButton("*");
		bmul.setBounds(250, 170, 50, 40);
		bmul.setBackground(Color.cyan);
		frame.add(bmul);

		bsub = new JButton("-");
		bsub.setBounds(250, 240, 50, 40);
		bsub.setBackground(Color.cyan);
		frame.add(bsub);

		badd = new JButton("+");
		badd.setBounds(250, 310, 50, 40);
		badd.setBackground(Color.cyan);
		frame.add(badd);

		bclr = new JButton("Clear");
		bclr.setBounds(40, 380, 120, 40);
		bclr.setBackground(new Color(0, 180, 231));
		frame.add(bclr);

		bksp = new JButton("Bksp");
		bksp.setBounds(180, 380, 120, 40);
		bksp.setBackground(new Color(0, 180, 231));
		frame.add(bksp);
		
		bsqr = new JButton("x^2");
		bsqr.setBounds(320, 100, 80, 40);
		bsqr.setBackground(new Color(0, 180, 231));
		frame.add(bsqr);
		
		bcbe = new JButton("x^3");
		bcbe.setBounds(320, 170, 80, 40);
		bcbe.setBackground(new Color(0, 180, 231));
		frame.add(bcbe);
		
		bsqt = new JButton("sq rt");
		bsqt.setBounds(320, 240, 80, 40);
		bsqt.setBackground(new Color(0, 180, 231));
		frame.add(bsqt);
		
		blog = new JButton("log(10)");
		blog.setBounds(320, 310, 90, 40);
		blog.setBackground(new Color(0, 180, 231));
		frame.add(blog);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(800, 600);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		bdec.addActionListener(this);
		badd.addActionListener(this);
		bsub.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		beq.addActionListener(this);
		bclr.addActionListener(this);
		bksp.addActionListener(this);
		bsqr.addActionListener(this);
		bcbe.addActionListener(this);
		bsqt.addActionListener(this);
		blog.addActionListener(this);
		
	}

	// LIstener -- waiting for an event, mouse click, mouse over...
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b1)
			textField.setText(textField.getText().concat("1"));
		if (e.getSource() == b2)
			textField.setText(textField.getText().concat("2"));
		if (e.getSource() == b3)
			textField.setText(textField.getText().concat("3"));
		if (e.getSource() == b4)
			textField.setText(textField.getText().concat("4"));
		if (e.getSource() == b5)
			textField.setText(textField.getText().concat("5"));
		if (e.getSource() == b6)
			textField.setText(textField.getText().concat("6"));
		if (e.getSource() == b7)
			textField.setText(textField.getText().concat("7"));
		if (e.getSource() == b8)
			textField.setText(textField.getText().concat("8"));
		if (e.getSource() == b9)
			textField.setText(textField.getText().concat("9"));
		if (e.getSource() == b0)
			textField.setText(textField.getText().concat("0"));
		if (e.getSource() == bdec)
			textField.setText(textField.getText().concat("."));
		
		if (e.getSource() == bclr) {
			textField.setText("");
		}
		
		//math Functions
		if(e.getSource() == badd) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 1;
			textField.setText("");
		}
		if(e.getSource() == bsub) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 2;
			textField.setText("");
		}
		if(e.getSource() == bmul) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 3;
			textField.setText("");
		}
		if(e.getSource() == bdiv) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 4;
			textField.setText("");			
		}
		if(e.getSource() == bsqr) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 5;
			
		}
		if(e.getSource() == bsqt) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 7;
			
		}
		if(e.getSource() == bcbe) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 6;
			
		}
		if(e.getSource() == blog) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 8;
			
		}
		
		
		if(e.getSource() == beq) {
			secondNumber = Double.parseDouble(textField.getText());
				
			switch(operator) {
				case 1:
					result = firstNumber + secondNumber;
					break;
				case 2:
					result = firstNumber - secondNumber;
					break;
				case 3:
					result = firstNumber * secondNumber;
					break;
				case 4:
					result = firstNumber / secondNumber;
					break;	
				case 5:
					result = Math.pow(firstNumber, 2.0);
					break;
				case 6:
					result = Math.pow(firstNumber, 3.0);
					break;
				case 7:
					result = Math.sqrt(firstNumber);
					break;
				case 8:
					result = Math.log10(firstNumber);
					break;
				default: result = 0;
			
			}
			
			textField.setText(""+result);
		}
		
		if(e.getSource() == bksp) {
			String s=textField.getText();
			textField.setText("");
			for(int i=0; i<s.length()-1;i++)
				textField.setText(textField.getText()+s.charAt(i));
			
		}
	/***
	 * 
		if(e.getSource() == bsqr) {
			firstNumber = Double.parseDouble(textField.getText());
			operator = 5;
			
		}
		
		*
		*case 6:
					result = Math.sqrt(firstNumber);
					break;
				case 7:
					result = Math.pow(firstNumber, 3);
					break;
				case 8:
					result = Math.log10(firstNumber);
					break;
	 */
	
	
	
	}//end of action performed

}// end of Calculator
