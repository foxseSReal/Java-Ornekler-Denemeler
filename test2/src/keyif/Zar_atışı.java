package keyif;
import java.util.Random;
public class Zar_atışı {
	public static void main(String[] args) {
		int z1=0,z2=0;
		Random r1 =new Random();
		Random r2 =new Random();
		
			z1=r1.nextInt(6)+1;
			z2=r2.nextInt(6)+1;

		System.out.println("1. ZAR: "+z1);
		System.out.println("2. ZAR: "+z2);
	}

}
