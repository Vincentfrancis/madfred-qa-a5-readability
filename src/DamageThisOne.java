import java.util.Scanner;

public class DamageThisOne {

	/**
	 * @author Clyde Brown
	 * @version 1.0
	 * @date August 12, 2013
	 * @param void
	 */
	
	public static void main(String[] args) {
		//This section declares something
		int ticketNumber, stem, checkDigit;
			Scanner sc = new Scanner(System.in);
		
		/* This section requests numbers from the scanner
		 */
		System.out.print("Please enter a six-digit ticket number: ");
			ticketNumber = sc.nextInt();
			
			
			
		stem = ticketNumber / 10;
			checkDigit = ticketNumber % 10;	

		/* This section calls the scanner
		 */
		while (checkDigit != stem % 7) {
				System.out.println("That is NOT a valid ticket number, bucko!");
			System.out.print("Try again: ");
			
			
				ticketNumber = sc.nextInt();
				
				
			stem = ticketNumber / 10;
			
				checkDigit = ticketNumber % 10;	
		}
						
					System.out.println("That is a valid ticket number, well done!");
	// this is the end of the program
	}

}
