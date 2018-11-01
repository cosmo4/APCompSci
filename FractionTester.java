
public class FractionTester {

	private static int num1;
	private static int den1;
	private static int num2;
	private static int den2;
	private static int newN1;
	private static int newN2;
	private static int newD1;
	private static int newD2;
	private static int num3;
	private static int den3;
	
	
	public static void main(String[] args) {
		
		Fraction myFraction = new Fraction("1/3");
		Fraction2 yourFraction = new Fraction2("4/5", null);
		
		num1 = myFraction.getNumerator();
		den1 = myFraction.getDenominator();
		num2 = yourFraction.getNum();
		den2 = yourFraction.getDen();
		
		newN1 = num1 * den2;
		newN2 = num2 * den1;
		newD1 = den1 * den2;
		newD2 = den1 * den2;
		
		num3 = newN1 + newN2;
		den3 = newD1 + newD2;
		
		
		
		System.out.println("Numerator: " + num1 + ", Denominator: " + den1);
		System.out.println("Numerator 2: " + num2 + ", Denominator 2: " + den2);
		System.out.println("Sum Numerator: " + num3 + ", Sum Denominator: " + den3);
	}
}
