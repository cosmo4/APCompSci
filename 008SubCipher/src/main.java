
public class main {
	
	public static void main(String[] args) {
		
		Cipher openCaesar = new Cipher();
		
		
		//first ask if they want to encrypt or decrypt
		String crypt = openCaesar.encryptDecrypt();
		//System.out.println("main, returned: " + crypt);
		switch (crypt) {
		case "E":
			System.out.println("You have chosen encrypt");
			openCaesar.getPlainText();
			openCaesar.getKey();
			openCaesar.encrypt();
			break;
		case "D":
			System.out.println("You have chosen decrypt");
			openCaesar.getEncodedText();
			openCaesar.getKey();
			openCaesar.decrypt();
			break;
		}
		
		
		
	}

}
