package unit2;
import java.util.Scanner;
public class SimplifyingRadicals {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int n = sc.nextInt();
		if (n > 0) {
			int max = 1;
			while (Math.pow(max, 2) <= n) {
				max++;
			}
			max--;
			int i;
			for (i = max; i >= 1; i--) {
				if (n % Math.pow(i, 2) == 0) {
					max = (int) Math.pow(i, 2);
// Here, variable "max" is re-purposed as a way to denote the number resulting from division of "n" by the max square number.
					max = n/max;
//I.e: "max" variable now represents the "number remaining after dividing by the perfect square".
					break;
				}
			}
		if (max == 1) {
			System.out.println("√(" + n + ") = " + i);
			
		} else if (max != 1 && i!=1) {
			System.out.println("√(" + n + ") = " + i + " * √(" + max + ")");
			
		} else {
			System.out.println("√(" + n + ")");
		}
			
		} else {
			System.out.println("The number you entered is negative. Please try again!");
		}
		sc.close();
	}
}