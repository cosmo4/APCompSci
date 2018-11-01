
public class Fraction {

	private int numerator;
	private int denominator;
	private int num;
	private int den;
	
	
	public int getNumerator() {
		return numerator;
	}


	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}


	public int getDenominator() {
		return denominator;
	}


	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}


	public Fraction (String passFraction) {
		
		int separatorLocation = passFraction.indexOf("/");
		String strNumerator = passFraction.substring(0,
				separatorLocation);
		String strDenominator = passFraction
				.substring(separatorLocation + 1);

		this.numerator = Integer.parseInt(strNumerator);
		this.denominator = Integer.parseInt(strDenominator);

		
	}

	public int getNum() {
		return num;
	}

	public int getDen() {
		return den;
	}
	
	public Fraction (String passFraction1, String passFraction2) {
		
		int separatorLocation = passFraction1.indexOf("/");
		String strNumerator = passFraction1.substring(0,
				separatorLocation);
		String strDenominator = passFraction1
				.substring(separatorLocation + 1);

		this.num = Integer.parseInt(strNumerator);
		this.den = Integer.parseInt(strDenominator);
		
	}
}
