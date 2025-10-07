
package unit2;
// import Scanner class
import java.util.Scanner;


public class lab2_2 
{
	public static void main(String args[])
	{
		// declare and instantiate Scanner Object
		Scanner sc = new Scanner(System.in);
		
		// SECTION 1
		
		// Declare variables
		int num;
		// Prompt the user to enter a positive integer and take input
		System.out.print("Enter a positive integer: ");
		num = sc.nextInt();
		
		// Make sure num is not negative, uncomment the next line after replacing the condition
		if (num >= 0) {
			// take the square root of num
			System.out.println(Math.sqrt(num));
		}
		// Handle negative inputs
		if (num < 0)
		{
			System.out.println("FOLLOW DIRECTIONS!");
		}
		
		
		// SECTION 2
		
		// reset scanner
		sc.nextLine();
		
		// Declare variables
		String pw;
		
		// Prompt the user to enter a password and take input
		System.out.print("Enter a password of at least 8 characters: ");
		pw = sc.nextLine();
		
		
		// Use an if/else statement to determine if the password is long enough
		// Determine if the password is at least 8 characters long
		
		// Otherwise print that the password is too short
		if (pw.length() >= 8) {
			System.out.println(pw);
		} else {
			System.out.println("the password is too short");
		}
		
		
		// SECTION 3
		
		// Declare variables
		double GPA;
		
		// prompt the user to enter their GPA and take input
		System.out.println("Enter your unweighted GPA: ");
		GPA = sc.nextDouble();
		
		// Use an if/else if/else chain to translate the GPA into a base letter grade (A/B/C/D/F) and print it
		
		if (GPA >= 3.9) {
			System.out.println("A");
		} else if (GPA >= 3.5) {
			System.out.println("B");
		} else if (GPA >= 3.0) {
			System.out.println("C");
		} else if (GPA >= 2.5) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	
		// SECTION 4
		
		// Declare variables
		int age;
		
		// prompt the user to enter their age and take input
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		
		// Determine driving status
		// The conditions are not in the proper order. Rearrange them so that it is correct
		
		if(age >= 21)
		{
			System.out.println("You can get a regular (landscape) driver's license now!");
		} else if(age >= 18) {
			System.out.println("You can upgrade to a regular (portrait) driver's license");
		} else if(age >= 17) {
			System.out.println("You can get a probationary license");
		}
		else if(age >= 16)
		{
			System.out.println("You can get a learner's permit");
		}
		
		
		
		// close the scanner
		sc.close();
	}

}
