package unit1;
import java.util.Random;
public class TV_Volume_Recommender {
	public static void main(String[] args) throws Exception {
	int min = 0;
	int max = 50;
	int multiple = 5;
	Random r = new Random();
	int volume = r.nextInt(min, 1 + (max/multiple)) * multiple;
	System.out.println("The recommended volume would be " + volume + "!");
	}
}