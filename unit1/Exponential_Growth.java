package unit1;
import java.util.Scanner;
public class Exponential_Growth {
	public static void main(String[] args) {
		double a, r, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input initial value");
		a = sc.nextDouble();
		System.out.println("Input rate");
		r = sc.nextDouble();
		System.out.println("Input time");
		x = sc.nextDouble();
		System.out.println("Value: " + Math.pow((a+r), x));
	}
}
