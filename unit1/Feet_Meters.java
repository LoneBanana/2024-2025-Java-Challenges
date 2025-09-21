package unit1;
import java.util.Scanner;
public class Feet_Meters {
	public static void main(String[] main) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input feet!");
		double feet = sc.nextDouble();
		double meters = feet*3.28;
		System.out.println("You have " + feet + " feet for " + meters + " meters");
		
	}
}
