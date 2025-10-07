package unit2;
import java.util.Scanner;
public class QuadSolutions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a, b, and c terms (in that order) of quadratic");
		double a, b, c;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double d = Math.sqrt(Math.pow(b, 2) - 4*a*c);
		if (d > 0)
			System.out.println("The solution is " + (-b + d)/(2*a) + " and " + (-b - d)/(2*a));
		else if (d == 0)
			System.out.print("The solution is " + (-b/(2*a)));
		else
			System.out.println("No real number solutions");
	}
}