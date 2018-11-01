import javax.swing.JOptionPane;

public class Runner {

	/**********************
	 * 
	 * Circle: input r, calculate circumference, area Rectangle: input side A,B,
	 * calc perimeter, area, and diagonal Triangle: Input sides A, B, C, calc
	 * perimeter, area, all angles Cuboid: input sides A, B, C, calc volume, total
	 * surface area Sphere: INput radius, calc volume, and surface area TOTAL
	 * celebration dance for tons of great java that you have learned!
	 * 
	 * pi * r^2 Math.pi*Math.pow(r, 2);
	 * 
	 */

	public static void main(String[] args) {

		// Instantiate each class

		Triangle myTriangle = new Triangle();

		Rectangle myRect = new Rectangle();

		Circle myCirc = new Circle();

		Cuboid myCub = new Cuboid();

		Sphere mySph = new Sphere();

		int goAgain = 1;

		while (goAgain == 1) {

			String msg = "Please enter your selection: Triangle, Circle, Rectangle, Cuboid, or Sphere";
			String answer = JOptionPane.showInputDialog(msg);

			JOptionPane.showMessageDialog(null, answer);

			// When comparing strings, == is unreliable - do not use ==
			// instead, use String class methods .equals
			if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {

				JOptionPane.showMessageDialog(null, "Yes! we are in Triangle");

				myTriangle.setVarsToZero();
				myTriangle.showVars();
				myTriangle.setSides();
				myTriangle.showVars();
				myTriangle.calcPerimeter();
				myTriangle.showVars();
				myTriangle.calcArea();
				myTriangle.showVars();
				myTriangle.calcAngles();

			} else if (answer.equals("Rectangle")) {

				JOptionPane.showMessageDialog(null, "Yes! we are in Rectangle");

				myRect.setVarsToZero();
				myRect.showVars();
				myRect.setSides();
				myRect.showVars();
				myRect.calcPerm();
				myRect.showVars();
				myRect.calcArea();
				myRect.showVars();

			} else if (answer.equals("Circle")) {

				JOptionPane.showMessageDialog(null, "Yes! we are Circle");

				myCirc.getRad();
				myCirc.calcCirc();
				myCirc.calcCArea();

			} else if (answer.equals("Sphere")) {

				JOptionPane.showMessageDialog(null, "Yes! we are in Sphere");

				mySph.getRad();
				mySph.calcVol();
				mySph.calcSurfArea();

			} else if (answer.equals("Cuboid")) {

				JOptionPane.showMessageDialog(null, "Yes! we are in Cuboid");

				myCub.setCuSides();
				myCub.calcVol();
				myCub.calcSurfArea();

			} else {

				JOptionPane.showMessageDialog(null, "Yikes! I don't know what you mean");

			}
			msg = "Would you like to go again Y/N";
			answer = JOptionPane.showInputDialog(msg);

			JOptionPane.showMessageDialog(null, answer);

			if ((answer.equals("Y") || answer.equals("y") || answer.equals("Yes")) || answer.equals("yes")) {
				goAgain = 1;
			} else {
				goAgain = 0;
				JOptionPane.showMessageDialog(null, "Thank you! come Again!");

			}

		}

	} // end of main

} // end of runner
