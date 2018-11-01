
public class Fraction2 {
	
	private int n2;
	private int d2;
	
	public int getNum() {
	return n2;
	
	}

	public void setNum(int num) {
		this.n2 = num;
		
	}
	
	public int getDen() {
		return d2;
	}
	
	public void setDen(int den) {
		this.d2 = den;
		
	}
	
	
	public Fraction2 (String passFraction1, String passFraction2) {
		
		int separatorLocation = passFraction1.indexOf("/");
		String strNumerator2 = passFraction1.substring(0,
				separatorLocation);
		String strDenominator2 = passFraction1
				.substring(separatorLocation + 1);

		this.n2 = Integer.parseInt(strNumerator2);
		this.d2 = Integer.parseInt(strDenominator2);
		
	}
	
	

}
