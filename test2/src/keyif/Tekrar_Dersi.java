package keyif;
import java.util.Random;

public class Tekrar_Dersi {

	public static void main(String[] args) {
		// Zar 6-6 geldiğinde deneme sayısını veren algortimanın Java Kodları 
		int z1=0,z2=0,ds=0;
		Random r = new Random(); 
		
		while(z1!=6 || z2!=6)
		{
			z1=r.nextInt(6)+1;
			z2=r.nextInt(6)+1;
			System.out.println(z1+" - "+z2);
			++ds;
		}
		System.out.println(ds+" Denemede 6-6 geldi");
		
	}

}
