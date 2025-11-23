package Dönem_Ödevleri;

public class Cullen_Sayıları {

	public static void main(String[] args) {	
		System.out.println("   n"+"          Cullem   "+"     Asal mı?"+"\n______________________________________");
		  for (int n = 1; n <= 20; n++) {
	            int cln = n * (int) Math.pow(2, n) + 1;
	            int asal = AsalSor(cln); 
	            System.out.println(" n = " + n  + "           "+cln + "          " +( asal == 1 ? "Asal" : "Asal Değil"));
	            }
	}	  

	public static int AsalSor(int cln) {
        if (cln < 2) return 0;
        for (int i = 2; i <= Math.sqrt(cln); i++) {
            if (cln % i == 0) return 0; }
        return 1;
	}
	
}
