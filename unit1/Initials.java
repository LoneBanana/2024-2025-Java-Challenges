package unit1;
import java.util.Scanner;
public class Initials {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Full Name:");
		String fullName = sc.nextLine(), fInitial, lInitial;
		fInitial = fullName.substring(0, 1);
		lInitial = fullName.substring(fullName.indexOf(" ")+1, fullName.indexOf(" ")+2);
		
		System.out.println(fInitial + "." + lInitial + ".");
	}
}