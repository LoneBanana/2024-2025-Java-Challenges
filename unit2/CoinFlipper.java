package unit2;
import java.util.*;
public class CoinFlipper {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	System.out.println("Pick Heads (1) or Tails (2)");
	int choice = sc.nextInt();
	int c = 0;
	do {
		c++;
	} while(r.nextInt(1, 3) == choice);
	System.out.println("Number of times you flipped "
			+ "your choice: " + c);
	sc.close();
	}
}