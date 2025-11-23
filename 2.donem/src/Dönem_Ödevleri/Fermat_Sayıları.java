package Dönem_Ödevleri;

public class Fermat_Sayıları {

	public static void main(String[] args) {
		System.out.print("Fermat Sayıları" + " \n -----------");
		for(int i=0;i<5;i++) {
			int frmt=(int) Math.pow(2,2*i)+1;
			System.out.println();
			System.out.println("Fermat Sayısıs= "+frmt);
		}
	}
}
