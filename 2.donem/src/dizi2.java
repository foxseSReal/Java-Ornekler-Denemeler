import java.util.Arrays;

//import java.util.*;
public class dizi2 {
	
	public static void main(String[] args) {
		
		int [] puan= {85,90,67,92,16,8,46,76,35,23};
		Arrays.sort(puan);
		
	//	for(int i=0;i <10; i++) 	System.out.println(puan[i]);
		int c;
		for (int x =0;x<9;x++)
		{
			for(int y=x+1;y<10;y++)
			{
				if(puan[x]<puan[y]) 
				{
					c=puan[x];
					puan[x]=puan[y];
					puan[y]=c;
				}
				
			}
			
		}
		for(int i =0;i<10;i++) {
			System.out.println(puan[i]);
		}
	

}
}



