package unit2;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a number in the domain [1, 13)");
	int n = sc.nextInt();
	if (!(n >= 1 && n < 13)) {
		System.out.println("You did not follow the honors level expectation");
	}
	int c = n;
	for (int i = 2; i < n; i++) {
		c *= i;
	}
	System.out.println(n + "! = " + c);
	sc.close();
	}
}