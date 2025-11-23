package LEVEL_4;

public class Soru3 {

	public static void main(String[] args) {
		// matris[0][0,1,2] yer değiş matris[0,1,2][0]
		int [][]Dmatris=new int [3][3];
		int [][] matris = 
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}		
			};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				Dmatris[j][i]=matris[i][j];
			}
		}
		for(int k=0;k<3;k++) {
			for(int l=0;l<3;l++) {
				System.out.print(Dmatris[k][l]+" ");
			}
			System.out.println();
		}

	}

}
