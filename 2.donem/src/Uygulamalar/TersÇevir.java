package Uygulamalar;

public class TersÇevir {

	public static void main(String[] args) {
		
		int [] dizi= {3,15,9,45,90,1};
		int [] tersdizi=new int [dizi.length];
		for(int i=0;i<dizi.length;i++) {
				int swap=dizi[i];
				dizi[i]=dizi[dizi.length-1-i];
				dizi[dizi.length-1-i]=swap;
		}
		for(int j=0;j<=dizi.length-1;j++) {
			System.out.print(tersdizi[j]+" ");
			
			
		}
	}

}
