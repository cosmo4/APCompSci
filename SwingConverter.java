import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingConverter implements ActionListener {

	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextArea resultArea;
	private JButton enterButton;
	private JTextField inputTextS;
	private JTextArea rsltArea;
	private JButton calcButton;
	double sA;
	
	

	public SwingConverter() {
		JFrame myWindow = new JFrame("Base Converter - Created by Luke Warner");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.add(inputPanel);
		myWindow.setSize(1000, 1000);
		myWindow.setVisible(true);

	}

	public JPanel initInputPanel() {

		JPanel panel = new JPanel();

		panel.setPreferredSize(new java.awt.Dimension(600, 500));
		panel.setLayout(null);

		JLabel label = new JLabel("Enter a base-10 number: ");
		label.setBounds(50, 50, 220, 30);
		panel.add(label);
		
		JLabel labelS = new JLabel("Enter Radius: ");
		labelS.setBounds(50, 400, 220, 30);
		panel.add(labelS);
		
		JTextField txt = null;
		inputTextS = new JTextField();
		@SuppressWarnings("null")
		String surf = txt.getText();
		
		sA = 4.0 * Math.PI * Double.parseDouble(surf) *Double.parseDouble(surf);
		txt = inputTextS;
		txt.setBounds(150, 400, 100, 30);
		panel.add(txt);

		JTextField text; // weird, but I'm not going to freak out ...
		text = inputText = new JTextField();
		text.setBounds(230, 50, 100, 30);
		panel.add(text);
		
		JButton eButton = new JButton("Calc");
		eButton.setActionCommand("Calc");
		eButton.setBounds(260, 400, 80, 30);
		eButton.addActionListener(this);
		panel.add(eButton);
		calcButton = eButton;

		JButton button = new JButton("ENTER");
		button.setActionCommand("ENTER");
		button.setBounds(340, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		// save to the class variable, to be used in other methods
		enterButton = button; // assign it to a class var to be used in other methods

		button = new javax.swing.JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(430, 50, 80, 30);
		button.addActionListener(this);
		panel.add(button);
		
		JButton buttonR = new javax.swing.JButton("Reset");
		buttonR.setActionCommand("Reset");
		buttonR.setBounds(360, 400, 80, 30);
		buttonR.addActionListener(this);
		panel.add(buttonR);

		resultArea = new JTextArea();
		resultArea.setBounds(50, 180, 500, 200);
		resultArea.setEditable(false);
		resultArea.setBackground(java.awt.Color.GREEN);
		panel.add(resultArea);
		
		rsltArea = new JTextArea();
		rsltArea.setBounds(50, 450, 500, 100);
		rsltArea.setEditable(false);
		rsltArea.setBackground(java.awt.Color.YELLOW);
		panel.add(rsltArea);
		

		return panel;
	}

	public static void main(String[] args) throws Exception {
		// SwingConverter baseConverter = new SwingConverter();
		new SwingConverter();

	}

	@Override
	public void actionPerformed(ActionEvent ev) {

		String command = ev.getActionCommand();
		if (command.equals("ENTER")) {
			showResult();
		} else if (command.equals("Calc")) {
			shwRad();
		} else if (command.equals("Reset")) {
			reset();
		
		}

	}

	private void showResult() {
		// System.out.println("showResult entered");

		String hexUpperCase;
		inputText.setEnabled(false);
		enterButton.setEnabled(false);
		Integer n = getInputNumber();
		if (n == null) {
			resultArea.append("Invalid number !");
			return;
		}
		int baseTenNumber = n.intValue();
		resultArea.append("decimal = " + baseTenNumber + "\n");
		resultArea.append("binary = " + Integer.toString(baseTenNumber, 2) + "\n");
		resultArea.append("octal = " + Integer.toString(baseTenNumber, 8) + "\n");
		resultArea.append("hexadecimal = " + Integer.toString(baseTenNumber, 16) + "\n");
		
		
		
		hexUpperCase = Integer.toString(baseTenNumber, 16).toUpperCase();
		resultArea.append("hexadecimal = " + hexUpperCase + "\n");

	}
	
	private void shwRad() {
		
		inputTextS.setEnabled(false);
		calcButton.setEnabled(false);
		Integer d = getInputNumber();
		if (d == null) {
			rsltArea.append("Invalid number !");
			return;
		}
		rsltArea.append("Surface Area = " + sA + "\n");
		rsltArea.append("Volume = " + inputTextS + "\n");
		
	}

	private Integer getInputNumber() {
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
		} catch (Exception e) {
			/* oops! problem with number entry
			this trips that error, now tell user the error
			and let them try an entry again return null is to prevent a total crash, but it really is not fixing the problem
			Not Good!!!!
			*/
			return null;
		}
	}

	private void reset() {
		// System.out.println("reset entered");
		inputText.setText("");
		resultArea.setText("");
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputText.requestFocus();
		inputTextS.setText("");
		rsltArea.setText("");
		inputTextS.setEnabled(true);
		calcButton.setEnabled(true);
		
	}

}
