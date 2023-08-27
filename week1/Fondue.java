import java.util.Scanner;

public class Fondue {
	private static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// Number of people considered for the quantities used in the recipe
		final int BASE = 4;
		// Initial mass of cheese (g); 
		double cheese = 800.0;
		// Initial volume of water (dL);
		double water = 2.0;
		// Number of garlic gloves
		double garlicGloves = 2.0;
		// Initial mass of bread (en g)
		double bread = 400.0;
		
		System.out.println("Enter the number of people invited to the Fribourg fondue : ");
		int numberGuests = clavier.nextInt();
		
		// New quantities for the recipe
		double ratio = (double)numberGuests/BASE;
		cheese *= ratio;
		water *= ratio;
		garlicGloves *= ratio;
		bread *= ratio;
		
		System.out.println("To prepare a Fribourg fondue for " + numberGuests + " persons, you need : ");
		System.out.println("-  " + cheese + " g of Vacherin fribourgeois ;");
		System.out.println("-  " + water + " dL of water ;");
		System.out.println("-  " + garlicGloves + " garlic glove" + (garlicGloves > 2 ? "s" : "") + " ;");
		System.out.println("-  " + bread + " g of bread ;");
		System.out.println("-  pepper as desired.");
	}
}
