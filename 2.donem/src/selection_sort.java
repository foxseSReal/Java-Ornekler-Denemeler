

public class selection_sort {

	public static void main(String[] args) {
		//Bir dizinin ilk indeks numarası min değerli indeks kabul edilir.
		//Selection.sort -- Seçim sıralaması
		
		int [] a= {7,9,21,11,23,3};
		
	int minA;
		for(int i=0;i<=a.length-2;i++) {
			minA=i;
			for(int j=i+1;j<=a.length-1;j++)  if(a[minA]>a[j]) minA=j;
			if(i!=minA) {
				a[i]=a[i]+a[minA];
				a[minA]=a[i]- a[minA];
				a[i]=a[i]-a[minA];
			}
			
		}
		
		for(int x=0;x<=a.length-1;x++) System.out.println(a[x]); 
	
		
		

	}

}
