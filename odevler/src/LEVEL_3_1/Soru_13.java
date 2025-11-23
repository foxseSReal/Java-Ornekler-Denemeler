package LEVEL_3_1;

import java.util.Random;

public class Soru_13 {
	
	public static void main(String[] args) {
		Random a = new Random();
		int kordinat;
		String [] alfabe= {"A","B","C","D","E","F","G","H","K","L","M","N","X","Y","Z"};
		String [] renk= {SARI,MAVI,KIRMIZI,MAGENTA,YESIL};
	/*	for(int i=0;i<5;i++) {
			kordinat=a.nextInt(1,13);
			if(i<5) {
				System.out.print(renk[i]+dizi[kordinat]+" ".repeat(kordinat));
			}	*/
			int i;
			 for(int j=0;j<500;j++) {
				 i=a.nextInt(0,renk.length);
				 if(i<=2) {
						kordinat=a.nextInt(0,alfabe.length);
						System.out.print(renk[i]+alfabe[kordinat].toLowerCase()+" ".repeat(kordinat));
				 }
				 else {
					 	kordinat=a.nextInt(0,alfabe.length);
						System.out.print(renk[i]+alfabe[kordinat].toUpperCase()+" ".repeat(kordinat));
				 }
					
			 }
		//	System.out.println();
	}
	 public static final String SARI = "\u001B[33m"; 	
	 public static final String MAVI = "\u001B[36m";
	 public static final String KIRMIZI = "\u001B[31m";
	 public static final String MAGENTA = "\u001B[35m";
	 public static final String YESIL = "\u001B[32m";
}


