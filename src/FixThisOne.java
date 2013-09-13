import java.util.Scanner;

public class FixThisOne {

	public static void main(String[] args) 
	{
		//This program calculates the price of eggs to be purchased
		
		//assigning variables
		final float PRICE_PER_DOZEN = 3.25f;final float PRICE_PER_SINGLE = 0.45f;
		int eggs, d, s;
		float dozens_cost, singlesCost, tc;
		
		// calling scanner and excepting input
		Scanner kbrd = new Scanner(System.in);
		System.out.print("How many eggs do you want? >> ");
		eggs = kbrd.nextInt();
		
		//Calculations
		d = eggs / 12;
		s = eggs % 12;
		dozens_cost = d * PRICE_PER_DOZEN;
		singlesCost = s * PRICE_PER_SINGLE;
		tc = dozens_cost + singlesCost;
		
		//Customers ordered output
		
		System.out.println("You ordered " + eggs + " eggs in total.");
		System.out.println("That's " + d + " dozen at $3.25, or $" + dozens_cost);
		System.out.println("That's " + s + " singles at 45c, or $" + singlesCost);
		System.out.println("Your total cost is $" + tc);
		
	
	}

}
