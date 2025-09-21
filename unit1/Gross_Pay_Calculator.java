package unit1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Gross_Pay_Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("$#.##");
		System.out.println("How many hours do you  work?");
		double hours = sc.nextDouble(), payRate, gross;
		System.out.println("What is your rate of pay, in dollars per hour?");
		payRate = sc.nextDouble();
		gross = payRate*hours;
		System.out.println(df.format(gross));
	}
}
