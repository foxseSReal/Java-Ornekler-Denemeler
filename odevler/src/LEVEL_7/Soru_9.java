package LEVEL_7;

public class Soru_9 {

	public static void main(String[] args) {
		double toplam=5.70;
		for(double a=0.01;a<=5.70;a=a+0.01) {
			for(double b=0.01;b<=5.70-a	;b=b+0.01) {
				double c= toplam-a-b;
				if(Math.abs(a*b*c-toplam)<0.0001) {		
					//prinf formatında %.2f de ki f  float veya doubleı temsil eder ve 2 ise virgülden sonraki basamak sayısını
					System.out.printf("Fiyatlar: %.2f, %.2f, %.2f%n", a , b , c);
				}	
			}
		}
	}
}
