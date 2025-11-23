
public class booble_sort {

	public static void main(String[] args) {
		
//SINAVDA ÇIKACAK KESİN 	
		int [] dizi= {8,1,6,3,0};
		for(int i =0;i<dizi.length;i++) for(int j=i+1;j<dizi.length;j++) {
			if(dizi[i]<dizi[j]) {
				dizi[i]=dizi[i]+dizi[j];
				dizi[j]=dizi[i]-dizi[j];
				dizi[i]=dizi[i]-dizi[j];
			}
			
		}
		for(int x =0;x<dizi.length;x++) System.out.println(dizi[x]);
	}

}
