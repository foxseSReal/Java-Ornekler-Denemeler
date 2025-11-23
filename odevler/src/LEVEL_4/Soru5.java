package LEVEL_4;
import java.util.Scanner;
public class Soru5 {

	public static void main(String[] args) {
		int [][] sınav=new int[10][2];
		String [] isim=new String[10];
		String k="Kaldı";
		String g="Geçti";
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("İsim Soyisim girin");
			isim[i]=a.nextLine();
			System.out.println("Vize Notunu girin");
			sınav[i][0]=b.nextInt();
			System.out.println("Final Notunu girin");
			sınav[i][1]=b.nextInt();
			if(i==10) {
			a.close();
			b.close();
			}
		}
		for(int o=0;o<20;o++) {
			System.out.println();
		}
		System.out.println("Ad-soyad  Vize	 Final		?");
		for(int j=0;j<10;j++){
			if((sınav[j][0]*3)/10+(sınav[j][1]*7)/10<50) System.out.println(isim[j]+"	"+sınav[j][0]+"	   "+sınav[j][1]+"	  "+k);
			
			else if(sınav[j][1]<50) System.out.println(isim[j]+"  "+sınav[j][0]+"	"+sınav[j][1] +"	"+k);
			
			else System.out.println(isim[j]+"	"+sınav[j][0]+"	 "+sınav[j][1] +" 	"+g);
		}
		
	}
}