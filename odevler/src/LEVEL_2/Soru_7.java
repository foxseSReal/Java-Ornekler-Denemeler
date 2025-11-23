package LEVEL_2;
import java.util.Scanner;

public class Soru_7 {
	 public static final String RESET = "\u001B[0m"; 
	 public static final String SARI = "\u001B[33m"; 	
	 public static final String MAVI = "\u001B[36m";
	 public static final String KIRMIZI = "\u001B[31m";
	 public static final String MAGENTA = "\u001B[35m";
	 public static final String YESIL = "\u001B[32m";
	public static void main(String[] args) {
		System.out.println(YESIL+"		Bir sayı girin."+RESET);
		
		Scanner a = new Scanner(System.in);
		int b=a.nextInt();
		int f=1;
		for(int i=b; i>1;i--) {
			f=f*i;
		}
			a.close(); 
		System.out.println(" "+SARI+b+MAVI+" Sayısının Faktöryeli= "+RESET +KIRMIZI+""+f+RESET);
	}

}
