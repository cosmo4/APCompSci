
public class Fraction {

	private int n1;
	private int d1;
	
	
	
	public int getNumerator() {
		return n1;
	}


	public void setNumerator(int numerator) {
		this.n1 = numerator;
	}


	public int getDenominator() {
		return d1;
	}


	public void setDenominator(int denominator) {
		this.d1 = denominator;
	}


	public Fraction (String passFraction1) {
		
		int separatorLocation = passFraction1.indexOf("/");
		String strNumerator = passFraction1.substring(0,
				separatorLocation);
		String strDenominator = passFraction1
				.substring(separatorLocation + 1);

		this.n1 = Integer.parseInt(strNumerator);
		this.d1 = Integer.parseInt(strDenominator);

		
	}

	
	
}
