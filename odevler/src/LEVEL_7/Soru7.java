package LEVEL_7;

public class Soru7 {

	public static void main(String[] args) {
		
		for(int i =1;i<11;i++) {
			for(int j=1;j<11;j++) {
				int p=Math.abs((i-j)*(i+j));
				int asalSor=asal(p);
				if(asalSor==1) {
					System.out.println("i= "+i+" j= "+j+" sayı= "+p);
				}
			}
		}
	}
	public static int asal (int p) {
		if (p < 2) return 0;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) return 0; 
            }
        return 1;
	}
}
