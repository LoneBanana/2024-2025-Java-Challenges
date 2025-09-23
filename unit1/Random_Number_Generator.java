package unit1;
import java.util.Random;
import java.util.Scanner;
public class Random_Number_Generator {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a min value!");
		int min = sc.nextInt(), max;
		System.out.println("Enter a max valie!");
		max = sc.nextInt();
		int rand = r.nextInt(min, max+1);
		System.out.println(rand);
	}
}
