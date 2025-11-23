import java.util.*;
public class rastgele1000sayı {
	
	public static void main(String[] args) {
		
/*		int c;
		Random r =new Random();
		int [] dizi=new int [1000];
		for(int i=1;i<1001;i++) {
			for (int j=i+1;j<1000;j++)
			{
				dizi[i]=r.nextInt(10000);
				if(dizi[i]>dizi[j]) 
				{
					c=dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=c;
				}
			}
		}
		for(int k=1;k<1001;k++) {
			System.out.println(dizi[k]);
		}
		*/
		
											// Sıralaması
		int c;
		Random r = new Random();
		int [] dizi =new int [1000];
		for(int i =0;i<999;i++) {
			dizi[i]=r.nextInt(10000);
		}
		for(int x=0; x<=998;x++) {
			for(int y =x+1;y<999;y++) {
				if(dizi[x]>dizi[y])
				{
					c=dizi[x];
							dizi[x]=dizi[y];
							dizi[y]=c;
				}
			}
		}
		for(int k=0;k<999;k++) {
			System.out.println(dizi[k]);
		}
	}

}
