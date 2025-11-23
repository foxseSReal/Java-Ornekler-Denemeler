
public class Quick_Sort {

	public static void main(String[] args) {
		/* Dizi belli bir noktaya göre 2'ye bölünür belirlernmiş noktadan küçük olanlar noktanın sol tarafına büyük olanlar sağ tarafına aktarılır.
		 * Sonrasında sağ ve sol taraf kendi içerisinde 2'ye bölünür.
		 * Yine belirlenmiş noktalardan küçük olanlar sola büyük olanlar sağ aktarılır.
		 * Bu işlem bölme noktasının solunda tek eleman kalana kadar devam eder. */
		//algortiması ödev
		
		int [] A= {7,90,5,74,36,65,42,81,1,96};
		QS(A,0,9);
		for(int k=0;k<10;k++)	System.out.println(A[k]);
	}
	public static void QS(int[] DIZI, int BS, int BT) {
				
		if(BS<BT) {
			int N =PARCALA(DIZI,BS,BT);
			QS(DIZI,BS,N-1);
			QS(DIZI,N+1,BT);
		}	
	}
		public static int PARCALA(int[] dizi, int bs, int bt) {
		int x =dizi[bt];
		int i=bs-1;
		for(int j=bs;j<bt;j++)
			if(dizi[j]<=x) {
				i++;
				int tmp=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=tmp;
			}
		int tmp2=dizi[i+1];
		dizi[i+1]=dizi[bt];
		dizi[bt]=tmp2;
		return i+1;
	}
	
	
}
