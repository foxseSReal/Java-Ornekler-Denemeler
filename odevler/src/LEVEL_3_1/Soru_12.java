package LEVEL_3_1;
import java.util.Scanner;	
public class Soru_12 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazi = a.nextLine();
        for (int i=0;i<yazi.length();i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(yazi.charAt(j) + "-" + (j + 1) + "-");
            }
            System.out.println();
        }
        			a.close();
	}	
}
