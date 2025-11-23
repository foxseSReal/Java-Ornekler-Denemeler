package LEVEL_3;
import java.util.Scanner;
public class Soru_10 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
        StringBuilder cumle = new StringBuilder(); 
        System.out.println("Lütfen 10 adet yazı girin:");
        for (int i=0;i<10;i++) {
            System.out.print((i + 1) + ". yazı: ");
            String yazı = a.next();
            cumle.append(yazı).append(" "); 
        }
        System.out.println(cumle.toString()); 
        a.close();
	}

}