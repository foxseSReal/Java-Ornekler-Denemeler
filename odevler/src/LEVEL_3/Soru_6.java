package LEVEL_3;
import java.util.Scanner;
public class Soru_6 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazı = a.nextLine();
        a.close();
        
        int kordinat = 100;  
        int yazıu = yazı.length();
        int yer = (kordinat - yazıu)/2;

        if (yer > 0) {
            System.out.println(" ".repeat(yer) + yazı);
        } else {
            System.out.println(yazı); 
        }
	}

}
