public class Soru1 {

	public static void main(String[] args) {
		/*10 dan 200 e kadar olan sayıların 3 katının 2 fazlasının 5 e tam bölünen halini bulalım*/
		for(int i=10;i<=200;i++) {
			int result=((i*3)+2)%5;
			if(result==0) {
				System.out.println("Sonuç= "+i);
			}
		}
	}
}