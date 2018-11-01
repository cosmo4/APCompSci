import javax.swing.JOptionPane;

public class Circle {

	// variables
	private double radius = 0.0, circum = 0.0, circArea = 0.0;

	public void getRad() {

		boolean l = true;
		while (l) {
			try {
				radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius" + ": "));
				l = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}

	}

	public void calcCirc() {

		circum = radius * 2 * Math.PI;
		JOptionPane.showMessageDialog(null, "Circumference: " + circum);

	}

	public void calcCArea() {

		circArea = Math.PI * (radius * radius);
		JOptionPane.showMessageDialog(null, "Area: " + circArea);

	}

}// end of class
