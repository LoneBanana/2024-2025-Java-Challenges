package unit1;
import java.util.Random;
public class Lottery_Ticket_Generator {
	public static void main(String[] main) {
		Random r = new Random();
		int n1=r.nextInt(1, 71), 
			n2=r.nextInt(1, 71),
			n3=r.nextInt(1, 71),
			n4=r.nextInt(1, 71),
			n5=r.nextInt(1, 71), 
			n6=r.nextInt(1, 71);
		String c = ", ";
		System.out.println(n1 + c + n2 + c + n3 + c + n4 + c + n5 + c + n6);
	}
}
