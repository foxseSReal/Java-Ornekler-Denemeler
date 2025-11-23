package LEVEL_1;
import java.util.Scanner;
public class soru_4 {

	public static void main(String[] args) {
		
		for(int i=1;i<21;i++) {
			System.out.println(i+". sayıyı girin");
			Scanner a = new Scanner (System.in);
			int b=a.nextInt();
			 System.out.println("Girilen sayının karesi= "+b*b);
			 System.out.println("Girilen sayının kare kökü= "+Math.sqrt(b));
			 a.close();
		}
	
		
	}

}
