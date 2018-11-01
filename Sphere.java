import javax.swing.JOptionPane;

public class Sphere {

	// variables
	private double SphRadius = 0.0;

	public void getRad() {

		boolean l = true;
		while (l) {
			try {
				SphRadius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius" + ": "));
				l = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}

	}

	public void calcVol() {

		double SphVol = SphRadius * SphRadius * SphRadius * 1.33333333333 * Math.PI;
		JOptionPane.showMessageDialog(null, "Volume: " + SphVol);

	}

	public void calcSurfArea() {

		double SSA = 4.0 * Math.PI * (SphRadius * SphRadius);
		JOptionPane.showMessageDialog(null, "Surface Area: " + SSA);

	}

}// end of class
