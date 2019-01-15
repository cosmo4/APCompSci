import java.util.Scanner;

public class Cipher {
	
	private String alpha = "zebracdfghijklmnopqstuvwxy0123456789.:;?\"-[]'";
	private String plainText = "";
	private String encodedText = "";
	private String decodedText = "";
	private int key = 0;
	private String choice = "";
	
	Scanner kbd = new Scanner(System.in);
	
	
	public Cipher() {
		
		System.out.println("Entered the Caesar constructor");
		
	}
	public void getPlainText() {
		
		System.out.println("Enter Plain Text message");
		plainText = kbd.nextLine();
		plainText = plainText.toLowerCase();
		
		
		
	}
	
	public void getEncodedText() {
		
		System.out.println("Enter Encoded text message");
		encodedText = kbd.nextLine();
	}
	
	public void getKey() {
		
		System.out.println("Enter the Key");
		key = kbd.nextInt();
		System.out.println("entered: " + key);
	}

	public void encrypt() {
		
		for (int i = 0; i < plainText.length(); i++) {
			if(!alpha.contains(String.valueOf(plainText.charAt(i)))) {
				encodedText += " ";
			}
			else {	
				encodedText += alpha.charAt((alpha.indexOf(plainText.charAt(i)) + key) % alpha.length());
			}
		}
		System.out.println("Encoded text: " + encodedText);
	}
	
	public void decrypt() {
		
		for (int i = 0; i < encodedText.length(); i++) {
			encodedText.charAt(i);
			alpha.lastIndexOf(encodedText.charAt(i));
			//make the negative output subtract from the last value in alpha
			if (alpha.lastIndexOf(encodedText.charAt(i)) >= key) {
				decodedText += alpha.charAt((alpha.lastIndexOf(encodedText.charAt(i)) - key) % alpha.length());
			
			}
			else {
				decodedText += alpha.charAt((alpha.lastIndexOf(encodedText.charAt(i)) - key) % alpha.length());
			}
		}
			
		System.out.println("Decoded Text: " + decodedText);
	}
	
	public String encryptDecrypt() {
		while (true) {
			System.out.println("would you like to encrypt or decrypt?");
			choice = kbd.nextLine();
			choice = String.valueOf(choice.charAt(0)).toUpperCase();
			if(choice.equals("E") || choice.equals("D")) {
				break;
			}
			else {
				System.out.println("Error! Please try again.");
			}
		}	
		System.out.println("The answer: " + choice);
		return choice;
		
	}
	
	
}
