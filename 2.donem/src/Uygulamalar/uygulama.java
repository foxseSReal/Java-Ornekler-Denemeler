package Uygulamalar;

public class uygulama {
		//en büyük sayıyı bulma
	public static void main(String[] args) {
		int [] dizi= {3,15,9,45,90,1};
		int enb = dizi[1];
			for(int i=2;i<dizi.length;i++) {
				if(enb<dizi[i]) {
					enb=dizi[i];
				}
			}
			System.out.println("En büyük dizi elemanı: "+enb);
	}
}
