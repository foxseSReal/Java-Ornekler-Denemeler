package LEVEL_2;
import java.util.Random;
public class Soru_11 {

	public static void main(String[] args) {
		  Random r = new Random();
	        System.out.println("	10 ile 20 arasında rastgele 20 sayı:");
	        for (int i = 0; i < 20; i++) {
	            int rsayi = r.nextInt(11) + 10;
	            System.out.print(rsayi + "-");
	        }
	}
}