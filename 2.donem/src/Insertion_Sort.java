
public class Insertion_Sort {

	public static void main(String[] args) {
/*Eklemeli Sıralama(Insertion Sort)=Eklemeli Sıralama Dizinin sırayla ilk elemandan başlayarak sırayla
Sondan bir önceki elemanına kadar sırayla bu elemanların dizinin kalan diğer 
 elemanlarıyla karşılaştırması esasına dayanır */
		
		/*Algoritma= 
		 *1.Adım=Dizinin birinci elemanı en küçük kabul edilir.
		 *2.Adım=Birinci eleman dizinin diğer elemanları ile karşılaştırılır.
		 		*Kendinden daha küçük değerli eleman bulunursa yer değiştirilir.
		 *3.Adım=2.Elamandan n-1. elemana kadar 1 ve 2.adımlar tekrar edilir.  */
		
		int [] dizi= {10,60,1,8,58,11,9,45,61,66};
		int s;
		for(int i=0;i<dizi.length;i++) {
			for(int j=i+1;j<dizi.length-1;j++) {
				if(dizi[i]>dizi[j]) {
					s=dizi[j];
					dizi[j]=dizi[i];
					dizi[i]=s;
				}
			}
			System.out.println(dizi[i]);
		}
		
	}

}
