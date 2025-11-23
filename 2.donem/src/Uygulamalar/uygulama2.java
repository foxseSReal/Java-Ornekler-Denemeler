package Uygulamalar;

public class uygulama2 {
		//en küçük sayıyı bulma
	public static void main(String[] args) {
		int [] dizi= {3,15,9,45,90,1};
		int enk = dizi[1];
			for(int i=2;i<dizi.length;i++) {
				if(enk>dizi[i]) {
					enk=dizi[i];
				}
			}
			System.out.println("En büyük dizi elemanı: "+enk);

	}

}
