package LEVEL_3;
import java.util.Scanner;
public class Soru_2 {

	public static void main(String[] args) {
		
		 Scanner a=new Scanner(System.in);
	        System.out.println("Bir Cümle Giriniz");
	        String cumle=a.nextLine();
	       
	        if (cumle.length()>=20){
	              String sol10 = cumle.substring(0, 10);
	              String sag10 = cumle.substring(cumle.length() - 10);
	              System.out.println("Soldan 10 karakter: " + sol10);
	              System.out.println("Sağdan 10 karakter: " + sag10);
	         } else{
	             System.out.println("Girilen cümle 20 karakterden kısa.");
	        }
	        a.close();
	}
}
