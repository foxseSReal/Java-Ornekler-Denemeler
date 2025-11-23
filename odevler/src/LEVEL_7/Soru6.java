package LEVEL_7;

public class Soru6 {

	public static void main(String[] args) {
		for(int i=1000;i<10000;i++) {
			int a=i*i;
			if((a)%10000==i) {
				System.out.println("i= "+i+"   i*i= "+i*i);
				if(Math.sqrt(a)==i) {
					System.out.println("i= "+i+"	 KAREKOK(i)= "+Math.sqrt(a));
				}	
			}
		}	
	}
}