package unit2;
import java.util.Scanner;
public class PerfectSquare {
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Input positive number");
		int n = sc.nextInt();
		if (Math.sqrt(n) != (int) Math.sqrt(n)) {
			System.out.println("This number is not a perfect square!");
		} else {
			System.out.println("This number is a perfect number!");
		}
		
	}
}