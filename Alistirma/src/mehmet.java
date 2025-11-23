
public class mehmet {

	public static void main(String[] args) {
	/*	double toplam=5.70;
		for(double a=0.01;a<=5.70;a=a+0.01) {
			for(double b=0.01;b<=5.70-a;b=b+0.01) {
				double c=toplam -(a+b);
					if((Math.abs(a*b*c-toplam)<0.0001) ) {
						System.out.println("a= "+a+" b= "+b+" c= "+c+"= " +(a*b*c));
				}
			}
		} 
		*/
		  double targetSum = 5.70;
	        double targetProduct = 5.70;
	        
	        // Olası fiyatları 0.01'lik hassasiyetle deniyoruz
	        for (double x = 0.01; x <= 5.70; x += 0.01) {
	            for (double y = 0.01; y <= 5.70 - x; y += 0.01) {
	                double z = targetSum - (x + y);
	                
	                // Eğer çarpımları yaklaşık olarak 5.70 ise, sonucu yazdır
	                if (Math.abs(x * y * z - targetProduct) < 0.0001) {
	                    System.out.printf("Fiyatlar: %.2f, %.2f, %.2f%n", x, y, z);
	                    
	                }
	            }
	        }
	            
	            
		
	}

}
