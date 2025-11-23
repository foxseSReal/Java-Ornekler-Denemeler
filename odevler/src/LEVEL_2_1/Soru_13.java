package LEVEL_2_1;

public class Soru_13 {

	public static void main(String[] args) {
			
		for (int i = 2; i <= 30; i++) {
            int sayac = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 2)   System.out.print(i + " ");
	}
	}
}


