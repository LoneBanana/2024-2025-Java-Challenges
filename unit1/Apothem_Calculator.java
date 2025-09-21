package unit1;
import java.util.Scanner;
public class Apothem_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double apothem, l, numSides;
		System.out.println("Enter the number of sides!");
		numSides = sc.nextDouble(); 
		System.out.println("Enter the length of one side of the regular polygon");
		l = sc.nextDouble();
		System.out.println();
		apothem = l/(2*Math.tan(Math.PI/numSides));
		System.out.println("The apothem length is " + apothem + " units");
		
	}
}