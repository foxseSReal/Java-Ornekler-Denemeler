package keyif;

public class yas_ort_dizi {
			
	public static void main(String[] args) {
		int yaslar[] = {20, 22, 10, 35, 48, 26, 87, 70};

		float ort, top = 0;

		int length = yaslar.length;

		for (int yas : yaslar) {
		  top += yas;
		}

		ort = top / length;
		System.out.println("Yaş Ortalaması: " + ort);
	}

}
