package unit1;
import java.util.Scanner;
public class Meters_Feet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input feet amount!");
		double feet = sc.nextDouble();
		double meter = feet/3.28;
		System.out.print(feet + " feet is " + meter + " meters!");
	}
}
