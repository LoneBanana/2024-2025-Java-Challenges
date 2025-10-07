package unit2;
import java.util.Scanner;
public class FactorsNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give a positive number to find the factors of");
		int n = sc.nextInt();
		if (n >0) {
			for (int i = 1; i <= n; i++) {
				if (n%i == 0) {
					System.out.println(i + " is a factor of " + n);
				}
			}
		} else {
			System.out.println("Reload, so that you can select a valid integer!");
		}
	}
}
