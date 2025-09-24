package unit1;
import java.util.Scanner;
public class String_Splitter {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String");
		String str = sc.nextLine(); int x;
		System.out.println("Input the number of characters you want to make substring from");
		x = Integer.parseInt(sc.nextLine());
		System.out.println(str.substring(0, x));
		System.out.println(str.substring(x, str.length()));
	}
}