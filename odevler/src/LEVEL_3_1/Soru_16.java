package LEVEL_3_1;
import java.util.Scanner;
public class Soru_16 {

	public static void main(String[] args)  throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String yazi = scanner.nextLine();
        scanner.close();
        
        int bantGenisligi = 10;
        
        while (true) {
            for (int i = 0; i <= yazi.length() - bantGenisligi; i++) {
                System.out.print("\r" + yazi.substring(i, i + bantGenisligi));
                Thread.sleep(500); // 500 milisaniye bekle
            }
            for (int i=1;i<bantGenisligi;i++) {
            	System.out.print("\r" + yazi.substring(yazi.length()-bantGenisligi+i)+yazi.substring(0,i));
            	Thread.sleep(500);
            }
        }
	}
}
