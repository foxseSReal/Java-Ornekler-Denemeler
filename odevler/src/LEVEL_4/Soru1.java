package LEVEL_4;
import java.util.Scanner;
public class Soru1 {

	public static void main(String[] args) {
		System.out.println("9 adet sayı girin");
		Scanner a=new Scanner(System.in);			
		int [][]sayı= new int [3][3];				
		for(int i=0;i<3;i++) {						
			for(int k=0;k<3;k++) {					
				int n=a.nextInt();					
				sayı[i][k]=n;
			}
		}
		
		int str1=0, str2=0, str3=0, stn1=0, stn2=0, stn3=0;
		for(int c=0;c<3;c++) {
			 str1+=sayı[0][c];
			 str2+=sayı[1][c];
			 str3+=sayı[2][c];
			 stn1+=sayı[c][0];
			 stn2+=sayı[c][1];
			 stn3+=sayı[c][2];
		}
		System.out.println("Satır1="+str1+"  "+"Satır2="+str2+"  "+"Satır3="+str3);
		System.out.println("Sütun1="+stn1+"  "+"Sütun2="+stn2+"  "+"Sütun3="+stn3);
		a.close();
	}
}
