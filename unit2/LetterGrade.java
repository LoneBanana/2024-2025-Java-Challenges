package unit2;
import java.util.Scanner;
public class LetterGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What grade did you get?");
		double n = sc.nextDouble();
		print("Here is the letter grade you have received on the test!");
		if (n >=97)
			print("A+");
		else if (n>=93)
			print("A");
		else if (n>=90)
			print("A-");
		else if (n>=87)
			print("B+");
		else if (n>=83)
			print("B");
		else if (n>=80)
			print("B-");
		else if (n>=77)
			print("C+");
		else if (n>=73)
			print("C");
		else if (n>=70)
			print("C-");
		else if (n>=65)
			print("D");
		else
			print("F");
	}
	static void print(String txt) {
		System.out.println(txt);
	}
}