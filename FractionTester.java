
public class FractionTester {

	public static void main(String[] args) {
		
		Fraction myFraction = new Fraction("1/3");
		Fraction yourFraction = new Fraction("4/13");
		
		System.out.println("Numerator: " + myFraction.getNumerator() + ", Denominator: " + myFraction.getDenominator());
		System.out.println("Numerator 2: " + yourFraction.getNum() + ", Denominator 2: " + yourFraction.getDen());
	}
}
