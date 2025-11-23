package Uygulamalar;

public class tersCevir2 {

	public static void main(String[] args) {
		int [] dizi= {3,15,9,45,90,1};
		int [] tersdizi=new int [dizi.length];
		for(int i=dizi.length-1;i>=0;i--) {
			tersdizi[dizi.length-i-1]=dizi[i];
		}
		for(int i=0;i<=dizi.length-1;i++) {
			dizi[i]=tersdizi[i];
			System.out.print(tersdizi[i]+" ");
		}
	}

}
