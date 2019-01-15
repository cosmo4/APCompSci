import java.util.Scanner;

import javax.swing.JOptionPane;

public class CaesarCipher {
	
	private String alpha = "abcdefghijklmnopqrstuvwxyz ";
	private String plainText = "";
	private String encodedText = "";
	private String decodedText = "";
	private int key = 0;
	private String choice = "";
	
	Scanner kbd = new Scanner(System.in);
	
	
	public CaesarCipher() {
		
		//System.out.println("Entered the Caesar constructor");
		
	}
	public void getPlainText() {
		
		plainText = JOptionPane.showInputDialog("Enter Plain Text message");
		//plainText = kbd.nextLine();
		//System.out.println("yuh entered: " + plainText);
		
		
	}
	
	public void getEncodedText() {
		
		encodedText = JOptionPane.showInputDialog("Enter Encoded text message");
		//encodedText = kbd.nextLine();
	}
	
	public void getKey() {
		
		key = Integer.parseInt(JOptionPane.showInputDialog("Enter the Key"));
		//key = kbd.nextInt();
		//System.out.println("entered: " + key);
	}

	public void encrypt() {
		
		for (int i = 0; i < plainText.length(); i++) {
			plainText.charAt(i);
			//System.out.println(plainText.charAt(i));
			alpha.indexOf(plainText.charAt(i));
			encodedText += alpha.charAt((alpha.indexOf(plainText.charAt(i)) + key) % alpha.length());
			
		}
		JOptionPane.showMessageDialog(null, "Encoded text: " + encodedText);
	}
	
	public void decrypt() {
		
		for (int i = 0; i < encodedText.length(); i++) {
			encodedText.charAt(i);
			alpha.lastIndexOf(encodedText.charAt(i));
			//make the negative output subtract from the last value in alphauifmephmgbomvaz
			if (alpha.lastIndexOf(encodedText.charAt(i)) >= key) {
				decodedText += alpha.charAt((alpha.lastIndexOf(Math.abs(encodedText.charAt(i)) - key)) % alpha.length());
			
			}
			
		}
			
		JOptionPane.showMessageDialog(null, "Decoded Text: " + decodedText);
	}
	
	
	public String encryptDecrypt() {
		while (true) {
			choice = JOptionPane.showInputDialog(("would you like to encrypt or decrypt?"));
			//choice = kbd.nextLine();
			choice = String.valueOf(choice.charAt(0)).toUpperCase();
			if(choice.equals("E") || choice.equals("D")) {
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Error! Please try again.");
			}
		}	
		//System.out.println("The answer: " + choice);
		return choice;
		
	}
	
	
}
