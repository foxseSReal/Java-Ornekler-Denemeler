package LEVEL_7;

public class Soru3 {

	public static void main(String[] args) {
		for(double x =61;x<80;x++) {
			for(double y=101;y<110;y++) {
				for(double z=31;z<40;z++) {
					if(Math.pow(x,3)+Math.pow(y,3)==Math.pow(z,4)) {
						System.out.println("x= "+x+" y= "+y+" z= "+z);
					}
				}
			}
		}
	}
}
