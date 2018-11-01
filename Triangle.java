import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;
	
	Scanner keyboard = new Scanner(System.in);

	// constructor goes here
	public Triangle() {

	}

	// methods go here

	public void setVarsToZero() {

		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;

	} // end of setVarsToZero

	public void showVars() {
		
		//System.out.println("Side A = " + sideA);
		//System.out.println("Side B = " + sideB);
		//System.out.println("Side C = " + sideC);
		//System.out.println("Perimeter = " + perimeter);
		//System.out.println("Area = " + theArea);
		
		String msg = 
				"Side A, B, C = " + sideA + ", " + sideB + ", " + sideC
				+ "; perimeter: " + perimeter
				+ "; area: " + theArea;
		
		JOptionPane.showMessageDialog(null,  msg);
		
				
		
	} // end of showVars

	public void setSides() {
		//System.out.println("Please enter the value for side A:");
		//sideA = keyboard.nextDouble();
		boolean a = true;
		while (a) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side A: "));
				a = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
		
		//System.out.println("Please enter the value for side B:");
		//sideB = keyboard.nextDouble();
		boolean b = true;
		while (b) {
			try {
				sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side B: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
		//System.out.println("Please enter the value for side C:");
		//sideC = keyboard.nextDouble();
		boolean c = true;
		while (c) {
			try {
				sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side C: "));
				c = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
		
		
	}//end of setSides

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;
		
	}// end of calcPerimeter

	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC)/2.0;
		
		theArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
		
	}// end of calcArea
	
	public void calcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0, cosB = 0.0, Bcos = 0.0, Bdeg = 0.0, Cdeg = 0.0;
		
		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0))/
				(2.0 * sideB * sideC);
		//System.out.println("cosA = " + cosA);
		Acos = Math.acos(cosA);
		//System.out.println("arcCos = " + Acos);
		Adeg = Math.toDegrees(Acos);
		//System.out.println("angle of A = " + Adeg);
		
		//Cosine of B
		
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0))/
				(2.0 * sideC * sideA);
		//System.out.println("cosB = " + cosB);
		Bcos = Math.acos(cosB);
		//System.out.println("arcCos = " + Bcos);
		Bdeg = Math.toDegrees(Bcos);
		//System.out.println("angle of B = " + Bdeg);
		

		//Cosine of C
		
		//cosB = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0))/
		//(2.0 * sideA * sideB);
		//System.out.println("cosC = " + cosC);
		//Ccos = Math.acos(cosC);
		//System.out.println("arcCos = " + Ccos);
		//Cdeg = Math.toDegrees(Ccos);
		Cdeg = 180.0 - Adeg - Bdeg;
		//System.out.println("angle of C = " + Cdeg);
		String ang =
				"Angle A: " + Adeg + ", " + "Angle B: " + Bdeg + ", " + Cdeg;
		
				
		JOptionPane.showMessageDialog(null, ang);
		

	
	}

} // end of class