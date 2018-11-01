import javax.swing.JOptionPane;

public class Cuboid {

	private double sideA, sideB, sideC;

	public void setCuSides() {

		boolean l = true;
		while (l) {
			try {
				sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side A: "));
				l = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
		boolean t = true;
		while (t) {
			try {
				sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side B: "));
				t = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
		boolean m = true;
		while (m) {
			try {
				sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter Side C: "));
				m = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Please Enter A Number: ");
			}
		}
	}// end of set sides

	public void calcVol() {

		double volCu = sideA * sideB * sideC;

		JOptionPane.showMessageDialog(null, "Volume: " + volCu);

	}

	public void calcSurfArea() {

		double surfArea = (2 * sideA * sideB) + (2 * sideB * sideC) + (2 * sideA * sideC);

		JOptionPane.showMessageDialog(null, "Surface Area: " + surfArea);

	}

}// end of class
