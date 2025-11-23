package LEVEL_7;

public class Soru2 {

	public static void main(String[] args) {
				
		for(int i=1;i<1000;i++) {
		if(i<10) {
				int sayı=(i*10)+202;
				if(i*83==sayı) {
					System.out.println("i="+i+" Sonuç="+i*83);
					break;
				}
			}
		else {
			int sayı2=(i*10)+20002;
			if(i*83==sayı2) {
				System.out.println("i="+i+" Sonuç="+i*83);
				break;
			}
		}
	}
}
}