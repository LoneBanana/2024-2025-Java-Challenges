package unit2;
import java.util.Scanner;
public class MathLibrary {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What formula would you like to choose?"
				+ "\n"
				+ "1) Pythagorean Formula"
				+ "\n"
				+ "2) Area of Rectangle");
		String choice = sc.nextLine();
		switch (choice) {
			case "1":
				System.out.println("Input a and b values of the rigjht triangle");
				double a = sc.nextDouble(), b = sc.nextDouble();
				System.out.println("Here is the length of the hypotenuse: " + Math.hypot(a,b));
				break;
			case "2":
				System.out.println("Input the l and w values for the rectangfle");
				double l = sc.nextDouble(), w = sc.nextDouble();
				System.out.println(l*w + " units squared");
				break;
			default:
				
				break;
		}

	}
}