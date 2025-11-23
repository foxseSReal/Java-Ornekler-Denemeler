package LEVEL_4;
import java.util.Scanner;
public class Soru4 {

	public static void main(String[] args) {
		System.out.println("Önce Satır sonra sütün numarası girin");
		Scanner a =new Scanner(System.in);
		int str=a.nextInt();
		int stn=a.nextInt();
		int [][] matris=new int [3][3];
		/*	for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.println(matris[i][j]+" ");
				}
			}*/
			if(str==1) {
				for(int i=0;i<3;i++) matris[0][i]=1;
			}
			else if(str==2) {
				for(int i=0;i<3;i++) matris[1][i]=1;
			}
			else if(str==3){
				for(int i=0;i<3;i++) matris[2][i]=1;
			}
			if(stn==1) {
				for(int i=0;i<3;i++) matris[i][0]=1;
			}
			else if(stn==2) {
				for(int i=0;i<3;i++) matris[i][1]=1;
			}
			else if(stn==3){
				for(int i=0;i<3;i++) matris[i][2]=1;
			}
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++)System.out.print(matris[i][j]+" ");
				System.out.println();
			}
		a.close();
	}

}
