import javax.swing.JOptionPane;

public class Rectangle {

	//Variables
	private double side1, side2;
	private double rectPerm;
	private double rectArea;
	
	public void setVarsToZero() {
		side1 = 0.0;
		side2 = 0.0;
		rectPerm = 0.0;
		rectArea = 0.0;
		
	}
	
	public void showVars() {
		String vars =
				"Side 1, Side 2: " + side1 + ", " + side2 + ", Perimeter : " + rectPerm + ", Area: " + rectArea;
		
		JOptionPane.showMessageDialog(null, vars);
		
	}// end of showVars()
	
	public void setSides() {
		boolean l = true;
		while (l) {
			try {
				side1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side 1: "));
				l = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
		boolean b = true;
		while (b) {
			try {
				side2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side 2: "));
				b = false;
			}catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
	}//end of setSides()
	
	public void calcPerm() {
		
		rectPerm = side1*2 + side2*2;
		
		JOptionPane.showMessageDialog(null, "Perimeter: " + rectPerm);
		
	}
	
	public void calcArea() {
		
		rectArea = side1*side2;
		
		JOptionPane.showMessageDialog(null, "Area: " + rectArea);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}//end of class
