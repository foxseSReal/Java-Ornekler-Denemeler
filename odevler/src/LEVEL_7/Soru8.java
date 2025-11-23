package LEVEL_7;

public class Soru8 {

	public static void main(String[] args) {
		for(float a=1;a<101;a++) {
			for(float b=1;b<101;b++){
				if(a+b==6*a/5) {
					System.out.println("a= "+a+" b= "+b+" Küçüğün Katı= "+(6*a/5)/b);
				}
			}		
		}
	}
}