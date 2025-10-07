package unit2;

// import random and scanner classes
import java.util.*;

public class Lab2_6 
{
	public static void main(String args[])
	{
		// declare random object
		Random r = new Random();
		
		// declare Scanner object
		Scanner sc = new Scanner(System.in);
		
		
		
		
		// SECTION 1
		
		// declare variables
		int choice;
		
		// loop until the user decides to exit. There will be an error in this portion of the code 
		// until you take choice from the user.
		do
		{
			System.out.println("Pick an option: 1, 2, 3, 0");
			choice = sc.nextInt();
			
			// prompt the user to pick from a list of 3 options and include a 4th option to terminate the loop.
			
			// take in the input using scanner and store the result to 'choice'
			
			// handle the choice
			if(choice == 1)
			{
				System.out.println("Excellent Choice!");
			}
			else if (choice == 2)
			{
				System.out.println("Nice Selection!");
			}
			else if(choice == 3)
			{
				System.out.println("Awesome Option!");
			}
			else if (choice == 0)
			{
				System.out.println("Loop Terminating");
			}
			else
			{
				System.out.println("Invalid Input Detected");
			}
		}while(choice != 0);
		
		
		
		
		// SECTION 2
		
		int prod = 1, factor = 2, max;
		
		// prompt the user for the max value
		System.out.print("Enter max value: ");
		max = sc.nextInt();
		
		// set up a do while loop that will continue to multiply prod by factor until prod is greater than the number the user entered.
		do {
			prod *= factor;
		} while (prod <= max);
		System.out.println(prod);
		// print out the final product
		System.out.println("The final product is: " + prod);
		
		
		
		
		// SECTION 3
		
		// declare variables, control will cause an error because it has not been defined. 
		// Once you rewrite the while loop into a do-while loop the error will disappear
		int control, count = 0;
		// set up a loop to continue generating a random number until control equals 50.
		// rewrite the loop below to use a do-while loop instead of a regular while loop.
		do {
			control = r.nextInt(100) + 1;
		} while(control != 50);
		System.out.println("I finally generated " + control);
		
		// close the scanner
		sc.close();
	}
}
