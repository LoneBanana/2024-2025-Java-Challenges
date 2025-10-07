package unit2;
import java.util.Scanner;
public class GuessMyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1 + (int) Math.floor(100*Math.random());
		System.out.println("Guess the random number!" + n);
		int input = sc.nextInt();
		int c = 0;
		while (input != n) {
			if (c == 10) {
				break;
			}
			if (input > n) {
				System.out.println("Number is too high");
				input = sc.nextInt();
				continue;
			} else if (input < n) {
				System.out.println("Number is too low");
				input = sc.nextInt();
				continue;
			}
			c++;
		}
		if (input == n) {
		System.out.println("You got it!");
		} else {
			System.out.println("Try again next time!");
		}
	}
}