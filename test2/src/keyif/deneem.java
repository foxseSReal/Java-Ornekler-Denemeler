package keyif;
import java.util.Scanner;
public class deneem {

	public static void main(String[] args) {
		System.out.println("Önce Satır Sonra Sütün Numarası girin!");
		Scanner a =new Scanner(System.in);
		int b=a.nextInt();
		int c=a.nextInt();
		int [][] matris = new int [3][3];
		do {
			if(b==1) {
				for(int i=0;i<3;i++) {
					matris[0][i]=1;
				}
			}
			else if(b==2) {
				for(int i=0;i<3;i++) {
					matris[1][i]=1;
				}
			}
			else if(b==3) {
				for(int i=0;i<3;i++) {
					matris[2][i]=1;
				}
			}
			if(c==1) {
				for(int i=0;i<3;i++) {
					matris[i][0]=1;
				}
			}
			else if(c==2) {
				for(int i=0;i<3;i++) {
					matris[i][1]=1;
				}
			}
			else if(c==3) {
				for(int i=0;i<3;i++) {
					matris[i][2]=1;
				}
			}
			for(int i=0;i<3;i++) {
				for(int k=0;k<3;k++) {
					System.out.print(matris[i][k]+" ");
				}
				System.out.println();
			}
			break;
		}while(b>=0&&c>=0);
		
		a.close();
	}
}