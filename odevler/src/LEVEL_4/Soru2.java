package LEVEL_4;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		System.out.println("1. Matris için 9 adet sayı girin");
		Scanner a=new Scanner(System.in);			
		int [][]sayı= new int [3][3];
		int [][]sayı2= new int [3][3];	
		int [][]toplam=new int [3][3];
		for(int i=0;i<3;i++) {						
			for(int j=0;j<3;j++) {					
				int n=a.nextInt();					
				sayı[i][j]=n;
			}
		}
		System.out.println("2. Matris için 9 adet sayı girin");				
		for(int f=0;f<3;f++) {						
			for(int r=0;r<3;r++) {					
				int n=a.nextInt();					
				sayı2[f][r]=n;
				toplam[f][r]=sayı[f][r]+sayı2[f][r];
			}
		}
		for(int y =0;y<3;y++) {
			for(int l=0;l<3;l++) {
				System.out.print(toplam[y][l]+" ");
			}
			System.out.println();
		}
		a.close();
	}
}
