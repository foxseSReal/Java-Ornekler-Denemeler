package LEVEL_2_1;
import java.util.Scanner;
public class Soru_14 {

	public static void main(String[] args) {
		 System.out.print("Kaç terim yazdırma istiyorsunuz?");
		 Scanner a=new Scanner(System.in);
		 int x =a.nextInt();
		int s1=0;
		int s2=1;
		 System.out.print(s1+" "+s2+" ");
			for(int i=2;i<=x;i++) {
				int s3=s1+s2;
				s1=s2;
				s2=s3;
				System.out.print(s3+" ");
		}
		a.close();
		
		
		
	}

}
