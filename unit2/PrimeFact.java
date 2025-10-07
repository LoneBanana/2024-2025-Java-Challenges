package unit2;
import java.util.Scanner;
public class PrimeFact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a positive integer less than 2^31");
		int n = sc.nextInt();
		int i = 2;
		System.out.print(n + " = ");
		while (n!= 1) {
			if (n % i == 0) {
				if (n/i == 1) {
					System.out.print(i);
				} else {
					System.out.print(i + "*");
				}
				n /= i;
				i = 2;
				continue;
			}
			i++;
		}
	}
}