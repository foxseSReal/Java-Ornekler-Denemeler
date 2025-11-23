package LEVEL_7;

public class Soru4 {

	public static void main(String[] args) {
		
	/*	for (int i=2;i<10001;i++) {
            int toplam=0;
            for (int j=1;j<=i/2;j++) {
                if (i%j==0) toplam=toplam+j; }
            if (toplam==i) System.out.println(i+" Mükemmel bir sayıdır.");
		
		}	*/
		System.out.println("Şartı sağlayan sayılar:");

        for (int ab = 10; ab <= 99; ab++) {
            for (int cd = 10; cd <= 99; cd++) {
                int toplam = ab + cd;
                int kare = toplam * toplam;

                if (kare >= 1000 && kare <= 9999) {
                    String kareStr = String.valueOf(kare);
                    char[] rakamlar = kareStr.toCharArray();

                    // Rakamların hepsi farklı mı?
                    if (rakamlar[0] != rakamlar[1] &&
                        rakamlar[0] != rakamlar[2] &&
                        rakamlar[0] != rakamlar[3] &&
                        rakamlar[1] != rakamlar[2] &&
                        rakamlar[1] != rakamlar[3] &&
                        rakamlar[2] != rakamlar[3]) {

                        // Şimdi ab ve cd'nin rakamlarını da çıkaralım
                        int a = ab / 10;
                        int b = ab % 10;
                        int c = cd / 10;
                        int d = cd % 10;

                        // a, b, c, d hepsi birbirinden farklı mı?
                        if (a != b && a != c && a != d &&
                            b != c && b != d &&
                            c != d) {

                            // Rakamlar kare içinde de aynısı mı?
                            String kontrol = "" + a + b + c + d;
                            char[] kontrolSet = kontrol.toCharArray();
                            java.util.Arrays.sort(kontrolSet);
                            java.util.Arrays.sort(rakamlar);

                            if (java.util.Arrays.equals(kontrolSet, rakamlar)) {
                                System.out.println(kare + " = (" + ab + " + " + cd + ")^2");
                            }
                        }
                    }
                }
            }
        }
									
		
		
	}
}
