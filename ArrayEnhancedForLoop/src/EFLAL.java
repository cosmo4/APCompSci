import java.util.ArrayList;
import java.util.List;

public class EFLAL {

	public static void main(String[] args) {
		
		List<String> listOfStrings = new ArrayList<String>();
		
		listOfStrings.add("AAA");
		listOfStrings.add("BBB");
		listOfStrings.add("CCC");
		listOfStrings.add("DDD");
		listOfStrings.add("EEE");
		listOfStrings.add("FFF");
		listOfStrings.add("GGG");
		listOfStrings.add("HHH");
		
		
		System.out.println("\nList items: ");
		for(String s: listOfStrings) {
			System.out.println(s);
		}
		
		System.out.println("\n" + listOfStrings.remove(0));
		
		System.out.println("\nList items: ");
		for(String s: listOfStrings) {
			System.out.println(s);
		}

	}

}
