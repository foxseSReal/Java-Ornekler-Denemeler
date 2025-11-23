import java.util.Scanner;
public class Soru3 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		int [] dizi=new int[10];
		for(int i=0;i<=9;i++) {
			int N=a.nextInt();
			 	dizi[i]=N;
		}
		int eb=dizi[0];
		int ek=dizi[0];
		int eby=0;
		int eky=0;
		for(int k=1;k<=9;k++) {
			if(eb<dizi[k]) { /*Eb sayı eğer dizinin k. elemanından küçükse eb sayısı o elemana eşitlenir, eby=k nın değerini alır.*/
				eby=k;
				eb=dizi[k];
			}
			else if(ek>dizi[k]) { /*ek sayısı eğer dizinin k. elemanından büyükse ek sayısı o elemana eşitlenir, eby=k nın değerini alır.*/
				eky=k;
				ek=dizi[k];
			}
		}
		eky++; eby++;
		System.out.println("En Büyük Sayı="+eb+" Yeri="+eby+ ""+"  En Küçük sayı="+ek+"  "+"Yeri="+" "+eky);
		a.close();
	}
}